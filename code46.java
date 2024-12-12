class EvenThread extends Thread{
	int lower,up;

	EvenThread(int x,int y)
	{
		lower = x;
		up = y;
	}

	public void run()
	{
		try
		{
			for(int i=lower;i<up;i++)
			{
				if(i%2==0)
				{
					Thread.sleep(1000);
					System.out.println("Even number :"+i);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class OddThread extends Thread{
	int lower,up;

	OddThread(int x,int y)
	{
		lower = x;
		up = y;
	}

	public void run()
	{
		for(int i=lower;i<up;i++)
		{
			if(i%2 != 0)
			{		
				System.out.println("Odd number :"+i);
			}
		}
	}
}

public class code46
{
	public static void main(String []M)
	{
		int lower = Integer.parseInt(M[0]);
		int up = Integer.parseInt(M[1]);

		EvenThread e1 = new EvenThread(lower,up);
		OddThread o1 = new OddThread(lower,up);

		e1.start();
		o1.start();

		try
		{
			e1.join();
			o1.join();
		}
		catch(Exception e)
		{}

		System.out.println("\n \n Both threads completed!");
	}
}