//code 4 main file

import SUMPACKAGE.sumPack;
import MULPACKAGE.mulPack;

public class code4p
{
	public static void main(String args[])
	{
		sumPack obj1 = new sumPack();
		obj1.setdata(10,20);
		obj1.calc_Data();

		mulPack obj2 = new mulPack();
		obj2.setdata(10,20);
		obj2.calc_Data();
	}
}