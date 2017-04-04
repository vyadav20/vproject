import java.util.Scanner;
public class NPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr =new Scanner(System.in);
		System.out.println("enter the number=");
		int n=scr.nextInt();
		
		while(n>2)
		{
			if(n%2!=0)
			{
				System.out.println("prime number"+n);
			}
			else
			{System.out.println("not a prime number"+n);}
			n--;
		}
		}
	}
		
	


