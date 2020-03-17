package bean;

public class IBean 
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "I am " + name + " of inner bean.";
	}

}
