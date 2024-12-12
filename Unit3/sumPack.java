//code 4 pack 1 file

package SUMPACKAGE;

public class sumPack
{
	private int num1;
	private int num2;

	public void setdata(int a,int b)
	{
		num1 = a;
		num2 = b;
	}

	public void calc_Data()
	{
		int sum = num1 + num2;
		System.out.println("the sum is :"+sum);
	}

}