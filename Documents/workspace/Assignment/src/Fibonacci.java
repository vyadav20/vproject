
public class Fibonacci 
{
 public static void main(String arr[])
 {
	 int a=0,b=1,c,n=10;
	 System.out.println(a);
	 System.out.println(b);
	 for(a=0;a<n;a++)
	 {
		 c=a+b;
		 System.out.println(c);
		 a=b;
		 b=c;
	 }
 } 
}
