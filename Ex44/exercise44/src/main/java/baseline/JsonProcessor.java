/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;
//library to convert Java objects to JSON and vice-versa
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;


public class JsonProcessor {


    //method that will parse the information on the JSON file
    public String parseJSONFile(){

        JsonReader jsonReader;
        try{
            jsonReader = new JsonReader(new FileReader("./data/exercise44_input.json"));
            jsonReader.beginObject();

            while(jsonReader.hasNext()){

                String name = jsonReader.nextName();

            }

        }catch(Exception e){
            System.out.println("Sorry, an error happened!");
        }





    }
    //method that will search for a product name and retrieve its information
    public void searchForItem(){

    }






}
