//Dante (Thong) Nguyen
//Assignment 1 MinMaxAvg Program
//Final Revision 
package is3806assuno;
//Import Packages
import java.util.*;
import java.io.*;

public class MinMaxAvg {
    public static void showMessage() throws IOException
    {
        //Variables
        float input=0; //Inputs
        float min=0; //Minimum Number
        float max=0; //Maximum Number
        float total=0; //Total
        float count=0; //Count
        float tony=0; //Temporary

        
        //Prompt
        System.out.println("\nEnter a string of numbers");
        
        //Start BufferedReader
        BufferedReader bobby;
        bobby = new BufferedReader(new InputStreamReader(System.in));
        String line = bobby.readLine();
        
        //Start Tokenizer
        StringTokenizer token = new StringTokenizer(line);
        tony = Float.parseFloat(token.nextToken());
        min = tony;
        
        if(tony>max)
        {
            max=tony;
        }
            count++;
            total = tony + total;
        //While Loop     
            while(token.hasMoreTokens())
            {
                input = Float.valueOf(token.nextToken());
                if(input<min)
                {
                    min=input;
                }
                if(input>max)
                {
                 max=input;   
                }    
                    count++;
                    total = input + total;
                    
            }
    //Output
    float avg = total/count;        
    System.out.println("Minimum value: " + min + "\nMaximum value: " + max + "\nAverage is: " + avg);                                      
    }
}

