/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.util.Scanner;

/**
 *
 * @author Benjamin Staugaard | Benz56
 */
public class Assignment5_7 extends AbstractAssignment {

    public Assignment5_7() {
        super("5.7");
    }

    @Override
    public void print(Scanner scanner) {
        double initialTuition = 10_000;              // The initial tuition.
        double fourYearTuition = 0;                  // The variable in which we will be storing the tuition of year 11, 12, 13, and 14.
        for (int year = 0; year < 14; year++) {      // Loop 14 years.
            initialTuition *= 1.06;                  // Increment the inititalTuition by 6%.
            if (year == 9) {                         // If the year is 9(tenth year) print the intital tuition value.
                System.out.println(" In ten years the tuition is $" + String.format("%.2f", initialTuition));
            } else if (year > 9) {                   // If the year is greate than 9(after the tenth year) add the initialTuition to the fourYearTuition.
                fourYearTuition += initialTuition;
            }
        }
        System.out.println(" The cost of four years tuition after the tenth year is $" + String.format("%.2f", fourYearTuition));
    }
}
