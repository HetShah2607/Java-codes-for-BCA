public class code10
{
	public static void main(String args[])
	{
		int number = 1;

		for(int i=1;i<=10;i++)
		{
			number = 1 << i;
			System.out.println("2^"+i+"="+number);
		}
	}
}