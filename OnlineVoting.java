import java.util.*;
import java.math.*;
public class OnlineVoting
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int Akshaya=0,Amulya=0,Joshna=0,Yasaswini=0;
		int maxA=0,maxB=0;
		System.out.println("Please Enter your name:");
		String username=s.nextLine();
		System.out.println("Please enter your age:");
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println("Please enter the candidate number whom you want to vote");
			System.out.println("1.Akshaya 2.Amulya 3.Joshna 4.Yasaswini");
			int selection=s.nextInt();
			if(selection==1)
			{
				Akshaya++;
			}
			else if(selection==2)
			{
				Amulya++;
			}
			else if(selection==3)
			{
				Joshna++;
			}
			else
			{
				Yasaswini++;
			}
			System.out.println("Thank you for casting your vote!");
		}
		else
		{
			System.out.println("Sorry, you are not eligible for voting");
		}
		System.out.println("Akshaya: "+Akshaya+" votes");
		System.out.println("Amulya: "+Amulya+" votes");
		System.out.println("Joshna: "+Joshna+" votes");
		System.out.println("Yasaswini: "+Yasaswini+" votes");

	}
}
		