public  class Test1 {
	public static void main(String[] args) {
		CreditCard1 wallet[] = new CreditCard1[10]; 
		wallet[0] = new CreditCard1("john simmons", "081 3855 1023", "First bank", 250.0, 250);
		wallet[1] = new CreditCard1("jonathan  murray", "081 1231 2466", "First bank", 250, 250);

		for (int i=1 ; i<=16 ;i++ ) {
			wallet[0].chargeIt((double)i);
			wallet[1].chargeIt(2.0*i);
		}
		for (int i = 0; i<3 ; i++ ) {
			CreditCard1.printCredit(wallet[i]);
			while (wallet[i].getBalance() > 100.0) {
				wallet[i].makePayment(100.0);
				System.out.println("New balance = " + wallet[i].getBalance());
			}
		}
	}
}