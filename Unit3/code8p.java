import java.util.Scanner;

public class code8p
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer value:");
		int value = sc.nextInt();

		String binary = Integer.toBinaryString(value);
		String octal = Integer.toOctalString(value);

		System.out.println("Original value : "+value);
		System.out.println("Octal value : "+octal);
		System.out.println("Binary value : "+binary);
		
	}
}