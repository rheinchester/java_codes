
//development steps for the loan calculator
// 1. Start a skeleton of the LoanCalculator class. The skeleton LoanCalculator class
// will include only an object/variable declaration and a constructor to create
// objects.Define a temporary placeholder Loan class.
// 2. Implement the input routine to accept three input values.
// 3. Implement the output routine to display the results.
// 4. Implement the computation routine to compute the monthly and total payments.
// 5. Finalize the program, implementing any remaining temporary methods and
//adding necessary methods as appropriate


import java.util.*;

class LoanCalculator {
	//data member
	private Loan loan;

	//constructor

	public LoanCalculator(){
	//notice a constructor here was used as a data member
	}

	public start(){
		describeProgram();
		getInput();
		// getTotalpayment();
		displayOutput();
	}

	public static void main(String[] args) {
		LoanCalculator lc  = new LoanCalculator();
		lc.start();
	}


	private void getInput(){
		double annualInterestRate, loanAmount;
		int loanPeriod;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Annual interest Rate");
		annualInterestRate = sc.nextDouble();

		System.out.println("Enter loan amount");
		loanAmount = sc.nextDouble();

		System.out.println("Enter loan period");
		loanPeriod = sc.nextInt();

		loan = new Loan(loanAmount,annualInterestRate, loanPeriod);		
	}

	private void describeProgram() {
		System.out.println
		("This program computes the monthly and total");
		System.out.println
		("payments for a given loan amount, annual ");
		System.out.println
		("interest rate, and loan period (# of years).");
		System.out.println("\n");
	}

	private void displayOutput(){
		System.out.println("Monthly payment is "loan.getMonthlypayment);
		System.out.println("Total payment is "loan.getTotalpayment);
	}




}