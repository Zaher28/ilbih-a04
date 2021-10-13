/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.util.List;

public class Solution41 {


    /*
    Create a program that reads in the following list of names from a file called
     `exercise41_input.txt` and sorts the list alphabetically:

    Ling, Mai
    Johnson, Jim
    Zarnecki, Sabrina
    Jones, Chris
    Jones, Aaron
    Swift, Geoffrey
    Xiong, Fong

    Then print the sorted list to a file called `exercise41_output.txt`
    that looks like the following example output.
     */




    //main method
    public static void main(String[] args){
        //NameSorter object to call methods
        NameSorter ns = new NameSorter();
        List<String> names = ns.getInputFromFile();
        names = ns.organizeNames(names);
        ns.printOutSortedNamesToFile(names);

    }

}
