/*Write a java program to scan 3 integer values from the command line argument and display the maximum number using conditional
operator.*/

public class code4
{
	public static void main(String args[])
	{
		//it check that provided command line arguments are 3 or not
		if(args.length != 3)
		{
			System.out.println("Please provide exact three integer numbers!");
		}

		//parse or converts the command line arguments into integer values
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);

		//using the conditional operator to check that which number is the maximum number
		int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

		//it will return the maximum number among these 3 numbers
		System.out.println("The maximun number is :"+max);
	}
}