public class Test{
	public static void main(String[] args) {
			CreditCard wallet[] = new CreditCard[10];
			wallet[0] = new CreditCard("090 309 244 024","John Bowman","California Savings",2500,2500 );
			wallet[1] = new CreditCard("090 309 244 024","John Bowman","California Federal",2500, 3500);
			wallet[2] = new CreditCard("090 309 244 024","John Bowman","California Finance",2500, 4500);
		for (int i=1; i<=16 ;i++ ) {
			wallet[0].chargeit((double)i);  
			wallet[1].chargeit(2.0*i);  
			wallet[2].chargeit((double)3*i);  
		}
		for (int i=0; i<3 ;i++ ) {
			CreditCard.printCard(wallet[i]);
			while (wallet[i].getBalance() > 100.0) {
				wallet[i].makePayment(100.0);
				System.out.println("New balance = " + wallet[i].getBalance());
			}
		}
	}
}