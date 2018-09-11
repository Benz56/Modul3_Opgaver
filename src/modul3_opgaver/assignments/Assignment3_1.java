/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.util.Scanner;
import modul3_opgaver.ScannerUtil;

public class Assignment3_1 extends AbstractAssignment {

    public Assignment3_1() {
        super("3.1");
    }

    @Override
    public void print(Scanner scanner) {
        double a = ScannerUtil.getDouble(scanner, "Input a value for a!");
        double b = ScannerUtil.getDouble(scanner, "Input a value for b!");
        double c = ScannerUtil.getDouble(scanner, "Input a value for c!");
        double discriminant = Math.pow(b, 2) - 4 * a * c;           //Calculate the discriminant.

        Double root1 = null, root2 = null;                          //Initialize doubles. Using objects to assign null for latter checks.
        if (discriminant >= 0) {                                    //Check if the discriminant is greater than or equal to 0.
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);       //If it is calculate the first root.
            if (discriminant > 0) {                                 //Check if the discriminant is greater than 0.
                root2 = (-b - Math.sqrt(discriminant)) / (2 * a);   //If it is calculate the second root.
            }
        }

        //Nested ternaries evaluating which of the roots where calculated. The nested ternaries will return the appropriate answer/string.
        String numberOfRoots = root1 == null || root2 == null ? root1 == null ? "no real roots" : "one root " + String.format("%.6f", root1) : "two roots: " + String.format("%.6f", root1) + " and " + String.format("%.6f", root2);
        System.out.println("The equation has " + numberOfRoots + ".");
    }
}
