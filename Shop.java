/* code - 8 : A shop during festival season offers a discount 10% for purchase made up to Rs.1,000,12% for purchase
 value of Rs.1,000 or more up to Rs 1,500 and 15% for purchase value of Rs.1,500 or more. Write a program to
implement the above scheme for a given sales and print out the sales and print out the sales value, discount and
net amount payable by a customer. Create necessary methods and constructors. */

import java.util.Scanner;

public class Shop
{
	private double salesValue;
	private double discount;
	private double netAmount;

	public Shop(double salesValue)
	{
		this.salesValue = salesValue;
		this.discount = 0.0;
		this.netAmount = 0.0;
	}

	public void CalculateDiscount()
	{
		if(salesValue < 1000)
		{
			discount = salesValue * 0.10;
		}
		else if(salesValue >= 1000 && salesValue <= 1500)
		{
			discount = salesValue * 0.12;
		}
		else
		{
			discount = salesValue * 0.15;
		}
	}

	public void CalculateNetAmount()
	{
		netAmount = salesValue - discount;
	}

	public void displayDetails()
	{
		System.out.println("salesValue is : Rs."+String.format("%.2f",salesValue));
		System.out.println("discount is : Rs."+String.format("%.2f",discount));
		System.out.println("Net amount payable is : Rs."+String.format("%.2f",netAmount));
	}

		
	public static void main(String[] args)
		{

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the salesValue:");
			double salesValue = sc.nextDouble();

			Shop shop = new Shop(salesValue);

			shop.CalculateDiscount();
			shop.CalculateNetAmount();
			shop.displayDetails();
		}
}