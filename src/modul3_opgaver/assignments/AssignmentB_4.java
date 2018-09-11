/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.util.Arrays;
import java.util.Scanner;
import modul3_opgaver.ScannerUtil;

public class AssignmentB_4 extends AbstractAssignment {

    public AssignmentB_4() {
        super("b.4");
    }

    @Override
    public void print(Scanner scanner) {
        // Get an input from the console. If the value isn't between 1-12(inclusive) continue.
        Integer monthNumber;
        do {
            monthNumber = ScannerUtil.getInteger(scanner, "Please input a number between 1 and 12");
        } while (monthNumber < 1 || monthNumber > 12);

        //Check which array contains the monthNumber and print the message.
        if (Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(monthNumber)) {
            System.out.println(" There are 31 days in month " + monthNumber + ".");
        } else if (Arrays.asList(4, 6, 9, 11).contains(monthNumber)) {
            System.out.println(" There are 30 days in month " + monthNumber + ".");
        } else { //Only 2 left
            System.out.println(" There are 28(29 in a leap year) days in month " + monthNumber + ".");
        }
    }
}
