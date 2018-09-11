/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_opgaver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import modul3_opgaver.assignments.*;

/**
 *
 * @author Benjamin Staugaard | Benz56
 */
public class Modul3_Opgaver {

    private final List<AbstractAssignment> assignments = new ArrayList<>();     //List containing all assignments.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modul3_Opgaver modul3_Opgaver = new Modul3_Opgaver();   //Create an instance of our "Main" class.
        modul3_Opgaver.loadAnswers();                           //Load the answers by putting them in the above list.
        modul3_Opgaver.start();                                 //Start the console input while loop.
    }

    /**
     * Load all assignment answers into the assignments list.
     */
    private void loadAnswers() {
        assignments.add(new Assignment2_7());
        assignments.add(new Assignment3_1());
        assignments.add(new Assignment5_3());
        assignments.add(new Assignment5_5());
        assignments.add(new Assignment5_7());
        assignments.add(new AssignmentB_1());
        assignments.add(new AssignmentB_4());
        assignments.add(new AssignmentB_5());
    }

    /**
     * Start the console input loop.
     */
    private void start() {
        System.out.println("Hello! Please input an assignment to show the result for.");
        System.out.println("Assignments: 2.7, 3.1, 5.3, 5.5, 5.7, B.1, B.4, B.5");
        Scanner scanner = new Scanner(System.in);                                                                               //Get an instance of the Scanner object.
        while (true) {                                                                                                          //Start the while loop.
            String input = scanner.next();                                                                                      //Read the input from the console.
            if (Stream.of("end", "stop", "kill", "shutdown").anyMatch(predicate -> predicate.equalsIgnoreCase(input))) {        //Check if the input matches any of the words in the Stream. If true then stop.
                System.out.println("Ending program!");
                break;
            }
            if (printOf(input, scanner)) {                                                                                      //Try to print the input assigment.
                Stream.of("", "", "", "Input another assignment name to view the result").forEach(s -> System.out.println(s));  //Print this if the assignment name was valid.
            } else {
                Stream.of("", "", "", "Not a valid assignment!").forEach(s -> System.out.println(s));                           //Print this if the assignment name was not valid.
            }
        }
        scanner.close();
    }

    /**
     * Print the result of the given input from the scanner.
     *
     * @param input is the assignment name.
     * @param scanner is the global scanner object used.
     * @return whether or not an assignment with the given name was found.
     */
    private boolean printOf(String input, Scanner scanner) {
        //Check if an assignment with the given name is valid and return it else null.
        AbstractAssignment matchingAssignment = assignments.stream().filter(predicate -> predicate.getAssignmentName().equalsIgnoreCase(input)).findFirst().orElse(null);
        if (matchingAssignment != null) {
            matchingAssignment.print(scanner); //Print the assignment if the input is valid.
        }
        return matchingAssignment != null; //Return whether or not the assignment was found.
    }
}
