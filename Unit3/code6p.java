import java.util.Scanner;

public class code6p
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String userInput = sc.nextLine();

		if(ValidateString(userInput))
		{
			System.out.println("The string is valid!");
		}
		else
		{
			System.out.println("The string is not valid!");
		}
	}

	public static Boolean ValidateString(String str)
	{
		if(str.length() < 5)
		{
			return true;
		}
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				return true;
			}
		}
		return false;
	}
}
