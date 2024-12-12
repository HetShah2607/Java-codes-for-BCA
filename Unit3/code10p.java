//default capacity is 16 
//"Hello", the initial capacity is 16 + 5 = 21. 


import java.util.Scanner;

public class code10p
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String userinput = sc.nextLine();


		// Create a StringBuilder object with the user's input
		StringBuffer sb = new StringBuffer(userinput);

		// Display the initial capacity of the StringBuilder
		System.out.println("Initial Capacity : "+sb.capacity());

		// Ask the user to enter a new string to append
		System.out.println("Enter an another string:");
		String stringtoappend = sc.nextLine();

		// Append the new string to the StringBuilder
		sb.append(stringtoappend);

		// Display the capacity after appending
		System.out.println("Capacity after appending:"+sb.capacity());

		sc.close();

	}
}