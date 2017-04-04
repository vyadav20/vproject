//reverse of a given number

class Main
{
 public static int a,b,i,c=0,n;
 static
 {
	 a=234;
 }
 
 void rev()
 {
	 System.out.println("the given number is  "+a);
	 n=a;
	 while(n>0)
	 {
		b=n%10;
		c=(c*10)+b;
		n=n/10;
		System.out.println(c);
	 }
	 
 }
}


public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Main m=new Main();
       m.rev();
       //System.out.println("the given number is   "+a);
       //System.out.println();
	}

}
