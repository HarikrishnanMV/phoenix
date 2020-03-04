package my_java;

//FunctionalInterface
interface MyFunctionalInterface
{
	//a method with no parameter
	public String sayHello(String x);
}
public class Test3
{
	public static void main(String args[])
	{
		//lambda expression
		MyFunctionalInterface msg=(String str) ->
		{
			return str;
	};
		System.out.println(msg.sayHello("Harikrishnan"));
	}
}
