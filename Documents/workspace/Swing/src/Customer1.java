import java.util.ArrayList;
import java.util.Scanner;

public class Customer1 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		ArrayList<Customer> al=new ArrayList();
		Customer c=new Customer();
		int no=0,i,j;
		System.out.println("enter arraylist length=");
		no=scr.nextInt();
		for( i=0;i<no;i++)
		{
			System.out.println("number=");
			int num=scr.nextInt();
			c.setNum(num);
			System.out.println("age=");
			int age=scr.nextInt();
			c.setAge(age);
			al.add(c);
		}
		for(j=0;j<al.size();j++)
		{
		System.out.println(al);
		break;
		}
		}
         
	}


