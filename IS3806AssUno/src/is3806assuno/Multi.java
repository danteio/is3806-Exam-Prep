//Dante (Thong) Nguyen
//Assignment 1 Multiplier Program
//Final Revision 
package is3806assuno;

//Import Packages
import java.io.*;
import java.util.*;

public class Multi {

    public static void showMessage() throws IOException
    {
        //Variables
        float input; //User Inputs
        float tony=1; //Temporary Number Holder
        double total; //Total after Multiplication
        String erbell; //Token String
        
        //Prompt
        System.out.println("/nEnter a string of positive numbers. (Negatives will be ignored); 0 to exit");
        System.out.println("");
        
        //Start BufferedReader
        BufferedReader bobby;
        bobby = new BufferedReader(new InputStreamReader(System.in));
        String line = bobby.readLine();
        
        //Start StringTokenizer
        StringTokenizer token = new StringTokenizer(line);
        input = Float.valueOf(token.nextToken());
        
        //Multiplier Code
        if(input==0)
        {
            System.out.print("Exiting");
            System.exit(0);
        }
        while(input!=0)
        {
            if(input>0)
            {
                tony = input * tony;
            }
            else if(input<0)
            {
                System.out.println(input + "is ignored.");
            }
        input = Float.valueOf(token.nextToken());
        }
        
        //Output
        erbell = Float.toString(tony);
        total = Double.parseDouble(erbell);
        System.out.println("Your total is " + total);
        
    }
}
