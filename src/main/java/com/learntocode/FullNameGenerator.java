package com.learntocode;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // prompt user for name
        System.out.println("Please enter your name");
        System.out.println("First Name: ");
        String firstName = myScanner.nextLine().trim();
        System.out.println("Middle Name: ");
        String middleName = myScanner.nextLine().trim();
        // print middle name trimmed with dot
        if (!middleName .isEmpty()) {
            System.out.println(middleName.charAt(0) + ".");
        }

        System.out.println("Last Name: ");
        String lastName = myScanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = myScanner.nextLine().trim();
        // print comma before suffix if there is one
        if (!suffix.isEmpty()) {
            suffix += ",";
        }

        // create array
        String [] myList = {firstName, middleName, lastName, suffix};
        // format
        System.out.println(Arrays.toString(myList).replace(",", "").replace("[", "").replace("]",""));

    }
}
