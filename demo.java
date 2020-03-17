package mybeans;
import java.io.Serializable;
public class demo implements Serializable
{
	private String empno;
	private Name name;
	public demo() {this("111","Ravi","Shankar");}
	public demo(String e,String f,String l)
	{
		empno=e;
		name =new Name(f,l);
	}
	public void setEmpno(String empno) {this.empno=empno;}
	public void setName(Name n) {this.name=n;}
	public String getEmpno() {return empno;}
	public Name getName() {return name;}
	

}
