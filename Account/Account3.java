class Account3 {
	private double balance;
	private static final double FEE = 0.5;
	private String ownerName;

	public Account3(String name, double startingBalance){
		ownerName = name;
		balance = startingBalance;
	}

	// public void deduct(double amt){
	// 	balance = balance - amt - FEE;
	// }

	public String getOwnerName(){
		return ownerName;
	}
	public double getCurrentBalance(){
		return balance;
	}

	public void add(double amt ){
		//No dot notation is necessary.
		adjust(amt);
	}

	public void deduct( double amt){
		adjust(-(amt+FEE) );
	}

	private void adjust(double adjustAmt){
//From this adjust can't be accessed easily. 
//If we didn't use adjust and rather just put the "balance" in add and deduct,
//we would have created a class where the user can access and alter his balance anytime
		balance = balance + adjustAmt;
	}


}