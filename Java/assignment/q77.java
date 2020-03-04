package assignment;
import java.util.Scanner;

class q77  
{
	public static void main(String[ ] args)
		{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the letter");
		
		char letter= obj.next().charAt(0);

		if(letter=='a' || letter=='A'|| letter=='e'|| letter=='E'|| letter=='i' || letter=='I' || letter=='o'|| letter=='O'|| letter=='u'|| letter=='U') 
			{
				System.out.println("vowel");
			}
		else
			{
				System.out.println("consonant");
			}
		}
}