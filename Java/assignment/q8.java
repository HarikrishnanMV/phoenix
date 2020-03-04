package assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q8
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
ArrayList<Integer> al1=new ArrayList<Integer>();
ArrayList<Integer> al2=new ArrayList<Integer>();
ArrayList<Integer> ans=new ArrayList<Integer>();

System.out.println("Enter the elements of the first ArrayList:");
for(int i=0;i<5;i++)
al1.add(obj.nextInt());

System.out.println("Enter the elements of the second ArrayList:");
for(int j=0;j<5;j++)
al2.add(obj.nextInt());

ans=Main1.answer(al1,al2);
System.out.println("The elements at the 2nd,6th and 8th position are:");
for(int k=0;k<3;k++)
System.out.println(ans.get(k));
}
}

class Main1 {
public static ArrayList<Integer> answer (ArrayList<Integer> al1, ArrayList<Integer> al2)
{
al1.addAll(al2);
Collections.sort(al1);
ArrayList<Integer> ans=new ArrayList<Integer>();
ans.add(al1.get(2));
ans.add(al1.get(6));
ans.add(al1.get(8));
return ans;
}
 }