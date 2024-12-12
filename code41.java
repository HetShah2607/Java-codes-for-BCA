import java.io.*;
import java.util.*;

public class code41
{
	public static void main(String args[])
	{
		int[] array = {40,145,36,168,120,100};

		int n = array.length;

		int small;

		int next_small = Integer.MAX_VALUE;

		small = array[0];

		try
		{
			for(int i=0;i<n;i++)
			{
				if(array[i] < small)
				{
					next_small = small;
					small = array[i];
				}
				else if(array[i] > small && array[i] < next_small)
				{
					next_small = array[i];
				}
			}
		}

		catch(Exception e)
		{
			System.out.println(e);;
		}

		System.out.println("The smalllest value is:"+small);
		System.out.println("The Second smallest number is :"+next_small);
	}
}