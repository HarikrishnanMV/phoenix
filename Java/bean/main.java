package bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("bean/applicationContext.xml");
		HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorldBean");
		System.out.println(helloWorld);
	}

}
