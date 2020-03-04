package assignment;

class Employee
{
	int id;String name;float Salary;
	void insert(int i,String nam,float Sal)
	{
		id=i;name=nam;Salary=Sal;
	}
	void display()
	{
		System.out.println(id +" "+name +" "+Salary);
	}
}

public class TestEmployee 
{
	public static void main(String args[])
	{
		Employee s1=new Employee();
		Employee s2=new Employee();
		Employee s3=new Employee();
		
		s1.insert(1, "hari", 1111);
		s2.insert(2, "sree", 2222);
		s3.insert(3, "krish", 3333);

		s1.display();
		s2.display();
		s3.display();
	}
}
