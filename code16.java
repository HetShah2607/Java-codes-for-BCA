class NumberData
{
	int[] numbers;

	public NumberData(int[] numbers)
	{
		if(numbers.length != 5)
		{
			throw new IllegalArgumentException("please provide exact 5 values");

		}
		this.numbers = numbers;
	}
}

class Numplay extends NumberData
{
	public Numplay(int[] numbers)
	{
		super(numbers);
	}

	public void display()
	{
		System.out.println("Entered elements are :");

		for(int number : numbers)
		{
			System.out.println(number);
		}
	}

	public int sum()
	{
		int sum = 0;

		for(int number : numbers)
		{
			sum += number;
		}

		return sum;
	}

	public int average()
	{
		return sum()/5;
	}

	public int max()
	{
		int max = numbers[0];

		for(int number : numbers)
		{
			if(number > max)
			{
				max = number;
			}
		}

		return max;
	}

	public int min()
	{
		int min = numbers[0];

		for(int number : numbers)
		{
			if(number < min)
			{
				min = number;
			}
		}

		return min;
	}
}

public class code16
{
	public static void main(String args[])
	{
		if(args.length != 6)
		{
			System.out.println("please provide 5 values and 1 choice");
			return;
		}

		int[] numbers = new int[5];

		for(int i=0;i<5;i++)
		{
			numbers[i] = Integer.parseInt(args[i]);
		}

		int choice = Integer.parseInt(args[5]);

		Numplay num = new Numplay(numbers);

		switch(choice)
		{
			case 1:
				num.display();
				break;
			case 2:
				System.out.println("Sum of the numbers is :"+num.sum());
				break;
			case 3:
				System.out.println("Average of the numbers is :"+num.average());
				break;
			case 4:
				System.out.println("Max is :"+num.max());
				break;
			case 5:
				System.out.println("Min is :"+num.min());
				break;
			default:
				System.out.println("Invalid choice!");
				return;
		}
	}
}