/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.nio.CharBuffer;
import java.util.Scanner;

public class Assignment5_5 extends AbstractAssignment {

    public Assignment5_5() {
        super("5.5");
    }

    @Override
    public void print(Scanner scanner) {
        System.out.println("Celsius     Fahrenheit   |   Fahrenheit     Celsius");  //Print header.
        for (int celsius = 0; celsius <= 100; celsius++) {                          //Loop from 0-100(inclusive) celsius.
            if (celsius % 2 == 1) {
                continue; //Skip the value if it is an uneven number.
            }
            
            StringBuilder line = new StringBuilder(String.valueOf(celsius));  //Instance of StringBuilder.

            //Add left side.
            String fahrenheitString = String.format("%.3f", celsius * 9.0 / 5.0 + 32);                                                              //Get the Fahrenheit value as a String.
            line.append(getSpaces(22 - String.valueOf(celsius).length() - fahrenheitString.length())).append(fahrenheitString).append("   |   ");   //Append spaces and Fahrenheit.

            //Add right side.
            int fahrenheit = 20 + celsius / 2 * 5;                                                                                                  //Get left side fahrenheit value.
            String celsiusString = String.format("%.3f", (fahrenheit - 32.0) / (9.0 / 5.0));                                                        //Calculate the celsius from fahrenheit and get the formatted String.
            line.append(fahrenheit).append(getSpaces(22 - String.valueOf(fahrenheit).length() - celsiusString.length())).append(celsiusString);     //Append Fahrenheit, spaces, and celsius.

            System.out.println(line.toString());    //Finally print the line.
        }
    }

    /**
     * Return a String with the given number of spaces.
     *
     * @param numberOfSpaces the number of spaces the String should contain.
     * @return a String containing 'numberOfSpaces' spaces.
     */
    private String getSpaces(int numberOfSpaces) {
        return CharBuffer.allocate(numberOfSpaces).toString().replace('\0', ' ');
    }
}
