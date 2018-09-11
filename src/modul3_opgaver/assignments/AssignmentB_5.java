/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver.assignments;

import java.util.Scanner;

public class AssignmentB_5 extends AbstractAssignment {

    public AssignmentB_5() {
        super("b.5");
    }

    @Override
    public void print(Scanner scanner) {
        int lastPrimeNumber = 0;
        for (int i = 2; i < 1_000_000; i++) {   // Loop from 2 - 999.999 (2 is the smallest prime number)
            if (isPrimeNumber(i)) {             // If i is not a prime number assign the value.
                lastPrimeNumber = i;            // Set the lastPrimeNumber to the value of i (which is a prime number)
            }
        }
        System.out.println(" The largest prime number smaller than 1 million is " + lastPrimeNumber);
    }

    /**
     * Determine if the value is a prime number.
     *
     * @param value is the number to be checked.
     * @return whether or not the value is a prime number.
     */
    private boolean isPrimeNumber(int value) {
        //Algorithm for determining if the value is a prime number.
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
