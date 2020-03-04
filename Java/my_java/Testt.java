package my_java;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.*;

public class Testt 
{
  public static void main(String[] args)throws Exception
   {
	String s="pw2.java";
	String s1="pw1.java";
	int i;
	FileInputStream fis=new FileInputStream(s1);
	FileOutputStream bw=new FileOutputStream(s,false);
	fis.skip(3);
	while((i=fis.read())!=-1)
	{
	bw.flush();
	bw.write(i);
	}
	bw.close();fis.close();
   }
}
