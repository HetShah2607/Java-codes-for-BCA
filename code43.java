import java.io.*;

class AgeException extends Exception
{
	public AgeException(String str)
	{
		System.out.println(str);
	}
}

public class code43
{
	public static void main(String args[])
	{
		int n = args.length;

		int[] age = new int[n];

		int sum_age = 0;

		int average;

		try
		{
			for(int i=0;i<n;i++)
			{
				age[i] = Integer.parseInt(args[i]);

				sum_age = sum_age + age[i];
			}

			average = sum_age / n;
			System.out.println("Average age of persons is :"+average);


			for(int i=0;i<n;i++)
			{
				if(age[i]<1 || age[i]>100)
				{
					throw new AgeException(age[i] + " is invlid age!");
				}
				else
				{
					System.out.println(age[i] + " is valid age!");
				}
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Your input is not a number!"+ e.getMessage());
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
	}
}