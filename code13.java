import java.util.Scanner;

public class code13
{

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		int[][] sumMatrix = new int[3][3];
		
		System.out.println("Enter the array elements for the 1st 3*3 matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Element ["+i+"] ["+j+"]");
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the array elements for the 2nd 3*3 matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Element ["+i+"] ["+j+"]");
				matrix2[i][j] = sc.nextInt();
			}
		}

		//sum of two matrixs
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		System.out.println("The sum of two matrixs:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(sumMatrix[i][j] + "");
			}
		}

		sc.close();

	}
}