import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Scanner scr=new Scanner(System.in);
       float p,r,t,si;
       System.out.print("enter P=");
       p=scr.nextFloat();
       System.out.print("enter R=");
       r=scr.nextFloat();
       System.out.print("enter T=");
       t=scr.nextFloat();
       si=(p*r*t)/100;
       System.out.println("Simple Interest is="+si);
	}

}
