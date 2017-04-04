import java.util.Scanner;
class X
{
	static int i;
	Scanner scr=new Scanner(System.in);
	 static int arr1[]=new int[3];
	 
	 { 
 for(i=0;i<3;i++)
 {
	 System.out.println("enter elements of first array:");
	 arr1[i]=scr.nextInt();
	 System.out.println( );
 }
	 }

}
class Y extends X
{
  static int arr2[]=new int[3];
  {
 for(i=0;i<3;i++)
 {
	 System.out.println("enter elements for second array:");
	 arr2[i]=scr.nextInt();
	 System.out.println( );;
 }
}
}

class Z extends Y
{
 static int arr3[]=new int[3];
 {
	 System.out.println("subtraction result is:");
 for(i=0;i<3;i++)
 {
	arr3[i]=arr1[i]-arr2[i] ;

	System.out.println(arr3[i]);
 }
 }
}
public class ArraySubtraction  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Z z=new Z();
      
      
	}

}
