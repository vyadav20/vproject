import java.util.Scanner;
import java.lang.ArithmeticException;
import java.lang.NumberFormatException;
public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x,y,z;
	
    Scanner scr=new Scanner(System.in);
     System.out.println("enter x=");
     x=Integer.parseInt(scr.nextLine());
     System.out.println("enter y=");
     y=Integer.parseInt(scr.nextLine());
  
     try{
     z=x/y;
     System.out.println(z);
     }
     catch(ArithmeticException ae)
     {
    	 System.out.println("enter non-Zero value for y");
     }
     catch(NumberFormatException nfe)
     {
    	 System.out.println("enter integer value only");
    	 
     }*/
		int x,y,z;
		Scanner scr=new Scanner(System.in);
		try
		{
			System.out.println("enter x=");
			x=Integer.parseInt(scr.nextLine());
		    System.out.println("enter y=");
		    y=Integer.parseInt(scr.nextLine());
		    
		      try
		      {
		    	  z=x/y;
		    	  System.out.println(z);
		      }
		      catch(ArithmeticException ae)
		      {
		    	  System.out.println("enter non-zero value for y");
		      }
		}
		catch(NumberFormatException nfe)
		{
			 System.out.println("enter integer value only");
		}
	}

}
