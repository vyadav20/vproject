import java.util.Scanner;

public class Palindrome {
//Palindrome is to print the given number in reverse order. 
	//currently the output is just 0  for any given number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 int n,b,c,d=0;
	      Scanner scr=new Scanner(System.in);
	    	System.out.println("Enter the number\n");
	    	n=scr.nextInt();
	    	b=n;
	    	while(b>n)
	    	{
	    		c=b%10;
	    		d=(d*10)+c;
	    		b=b/10;
	    	}System.out.println(d);

	}

}
