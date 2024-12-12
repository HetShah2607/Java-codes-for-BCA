import java.io.*;

class OddException extends Exception
{
	public OddException(String str)
	{
		super(str);
	}
}

public class code45
{
	public static void main(String args[])
	{
		int n;
		int count =0;

		for(int i=0;i<args.length;i++)
		{
			try
			{
				n=Integer.parseInt(args[i]);

				if(n%2==0)
				{
					System.out.println("The number is even :"+n);
				}
				else
				{
					count++;
					throw new OddException("\n The number is odd "+n);
				}
			}
			catch(OddException e)
			{
				System.out.println("\n "+e);

			}
		}

		System.out.println("Invalid numbers count :"+count);
	}
}