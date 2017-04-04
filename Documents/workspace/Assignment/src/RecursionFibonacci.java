import java.util.Scanner;

public class RecursionFibonacci {

	public static void main(String[] args) 
	{
	  Scanner scr=new Scanner(System.in);
	  System.out.println("Enter the number :");
	  int n=scr.nextInt();
	 int a,b=1,c;
	 
	 for(a=0;a<n;a++)
	 {
		 c=a+b;
		 System.out.println(c);
		 a=b;
		 b=c;
	 }
	}

}
