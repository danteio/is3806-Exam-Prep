/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is3806.HomeworkThree;

import java.util.*;
/**
 *
 * @author Dante
 */
public class whichfloor {
    public static void main(String[] arg)
    {

        System.out.println("Pleasue us a phone extension");
        Scanner kbdInput = new Scanner(System.in);
        int telephone_number;
	telephone_number = kbdInput.nextInt();
        switch (telephone_number)
	{
	  case 6279:
	  case 6127:{
			System.out.println("This is on the 2nd floor of CCB");
			break;
		    }
	  case 6520:{
			System.out.println("This is on the 3rd floor of CCB");
			break;
		    }
	  default:  {
			System.out.println("Invalid Telephone Number");
			break; //not required
		    }

        }
    }
}

