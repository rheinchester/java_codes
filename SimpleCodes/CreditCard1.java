public  class CreditCard1{
	//fields
	public String name;
	public String number;
	public String bank; 
	public double balance;
	public int limit;

	// constructot

	CreditCard1(String nm, String num, String bk, double bal, int lim){
		name = nm;
		number = num;
		bank = bk;
		balance = bal;
		limit = lim;
	}

	//method

	public String getName(){
		return name;
	}

	public String getNumber(){
		return number;
	}

	public String getBank(){
		return bank;
	}

	public int getLimit(){
		return  limit;
	}

	public double getBalance(){
		return balance;
	}

	public boolean chargeIt(double price){
		if (price + balance >(double) limit ) 
			return false;
			balance += price;
			return true;
		
	}

	public void makePayment(double payment){
		balance -= payment;
	}


	public static void printCredit(CreditCard1 c){
		System.out.println("Name = "+ c.getName());
		System.out.println("number = " + c.getNumber());
		System.out.println("bank = " + c.getBank());
		System.out.println("balance = " + c.getBalance());
		System.out.println("limit = " + c.getLimit());
	}
}