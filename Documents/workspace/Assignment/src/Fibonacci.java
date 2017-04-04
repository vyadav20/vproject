
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
//Please see  the difference in expected out put and actual out put. align the actual output to expected output
/*Expected out put :
    0
F1	1
F2	1
F3	2
F4	3
F5	5
F6	8
F7	13
F8	21
F9	34
*/

/*current output
0
1
1
3
5
9
15
*/
