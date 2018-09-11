/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.util.Scanner;

public class Assignment5_3 extends AbstractAssignment {

    public Assignment5_3() {
        super("5.3");
    }

    @Override
    public void print(Scanner scanner) {
        System.out.println("Celsius     Fahrenheit");       //Print header.
        for (int celsius = 0; celsius <= 100; celsius++) {  //Loop from 0-100(inclusive) celsius.
            if (celsius % 2 == 1) {
                continue; //Skip the value if it is an uneven number.
            }

            double fahrenheit = celsius * 9.0 / 5.0 + 32; // Convert celsius to fahrenheit.

            //Print the formatted table row.
            System.out.printf("%-7s        %7s%n", celsius, String.format("%.2f", fahrenheit));
        }
    }
}
