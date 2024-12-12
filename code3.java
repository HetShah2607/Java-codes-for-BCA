/*A car accessories shop assigns code 1 to seat covers, 2 to steering wheel covers , 3 to car lighting and 4 for air purifiers.
All other items have code 5 or more.While selling the goods, a sales tax of 2% to seat covers ,3% to steering wheel covers, 4% to
car lighting, 2.5% to air purifiers and1.2% for all other items is charged. A list containing the product code and price is given
for making a bill. Write a java program using switch statements to prepare a bill.*/

import java.util.Scanner;

public class code3
{
	private static double get_tax_rate(int productcodes)
	{
		switch(productcodes)
		{
			case 1:
				return 2.0;
			case 2:
				return 3.0;
			case 3:
				return 4.0;
			case 4:
				return 2.5;
			default:
				return 1.2;
		}
	}
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of item:");
		int itemcount = sc.nextInt();

		int[] productcodes = new int[itemcount];
		double[] prices = new double[itemcount];

		//fetching the product code and price from the user
		for(int i=0;i<itemcount;i++)
		{

			System.out.println("Enter the product code of item "+(i+1)+ ": ");
			productcodes[i] = sc.nextInt();

			System.out.println("Enter the price of item "+(i+1)+": ");
			prices[i] = sc.nextDouble();
		
		}

		double totalbill = 0.0;

		//calculate tax and total bill for the each item
		for(int i=0;i<itemcount;i++)
		{

			double price = prices[i];
			
			double tax_rate = get_tax_rate(productcodes[i]);

			double tax_amount = price * tax_rate / 100;

			totalbill = totalbill + price + tax_amount;

			System.out.println("item "+ (i+1) + ": code : " + (productcodes[i]) + ", price : "+(prices[i]) + "tax : "+ tax_amount); 
		}

		System.out.println("The total bill is :"+totalbill);
	}
}