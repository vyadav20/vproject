import java.util.Scanner;
public class PrimeNumberBetweenXandY 
{
	public static void main(String arr[])
	{
		int x,y,a;
		Scanner scr=new Scanner(System.in);
		System.out.print("X=");
		x=scr.nextInt();
		System.out.print("Y=");
	    y=scr.nextInt();
	    a=x;
	    while(a<y)
	    {
	           if(a%2!=0)
	            {System.out.println(a+"is a prime number");}
	           else
	            {System.out.println(a+"is not a prime number");}
	          a++; 
	    	
	    }
	}

}
