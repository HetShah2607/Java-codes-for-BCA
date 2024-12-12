import java.util.Scanner;

public class code7p
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("Hello,Good Morning");

		int length = str.length();
		System.out.println("The length of string is :"+length);

		int start = str.indexOf("Morning");
		int end = start + "Morning".length();
		str.replace(start,end,"Evening");

		System.out.println("Updated string:"+str);
		
	}
}