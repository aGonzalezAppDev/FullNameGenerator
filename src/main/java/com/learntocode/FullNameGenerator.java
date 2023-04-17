package com.learntocode;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // prompt user for name
        System.out.println("Please enter your name");
        System.out.println("First Name: ");
        String firstName = myScanner.nextLine();
        System.out.println("Middle Name: ");
        String middleName = myScanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = myScanner.nextLine();
        System.out.println("Suffix: ");
        // print comma before suffix if there is one
        
        String suffix = myScanner.nextLine();

        // create array
        String [] myList = {firstName, middleName, lastName, suffix};
        // format
        System.out.println(Arrays.toString(myList).replace(",", "").replace("[", "").replace("]",""));

    }
}
