//Dante (Thong) Nguyen
//Assignment 1 Grader Program
//Final Revision 
package is3806assuno;
//Import Package
import java.util.*;
import java.io.*;

public class Grader 
{
    public static void showMessage() throws IOException
    {
        int input; //Inputs
        int sumA=0; //A grades
        int sumB=0; //B grades
        int sumC=0; //C grades
        int sumD=0; //D grades
        int sumF=0; //F grades
        int sumI=0; //Invalid grades
        int count=0; //Counter
        
        //Prompt
        System.out.println("\nEnter collection of grades; -99 to exit");
        
        BufferedReader bobby;
        bobby = new BufferedReader(new InputStreamReader(System.in));
        String line = bobby.readLine();
        
        StringTokenizer token = new StringTokenizer(line);
        input = Integer.parseInt(token.nextToken());
        
        if(input==-99) 
        {
        System.out.println("Exiting"); 
        System.exit(0);
        } 

        System.out.println("");
        System.out.println("");
        //Start Loopy
        while(input !=-99)
        {
            if(input>100)
            {
                sumI++;
                System.out.println(input + "ignored. Invalid score");
            }
            else if(input>=90)
            {
                sumA++;
                System.out.println("Score " + input + "is A");     
            }
            else if(input>=70)
            {
                sumB++;
                System.out.println("Score " + input + "is B");     
            }        
            else if(input>=50)
            {
                sumC++;
                System.out.println("Score " + input + "is C");     
            }        
            else if(input>=35)
            {
                sumA++;
                System.out.println("Score " + input + "is D");     
            }        
            else if(input>=0)
            {
                sumA++;
                System.out.println("Score " + input + "is F");     
            }        
            else
            {
                sumI++;
                System.out.println(input + "ignored. Invalid score");
            }
        
        count = (sumA+sumB+sumC+sumD+sumF+sumI)%10;
        if(count ==0)
        {
                System.out.println("\nPress Enter to Continue...");
 
                bobby = new BufferedReader(new InputStreamReader(System.in));
                line = bobby.readLine();

        }

            input = Integer.parseInt(token.nextToken());
        }
        if(count!=0)
        {
        System.out.println("\nPress Enter for Grade Summary");
        
        bobby = new BufferedReader(new InputStreamReader(System.in));
        line = bobby.readLine();
        }

        System.out.println("There are " + sumA +" As");
        System.out.println("There are " + sumB +" Bs");
        System.out.println("There are " + sumC +" Cs");
        System.out.println("There are " + sumD +" Ds");
        System.out.println("There are " + sumF +" Fs");
    } 
} 
    
       
 
