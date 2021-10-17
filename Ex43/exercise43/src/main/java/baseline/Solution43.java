package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Solution43 {

    /*
    Create a program that generates a website skeleton with the following specifications:

    Prompt for the name of the site.
    Prompt for the author of the site.
    Ask if the user wants a folder for JavaScript files.
    Ask if the user wants a folder for CSS files.
    Generate an index.html file that contains the name of the site
        inside the <title> tag and the author in a <meta> tag.
     */


    //function that generates a website skeleton based on a few specifications
    public void generateWebsiteSkeleton(){

        System.out.print("Site name: ");
        String siteName = scan.nextLine();

        System.out.print("Author: ");
        String author = scan.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        String javaScript = scan.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        String css = scan.nextLine();

        String web = "./website/";

        try{
            //creates directories for the html file
            if(new File(web +siteName).mkdirs()){

                System.out.println("Created " +web + siteName);
            }
            //creates the actual html file
            File website = new File(web +siteName + "/index.html");
            if(website.createNewFile()){

                System.out.println("Created "+ web + siteName + "/" + website.getName());
                FileWriter wr = new FileWriter(website);
                wr.write("<html><title>"+ siteName +"</title>\n");
                wr.write("<meta>"+ author + "</meta> </html>");
                wr.close();
            }

            if((javaScript.equals("y") || javaScript.equals("Y")) && new File(web +siteName + "/js").mkdir()){


                    System.out.println("Created " + web + siteName + "/js/");



            }

            if((css.equals("y") || css.equals("Y")) && new File(web +siteName + "/css").mkdir()){


                System.out.println("Created " + web + siteName + "/css/");



            }





        }catch(Exception e){
            System.out.println("Sorry! An error happened.");
        }

    }

    //scanner objet for input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){

        Solution43 sol = new Solution43();
        sol.generateWebsiteSkeleton();


    }

}
