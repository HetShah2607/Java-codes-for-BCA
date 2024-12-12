/*Write a program to calculate the hypotenuse of right angled triangle when other sides of the triangle are given. 
(Hypotenuse = square root (x*x + Y *Y))  */

import java.util.Scanner;

public class code5
{

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		//input for the length of the other two sides
		System.out.println("Enter the length of side X:");
		double sideX = sc.nextDouble();

		System.out.println("Enter the length of side Y:");
		double sideY = sc.nextDouble();

		//calculating the hypotenuse using the formula : sqrt.(X*X + Y*Y)
		double hypotenuse = Math.sqrt(sideX*sideX + sideY*sideY);

		//printing the hypotenuse as the output
		System.out.println("The hypotenuse of the two values is  :"+hypotenuse);
	}
}
