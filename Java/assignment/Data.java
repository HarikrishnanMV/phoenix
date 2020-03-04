package assignment;
class Data
{
	int id;
	String name;
	
	void insertR(int i,String nam)
	{
		name=nam;
		id=i;
		
	}
	void display()
	{System.out.println(id +" "+name);
	}
	
}
class Student 
{
	public static void main(String args[])
	{
		Data s1=new Data();
		Data s2=new Data();
		
		s1.insertR(1,"haryjj");
		s2.insertR(2,"ghv");
		
		s1.display();
		s2.display();
		
	}

}
