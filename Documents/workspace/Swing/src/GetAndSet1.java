import java.util.Scanner;

class First {
	private String name="varsha";
	private int id=23;
	private double sal=7.6;
	
	public void setName(String newname)
	{this.name=newname;}
	public String getName()
	{return name;}
	
	public void setId(int newId)
	{id=newId;}
	public int getId()
	{return id;}
	
	public void setSal(double newSal)
	{sal=newSal;}
	public double getSal()
	{return sal;}
}

public class GetAndSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		  First f=new First();
		  System.out.println(f.getName());
		  System.out.println(f.getId());
		  System.out.println(f.getSal());
		  System.out.println();
		  System.out.println("Name= ");
		  String name=scr.nextLine();
		  f.setName(name);
		  System.out.println("Id= ");
		  int id=scr.nextInt();
		  f.setId(id);
		  System.out.println("Salary= ");
		  double sal=scr.nextDouble();
		  f.setSal(sal);
		  System.out.println();
		  System.out.println(f.getName());
		  System.out.println(f.getId());
		  System.out.println(f.getSal());
	}

}
