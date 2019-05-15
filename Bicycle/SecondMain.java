class SecondMain{
	public static void main(String[] args) {
		Bicycle bike;
		Account acct;

		String myName= "jon java";

		bike = new Bicycle();
		bike.setOwnerName(myName);

		acct = new Account();
		acct.setOwnerName(myName);
		acct.setInitialBalance(250.0);

		acct.add(3400.0);
		acct.deduct(343);

		System.out.println(bike.getOwnerName());
		System.out.println(acct.getCurrentBalance());


	}
}