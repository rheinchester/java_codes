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
		//accessor methods
		public getName(){
			return name;
		}

		public getBank(){
			return bank;
		}

		public getNumber(){
			return number;
		}

		public getLimit(){
			return limit;
		}

		public getBalance(){
			return balance;
		}

		public boolean chargeit(double price){
			if (balance > limit){
				return false;
				balance += price;
				return true;
			}
		}

		public void makePayment(payment){
			balance -= payment;
		}

		public static void printCard(CreditCard c){
			System.out.println(c.getBalance);
			System.out.println(c.getLimit);
			System.out.println(c.getNumber);
			System.out.println(c.getName);
			System.out.println(c.getBank);
		}
	}
}