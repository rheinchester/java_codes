class Loan {
	//data members
	private final int MONTHS_IN_YEAR = 12;
	private double loanAmount;
	private double monthlyInterestRate;
	private int numberOfPayment;

	//constructor
	public Loan(double amount, double rate, int period){
		setAmount(amount);
		setRate(rate);
		setPeriod(period);
	}

	public setAmount(double amount){
		loanAmount = amount;
	}


	public setRate(double annualRate){
		monthlyInterestRate = annualRate/100.0/MONTHS_IN_YEAR;
	}

	public setPeriod (int periodInYears){
		numberOfPayment  =  periodInYears * MONTHS_IN_YEAR;
	}





}