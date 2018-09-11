/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.nio.CharBuffer;
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

            double fahrenheit = celsius * 9.0 / 5.0 + 32;                     //Convert celsius to fahrenheit.
            StringBuilder line = new StringBuilder(String.valueOf(celsius));  //Create a new instance of a StringBuilder with the string value of celsius as the initial value.

            //Determine the number of spaces between the two values. There are 22 spaces from start left to end right. Subract the length of each value to get the number of spaces.
            int numberOfSpaces = 22 - String.valueOf(celsius).length() - String.valueOf(fahrenheit).length();
            line.append(CharBuffer.allocate(numberOfSpaces).toString().replace('\0', ' ')).append(fahrenheit); //Append the number of spaces and the fahrenheit value.
            
            System.out.println(line.toString());    //Finally print the line.
        }
    }
}
