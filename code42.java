import java.io.*;

public class code42
{
	public static void main(String args[])
	{
		if(args.length != 3)
		{
			System.out.println("Only 3 values are required !");
			return;
		}

		try
		{
			int m1 = Integer.parseInt(args[0]);
			int m2 = Integer.parseInt(args[1]);
			int m3 = Integer.parseInt(args[2]);

			if((m1>0 && m1<=100) && (m2>0 && m2<=100) && (m3>0 && m3<=100))
			{
				if(m1>=40 && m2>=40 && m3>=40)
				{
					System.out.println("Pass");
					System.out.println("Percentages :"+((m1+m2+m3)*100)/300);
				}
				else
				{
					System.out.println("Fail");
				}
			}
			else
			{
				System.out.println("Please provide value under 0 to 100 range!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}