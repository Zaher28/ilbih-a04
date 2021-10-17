/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileProcessor {

    //method that processes an input file into a Map with the frequency of each word
    //returns the Map
    public Map<String,Integer> processFile(){
        //map that will be returned
        Map<String,Integer> freq = new TreeMap<>();
        File file;
        StringBuilder temp= new StringBuilder();
        try{
            //open file and read from it
            file = new File("./data/exercise46_input.txt");
            Scanner scan = new Scanner(file);
            String[] arr;
            while(scan.hasNextLine()){
                //make one big string
                temp.append(scan.nextLine());

            }
            //separate words into this array
            arr = temp.toString().split(" ");


            //put words into Map with their frequencies
            for(String word: arr){


                if(!freq.containsKey(word)){
                    freq.put(word,1);
                }
                else{
                    freq.replace(word, freq.get(word)+1);
                }

            }

            scan.close();
        }catch(Exception e){

            System.out.println("Sorry, an error happened!");

        }



        return freq;
    }
    //method that takes in a map of values and their frequencies and displays a histogram
    public void printOutFrequencies(Map<String,Integer> mp){

        int freq;
        String tempKey;


        while(mp.size()!=0){
            freq=-1;
            tempKey="";
            StringBuilder freqStars= new StringBuilder();
            for(Map.Entry<String,Integer> entry: mp.entrySet()){

                if(freq< entry.getValue())
                {
                    freq = entry.getValue();
                    tempKey= entry.getKey();
                }


            }

            freqStars.append("*".repeat(Math.max(0, freq)));

            System.out.printf("%-10s %-10s%n",tempKey,freqStars.toString());
            mp.remove(tempKey);
        }



    }










}
