/*A motor cycle dealer sells two-wheelers to his customer on loan,which is to be repaid in 5 years. The dealer charges simple
interest for the whole term on the day of giving the loan itself. The total amount is then divided by 60(months) and is collected 
as equated monthly installment (EMI). Write a program to calculate the EMI fora loan of Rs. X, where X is given from command line
argument. Printthe EMI value in rupees*/

import java.util.*;

public class code2{

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		if(args.length != 1)
		{
			System.out.println("Enter only one value!");
		}

		double loanamount = Integer.parseInt(args[0]);

		double interestrate = 12; // assumption taken
		int tenureperiod = 5; // in years

		double simpleinterest = (loanamount * interestrate * tenureperiod) / 100;

		//total amount to be repaid
		double totalamount = loanamount + simpleinterest;

		//installment calculation
		double EMI = totalamount / (tenureperiod * 12);

		System.out.println("The EMI amount will be :"+EMI);

		sc.close();
	}
}