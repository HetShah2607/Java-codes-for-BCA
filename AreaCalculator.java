/*code-6 : Write a program to calculate the area of square and rectangle by overloading the area method.*/
import java.util.Scanner;

public class AreaCalculator
{
	public double area(double squareside)
	{
		return squareside*squareside;
	}

	public double area(double reclength,double recbreadth)
	{
		return reclength*recbreadth;
	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		AreaCalculator calculator = new AreaCalculator();

		
		//taking the input for the area of square
		System.out.println("Enter the side of square:");
		double squareside = sc.nextDouble();

		double squarearea = calculator.area(squareside);
		
		//printing the details of area of square
		System.out.println("The side of square is :"+squareside);
		System.out.println("The area of square is :"+squarearea);

		
		//taking the input for the area of rectangle
		System.out.println("Enter the length of rectangle :");
		double reclength = sc.nextDouble();
		System.out.println("Enter the breadth of rectangle :");
		double recbreadth = sc.nextDouble();

		double rectanglearea = calculator.area(reclength,recbreadth);

		//printing the details of area of rectangle 
		System.out.println("The length of rectangle is :"+reclength);
		System.out.println("The breadth of rectangle is :"+recbreadth);
		System.out.println("The area of rectangle is :"+rectanglearea);
	}
}