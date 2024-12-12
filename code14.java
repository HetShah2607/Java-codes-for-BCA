import java.util.Scanner;

public class code14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String[] company_name = {"A","B","C","D","E"};
		double[] company_quote = {200,162.23,241.20,360,250};

		double low_c_quote = company_quote[0];
		String low_c_name = company_name[0];

		for(int i=0;i<company_name.length;i++)
		{
			if(company_quote[i] < low_c_quote)
			{
				low_c_quote = company_quote[i];
				low_c_name = company_name[i];
			}
		}

		System.out.println("The lowest quote is :"+low_c_quote+" by company :"+low_c_name);
	}
}