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
public abstract class AbstractAssignment {

    private final String assignmentName;

    /**
     * Constructor assigning the assignmentName to a field.
     *
     * @param assignmentName is the name of the assignment of the superclass.
     */
    public AbstractAssignment(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * Getter for getting the name of the assignment.
     *
     * @return the assignment name.
     */
    public String getAssignmentName() {
        return assignmentName;
    }

    /**
     * Abstract method to be implemented by the superclass.
     *
     * @param scanner for reading input in each individual assignment.
     */
    public abstract void print(Scanner scanner);
}
