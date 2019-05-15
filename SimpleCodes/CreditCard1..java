//what is public void.
//google stuff in private , public and protected.
public class CreditCard{
	//fields
	private String name;
	private String bank;
	private String number;
	private int limit;
	private double balance;
	//constructor

	CreditCard(String nm , String bk, String num, int lim, double bal){
		name = nm;
		bank = bk;
		number = num;
		limit = lim;
		balance = bal;
	}
		//accessor methods
		public String getName(){
			return name;
		}

		public String getBank(){
			return bank;
		}

		public String getNumber(){
			return number;
		}

		public double getLimit(){
			return limit;
		}

		public double getBalance(){
			return balance;
		}

		public boolean chargeit(double price){
			if (price + balance > (double) limit)
				return false;
				balance += price;
				return true;
			
		}

		public void makePayment (double payment){
			balance -= payment;
		}

	
		public static void printCard(CreditCard c){
			System.out.println(c.getBalance());
			System.out.println(c.getLimit());
			System.out.println(c.getNumber());
			System.out.println(c.getName());
			System.out.println(c.getBank());
		}
		
}

