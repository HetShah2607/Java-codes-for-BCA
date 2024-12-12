import java.util.Scanner;

public class code12
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("How many values you want to enter in the array:");
		int arraycount = sc.nextInt();

		int[] array = new int[arraycount];

		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter array element "+i+" : ");
			array[i] = sc.nextInt();
		}

		System.out.println("Array elements in the reverse order:");

		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println("element "+i+" : "+array[i]);
		}
	}
}