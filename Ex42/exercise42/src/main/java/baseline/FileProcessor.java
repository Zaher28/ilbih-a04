package baseline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

    //method that reads in the file line by line to later separate into necessary values
    public List<String> getInputFromFile(){

        File input = null;
        List<String> info = new ArrayList<>();

        //try catch block for FileNotFoundException
        try{

            input = new File("data/exercise42_input.txt");
            Scanner scanFile = new Scanner(input);

            while(scanFile.hasNextLine()){
                //adds all strings to the list
                info.add(scanFile.nextLine());


            }

            scanFile.close();

        }catch(Exception e){

            System.out.println("File not found!");

        }

        return info;

    }
    //method that takes a list of CSV and separates the information compactly
    public List<String> processInformation(List<String> info){


        List<String> processedInfo = new ArrayList<>();

        for (String s : info) {
            int j = 0;
            String temp = "";
            //gets first word before ,
            while (s.charAt(j) != ',') {

                temp += s.charAt(j);
                j++;
            }
            //adds first word to list
            processedInfo.add(temp);
            j++;

            temp = "";
            //gets second word before ,
            while (s.charAt(j) != ',') {

                temp += s.charAt(j);
                j++;
            }
            //adds second word to list
            processedInfo.add(temp);
            j++;
            //finally adds whats left of string to list
            processedInfo.add(s.substring(j));

        }


        return processedInfo;
    }

    //method that displays the information in a nicely formatted table
    public void displayInformation(List<String> processedInfo){

        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");

        for(int i=0;i<processedInfo.size();i+=3){

            System.out.printf("%-10s%-10s%-10s%n", processedInfo.get(i), processedInfo.get(i+1), processedInfo.get(i+2));

        }

    }

}
