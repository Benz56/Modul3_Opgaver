/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.util.Scanner;

public class Assignment5_5 extends AbstractAssignment {

    public Assignment5_5() {
        super("5.5");
    }

    @Override
    public void print(Scanner scanner) {
        System.out.println("Celsius     Fahrenheit   |   Fahrenheit     Celsius");  // Print header.
        for (int celsius = 0; celsius <= 100; celsius++) {                          // Loop from 0-100(inclusive) celsius.
            if (celsius % 2 == 1) {
                continue; // Skip the value if it is an uneven number.
            }

            int fahrenheit = 20 + celsius / 2 * 5;                                            // Get right side fahrenheit value.
            String fahrenheitString = String.format("%.3f", celsius * 9.0 / 5.0 + 32);        // Get the Fahrenheit value as a String.
            String celsiusString = String.format("%.3f", (fahrenheit - 32.0) / (9.0 / 5.0));  // Fahrentheit -> Celsius -> formatted String.

            //Print the formatted table row.
            System.out.printf("%-7s        %7s   |   %-7s        %7s%n", celsius, fahrenheitString, fahrenheit, celsiusString);
        }
    }
}
