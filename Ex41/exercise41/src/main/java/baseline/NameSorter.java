package baseline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

                names.add(scanFile.nextLine());
            }

            scanFile.close();

        }catch(Exception e){

            System.out.print("File not found!");

        }

        ;

        return names;


    }
    //method that takes a list of names and organizes them by alphabetical order
    public List<String> organizeNames(List<String> names){



        return names;
    }

}
