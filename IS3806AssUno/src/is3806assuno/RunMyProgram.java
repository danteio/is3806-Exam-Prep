//Dante (Thong) Nguyen
//Assignment 1 Menu Program
//Final Revision 
package is3806assuno;
//Import Packages
import java.io.IOException;
import java.util.Scanner;

//Class
public class RunMyProgram 
{
    //Main
    public static void main (String arg[]) throws IOException
    {
        RunMyProgram roberto = new RunMyProgram();
        roberto.menu();
    }
    //Menu method
    public void menu () throws IOException
    {
        //Call Scanner
        Scanner stanly = new Scanner(System.in);
        int selector;
        
        //Menu Stuff
        do
        {
            System.out.println("\nPlease choose from the following menu: ");
            System.out.println("1.Multiplier \n2.Twelver \n3.Min Max Avgerager \n4.Grader \n5.Exit ");
            
            selector = stanly.nextInt();
            if(selector==1)
            {
                Multi.showMessage();
            }
            else if (selector==2)
            {
                Twelver.showMessage();
            }
            else if (selector==3)
            {
                MinMaxAvg.showMessage();
            }
            else if (selector ==4)
            {
                Grader.showMessage();
            }
            else if (selector ==5)
            {    
                System.exit(0);
            }
            else
            {
                System.out.println("Input not recognized son. Do try again");
            }
        }
        while(true);
        
    }
    
}
