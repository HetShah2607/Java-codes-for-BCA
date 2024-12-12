/*code 15 : Write an interface called numbers, with a method in Process(int x,int y). Write a class called Sum,
 in which the method Process finds the sum of two numbers and returns an int value. Write another
 class called Average, in which the Process method finds the average of the two numbers and returns
 an int.*/

import java.io.*;

public class code15
{
	interface Number
	{
		public int process(int x,int y);
	}

	static class sum implements Number
	{
		public int process(int a,int b)
		{
			return a+b;
		}
	}
	
	static class average implements Number
	{
		public int process(int a,int b)
		{
			return ((a+b) / 2);
		}
	}

	public static void main(String args[])
	{
		int n1=100,n2=50,result;

		sum s = new sum();
		result = s.process(n1,n2);
		System.out.println("The sum of two numbers is :"+result);

		average a = new average();
		result = a.process(n1,n2);
		System.out.println("The average of two numbers is :"+result);
	}

}