
import java.util.*;
import java.text.*;
/*
	Chapter 3 Sample Development: Loan Calculator (Step 2)
	File: Step2/Ch3LoanCalculator.java
	Step 2: Display the Results
*/

class Ch3LoanCalculator {
	public static void main(String[] args) {
		double loanAmount, annualInterestRate;
		int loanPeriod;

		final int MONTHS_IN_YEAR = 12;
		double monthlyPayment,
		totalPayment;

		double monthlyInterestRate;
		int numberOfPayments;

		Scanner sc = new Scanner (System.in);
		sc.useDelimiter(System.getProperty("line.separator"));

		DecimalFormat df = new DecimalFormat("0.00");
		//describe the program
		System.out.println("This program computes the monthly and total");
		System.out.println("payments for a given loan amount, annual ");
		System.out.println("interest rate, and loan period.");
		System.out.println("Loan amount in dollars and cents,e.g., 12345.50");
		System.out.println("Annual interest rate in percentage,e.g., 12.75");
		System.out.println("Loan period in number of years, e.g., 15");
		System.out.println("\n"); //skip two lines


		System.out.print("Enter loan amount: ");
		loanAmount = sc.nextDouble();

		System.out.print("Enter annual Interest Rate: ");
		annualInterestRate = sc.nextDouble();

		System.out.print("Loan Period - # of years: ");
		loanPeriod = sc.nextInt();
		//compute the monthly and total payments
		monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / 100;
		numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
		monthlyPayment = (loanAmount * monthlyInterestRate)/
		(1 - Math.pow(1/(1 + monthlyInterestRate),
		numberOfPayments ) );
		totalPayment = monthlyPayment * numberOfPayments;

		System.out.print("Enter Loan Period : ");
		loanPeriod = sc.nextInt();
		System.out.println("");
		System.out.println("Loan Amount: $" + loanAmount);
		System.out.println("Annual Interest Rate: "
		+ annualInterestRate + "%");
		System.out.println("Loan Period (years): " + loanPeriod);
		System.out.println("\n"); //skip two lines
		

		//display the result
		System.out.println("");
		System.out.println("Loan Amount: $" + loanAmount);
		System.out.println("Annual Interest Rate: "
		+ annualInterestRate + "%");
		System.out.println("Loan Period (years): " + loanPeriod);
		System.out.println("\n"); //skip two lines
		System.out.println("Monthly payment is $ " + df.format(monthlyPayment));
		System.out.println(" TOTAL payment is $ " + df.format(totalPayment));


	}
}

//write function that prints out different digits in a number.