package baseline;

import java.io.File;
import java.util.List;

public class Solution42 {

    /*
    Construct a program that reads in the following data file
     (you will need to create this data file yourself; name it `exercise42_input.txt`):

    Ling,Mai,55900
    Johnson,Jim,56500
    Jones,Aaron,46000
    Jones,Chris,34500
    Swift,Geoffrey,14200
    Xiong,Fong,65000
    Zarnecki,Sabrina,51500

    Process the records and display the results formatted as a table, evenly spaced,
    as shown in the example output.

    Last      First     Salary
    --------------------------
    Ling      Mai       55900
    Johnson   Jim       56500
    Jones     Aaron     46000
    Jones     Chris     34500
    Swift     Geoffrey  14200
    Xiong     Fong      65000
    Zarnecki  Sabrina   51500
    */

    //main method
    public static void main(String[] args){

        //FileProcessor object to call its methods
        FileProcessor fp = new FileProcessor();
        List<String> info = fp.getInputFromFile();
        info = fp.processInformation(info);

        fp.displayInformation(info);


    }

}
