/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.util.Scanner;
import java.util.stream.Stream;
import modul3_opgaver.ScannerUtil;

public class Assignment2_7 extends AbstractAssignment {

    public Assignment2_7() {
        super("2.7");
    }

    @Override
    public void print(Scanner scanner) {
        int minutes = ScannerUtil.getInteger(scanner, "Input a minute value:");  // Get the console input
        int years = minutes / 525_600;                                           // Divide the console input with the number of minutes per year to get years.
        int remainingDays = minutes % 525_600 / 1_440;                           // Get the remaining minutes using modulos and divide by number of minutes per day to get the number of remaning days.
        Stream.of("The number of minuts test converted to years and days are:", " Years: " + years, " Days: " + remainingDays).forEach(line -> System.out.println(line));
    }
}
