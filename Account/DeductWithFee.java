import java.text.*;
	class DeductionWithFee {
		//This sample program deducts money three times
		//from the account
		public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Account3 acct;
		acct = new Account3("Carl Smith", 50.00);
		acct.deduct(10);
		acct.deduct(10);
		acct.deduct(10);
		System.out.println("Owner: " + acct.getOwnerName());
		System.out.println("Bal : $"
		+ df.format(acct.getCurrentBalance()));
		}
	}

	// If a data member is a constant, declare it as a class constant.