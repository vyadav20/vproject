import java.util.ArrayList;
import java.util.Scanner;
class Upper
{
	 private ArrayList<String> al=new ArrayList();
	 public ArrayList<String> getAl()
	 {return al;}
	 void dis()
	 {System.out.println(al);}
}


public class GetAndSet2  {
	 
	public static void main(String[] args) {
		Upper gs=new Upper();
	   gs.getAl().add("abc");
	   gs.getAl().add("def");
	   gs.getAl().add("ghi");
	   gs.dis();
     
	}

}
