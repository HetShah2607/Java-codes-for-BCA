import java.util.Scanner;

public class code5p
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string:");
		String input = sc.nextLine();


		System.out.println("Characters in reversed order!");
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.println(input.charAt(i));
		}

		System.out.println("Count of characters and their positions:");
		for(int i=0;i<input.length();i++)
		{
			System.out.println("Position :"+(i+1)+" Character :"+input.charAt(i));
		}
		System.out.println("Total count:"+input.length());

		System.out.println("palindrom stats:");
		String reversed = new StringBuilder(input).reverse().toString();
		if(input.equals(reversed))
		{
			System.out.println("Palindrome!");
		}
		else
		{
			System.out.println("Not Palindrome!");
		}

		double uppercase = 0;
		double lowercase = 0;

		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);

			if(Character.isUpperCase(ch))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowercase++;
			}
		}

		System.out.println("Uppercase count :"+uppercase);
		System.out.println("lowercase count :"+lowercase);

		sc.close();
	}
}