/*Write a program to evaluate simple interest of a given principle,
rate and time.*/

import java.util.*;

public class code1{

	public static double simple_interest(double amount,double rate,double time)
	{

		double interest = (amount * rate * time) / 100;

		return interest;
	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principal amount:");
		double amount = sc.nextDouble();

		System.out.println("Enter the rate of interest:");
		double rate = sc.nextDouble();

		System.out.println("Enter the period of time:");
		double time = sc.nextDouble();

		double interest = simple_interest(amount,rate,time);

		System.out.println("The simple interest of the money is : "+interest);

		sc.close();

	}
}
