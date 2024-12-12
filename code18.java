interface Exam
{
	public Boolean pass(int marks);
}

interface Classify
{
	public String division(int average);
}

class Result implements Exam,Classify
{
	public Boolean pass(int marks)
	{
		if(marks >= 35)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public String division(int average)
	{
		if(average >= 60)
		{
			return "first";
		}
		else if(average < 60 && average >= 50)
		{
			return "second";
		}
		else
		{
			return "No division!";
		}
	}
}

public class code18
{
	public static void main(String args[])
	{
		Result res = new Result();

		int mark = 40;
		Boolean isPassed = res.pass(mark);
		System.out.println("Is Passed :"+isPassed);

		int avg = 65;
		String ans = res.division(avg);
		System.out.println("Division :"+avg);
	}
}