//Dante (Thong) Nguyen
//Assignment 1 Twelver Program
//Final Revision 
package is3806assuno;

//Import Packages
import java.util.*;
import java.io.*;

public class Twelver 
{
    public static void showMessage() throws IOException
    {
        //Variables
        int input=0; //User inputs 
        int first=0; //First index instance of 12
        int last=0; //Last index instance of 12
        int counter=0; //Count index
        int twelves=0; //Number of 12s
        
        //Message Prompt
        System.out.println("\nEnter a string of whole numbers.");
        System.out.println("This app will tell you the first and last instance of 12 a.\nIt also tells you the sequence.");
        
        //Start Buffered Reader br;
        BufferedReader buffy;
        buffy = new BufferedReader(new InputStreamReader(System.in));
        String line = buffy.readLine();
        
        //Start StringTokenizer
        StringTokenizer token = new StringTokenizer(line);
        
        //Stuff Doer 
        while(token.hasMoreTokens())
        {
               input = Integer.parseInt(token.nextToken());
               counter++;
               
               if(first==0)
               {
                    if(input== 12)
                    {
                        first = counter;
                        last = counter;
                        twelves++;    
                    }
                    
               }
               else
               {
                   if(input==12)
                   {
                       twelves++;
                       last = counter;
                   }
               
               }
        }
        if(first!=0)
        {
            System.out.println("The first instance of 12 is located at index " + first);
            System.out.println("The last instance of 12 is located at index " + last);
            System.out.println("You entered 12s " + twelves + " times");
        }
        else 
        {
        System.out.println("The first instance of 12 is located at index " + first);
        }
        
        
        
                
        
                
    }
    
}
