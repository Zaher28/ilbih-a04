/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileProcessor {

    //parameter to keep all words of the text file
    private final List<String> words = new ArrayList<>();

    //method that goes through the File and takes it into an arrayList of words
    //It then replaces every instance of 'utilize' with 'use'
    public void processFile(){
        String[]  spacedOutWords;
        FileReader fr = null;
        BufferedReader bfr=null;

        try{
            File f = new File("./data/exercise45_input.txt");
            fr = new FileReader(f);
            bfr = new BufferedReader(fr);

            String temp;

            while((temp= bfr.readLine())!= null){

                spacedOutWords = temp.split(" ");

                words.addAll(Arrays.asList(spacedOutWords));



            }

            for(int i=0;i<words.size();i++){

                if (words.get(i).contains("utilize")){

                    if(words.get(i).equals("utilizes"))
                        words.set(i,"uses");
                    else{
                        words.set(i,"use");
                    }
                }



            }

            bfr.close();
            fr.close();


        }catch(Exception e){
            System.out.println("Sorry, an error happened !\n");
        }




    }


    //method that takes in the name of the output file and writes to that file
    public void writeToFile(String fileName){

        try{
            File file = new File("./data/" + fileName + ".txt");

            if(file.createNewFile()){

                FileWriter fw = new FileWriter("./data/" + fileName + ".txt");
                for (String word : words) {

                    fw.write(word);
                    fw.write(" ");

                }

                fw.close();
            }





        }catch(Exception e){
            System.out.println("Sorry, an error happened!\n");
        }



    }

}
