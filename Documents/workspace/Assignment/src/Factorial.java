import java.util.Scanner;
public class Factorial {

	public static void main(String[] args)
	{ 
		Scanner scr=new Scanner(System.in);
		System.out.println("enter value");
		int n=scr.nextInt();
		//int a=n*n;//for 1 only
		//int a=n*(n-1);//for 2
		//int a=n*(n-1)*(n-2);//for 3
		//int a=n*(n-1)*(n-2)*(n-3);//for 4
		for(int a=0;a<n;a++)
		{
			n=(n-1);
		System.out.println(n);
		}
	}

}
