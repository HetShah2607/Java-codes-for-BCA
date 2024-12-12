import java.util.Scanner;

public class code9p
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String inputString = sc.nextLine();

		while(true)
		{
			System.out.println("Menu : ");
			System.out.println("1.Display the string in uppercase");
			System.out.println("2.Display the string in lowercase");
			System.out.println("3.check for equality with another string");
			System.out.println("4.Display a substring from the string");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();

			switch(choice)
			{
				case 1:
					System.out.println("Converted to uppercase : "+inputString.toUpperCase());
					return;
				case 2:
					System.out.println("Converted to lowercase : "+inputString.toLowerCase());
					return;
				case 3:
					System.out.println("Enter another string:");
					String comparestring = sc.nextLine();

					if(inputString.equals(comparestring))
					{
						System.out.println("the strings are equal");
					}
					else
					{
						System.out.println("the strings are not equal");
					}
					return;
				case 4:
					System.out.println("Enter the starting index : ");
					int start = sc.nextInt();
					System.out.println("Enter the endinfg index : ");
					int end = sc.nextInt();

					if(start>=0 && end<=inputString.length() && start<end)
					{
						System.out.println("Substring : "+inputString.substring(start,end));
					}
					else
					{
						System.out.println("Invalid indices");
					}
					return;
				case 5:
					System.out.println("Exiting...");
					return;
				default:
					System.out.println("Invalid choice , please try again.");
					return;
			}
		}
	}
}