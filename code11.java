import java.util.Arrays;

public class code11
{

	public static void bubblesort(int[] array)
	{

		int n = array.length;

		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	public static void main(String args[])
	{

		if(args.length == 0)
		{
			System.out.println("Please provide array elements as arguments!");

		}

		int[] array = new int[args.length];

		try
		{
			for(int i=0;i<args.length;i++)
			{
				array[i] = Integer.parseInt(args[i]);

			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please provide valid integer values!");
		}

		bubblesort(array); // Arrays.sort(array); used inbuilt method

		System.out.println("Sorted array : "+Arrays.toString(array)); 
	}
}