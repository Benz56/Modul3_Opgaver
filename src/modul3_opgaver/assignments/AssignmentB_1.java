/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.util.Scanner;

public class AssignmentB_1 extends AbstractAssignment {

    public AssignmentB_1() {
        super("b.1");
    }

    @Override
    public void print(Scanner scanner) {
        System.out.println("Printing areas:");
        for (int radius = 1; radius <= 5; radius++) {
            System.out.println(" Radius " + radius + " equals an area of: " + String.format("%.2f", Math.PI * Math.pow(radius, 2)));
        }
    }
}
