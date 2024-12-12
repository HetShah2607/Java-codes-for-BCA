//code 4 pack 2 file
package MULPACKAGE;

public class mulPack
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
		int mul = num1 * num2;
		System.out.println("the mul is :"+mul);
	}

}