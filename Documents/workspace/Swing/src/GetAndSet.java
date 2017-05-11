class Emp
{
 private String name="abc";
 private int id=45;
 double sal=70000;
 
 public String getName()
 {return this.name;}
 public void setName(String newName)
 {this.name=newName;}
 
 public double getSal()
 {return this.sal;}
 public void setSal(double newSal)
 {this.sal=newSal;}
 
 public int getID()
 {return this.id;}
 public void setId(int newId)
 {this.id=newId;}
 
 void dis()
 {
	 System.out.println(name);
	 System.out.println(id);
	 System.out.println(sal);
 }
}

public class GetAndSet 
{
	public static void main(String[] args) 
	{
		String name="xyz";
		int  id=24;
		double sal=950000;
		Emp e=new Emp();
		e.setId(id);
		e.setName(name);
		e.setSal(sal);
		e.dis();
	}

}


