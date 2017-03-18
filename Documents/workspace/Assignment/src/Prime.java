import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Scanner scr=new Scanner(System.in);
       System.out.println("enter the number");
    		   int n=scr.nextInt();
		
       if(n>1 && n%2!=0)
       {System.out.println("yes a prime number ");}
       else
       {System.out.println("not a prime number");}
	}

}
