/* code-9 : A bank gives 6.5% per annum interest on deposits made in that bank. Write a program to calculate the
total amount that a person will receive after the end of 5 years for a deposit of Rs.5000 for compound interest.
Create necessary methods and constructors too */

import java.util.Scanner;

public class CompoundInterestCalculator
{
	private double principal;
	private double rate;
	private int time;

	public CompoundInterestCalculator(double principal,double rate,int time)
	{
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}

	public double CalculateCompundInterest()
	{
		double amount = principal * Math.pow(1 + (rate/100),time);
		return amount;
	}
	
	public static void main(String args[])
	{

		// Initialize with a principal of Rs. 5000, rate of 6.5% per annum, and time of 5 years
		CompoundInterestCalculator calculator = new CompoundInterestCalculator(5000,6.5,5);

		// Calculate the total amount after compound interest
		double totalAmount = calculator.CalculateCompundInterest();

		//print the total amount
		System.out.println("The Final amount will be:"+totalAmount);

	}
}