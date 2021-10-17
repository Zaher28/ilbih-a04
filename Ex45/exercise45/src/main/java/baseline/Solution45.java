/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.util.Scanner;

public class Solution45 {


    /*
    There will be times when you'll need to read in one file, modify it,
    and then write a modified version of that file to a new file.

    Given an input file named `exercise45_input.txt`,
    read the file and look for all occurrences of the word utilize.
    Replace each occurrence with use. Write the modified file to a new file.
    */


    //scanner object for input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){

        FileProcessor sol = new FileProcessor();
        sol.processFile();
        System.out.print("What is the name of the output file? ");
        String fileName = scan.nextLine();
        sol.writeToFile(fileName);


    }


}
