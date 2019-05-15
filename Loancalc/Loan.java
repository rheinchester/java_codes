class Loan {
	//data members
	private final int MONTHS_IN_YEAR = 12;
	private double loanAmount ;
	private double monthlInterestRate;
	private int numberOfOPayments;

	//constructor
	public Loan(double amount, double rate, int period){
		setAmount(amount);
		setRate(rate);
		setPeriod(period);
	}

	public void setAmount(double amount ){//check if an identifier is supposed to be here.
		loanAmount = amount;
	}

	public void setRate(double annualRate ){
		monthlInterestRate = annualRate /100.0/ MONTHS_IN_YEAR;
	}

	public  void setPeriod(int periodInYears){
		numberOfOPayments = periodInYears * MONTHS_IN_YEAR;
	}

	public int getPeriod(){
		return numberOfOPayments / MONTHS_IN_YEAR;
	}

	
	public double getMonthlyPayment( ) {
		double monthlyPayment;
		monthlyPayment = (loanAmount * monthlyInterestRate)/
		(1 - Math.pow(1/(1 + monthlyInterestRate),
		numberOfPayments ) );
		return monthlyPayment;
	}
	public double getTotalPayment( ) {
		double totalPayment;
		totalPayment = getMonthlyPayment( ) * numberOfPayments;
		return totalPayment;
	}
}