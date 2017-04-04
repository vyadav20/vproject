import java.util.Scanner;
public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i   ;   
       Scanner scr=new Scanner(System.in);
       int arr1[]=new int[3];
       for(i=0;i<3;i++)
       {
    	   System.out.println("enter elements");
    	   arr1[i]=scr.nextInt();
       }
       int arr2[]=new int[3];
       for(i=0;i<3;i++)
       {
    	   System.out.println("enter second array elements ");
    	   arr2[i]=scr.nextInt();
       }
       int arr3[]=new int[3];
       for(i=0;i<3;i++)
       {   
       arr3[i]=arr1[i]+arr2[i];
       System.out.println(arr3[i]);
       }
       
	}
}
