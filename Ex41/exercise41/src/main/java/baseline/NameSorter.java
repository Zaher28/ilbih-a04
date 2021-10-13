/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;


import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.*;

public class NameSorter {

    //Method that attains all the names in the input file and returns the list
    //filled with the names
    public List<String> getInputFromFile(){

        File input = null;
        List<String> names = new ArrayList<>();

        //try catch for FileNotFoundException
        try{

            input = new File("data/exercise41_input.txt");
            Scanner scanFile = new Scanner(input);

            while(scanFile.hasNextLine()){
                //adds all strings to the list
                names.add(scanFile.nextLine());
            }

            scanFile.close();

        }catch(Exception e){

            System.out.print("File not found!");

        }



        return names;


    }
    //method that takes a list of names and organizes them by alphabetical order
    public List<String> organizeNames(List<String> names){
        //sorts 'names' alphabetically
        Collections.sort(names);
        return names;

    }

    //method that prints out a list of sorted names to a file
    public void printOutSortedNamesToFile(List<String> sortedNames){

        Writer wr;

        try{

            wr = new FileWriter("data/exercise41_output.txt");

            for(String name: sortedNames){

                wr.write(name + "\n");

            }

            wr.flush();
            wr.close();

        }catch(Exception e){

            System.out.println("File not found!");

        }

    }

}
