class Ch5AccountVer2{
	//data member
	private String ownerName;
	private double balance;
	private boolean active;
	//constructor
	public Ch5AccountVer2(String name, double startBalance){
		ownerName = name;
		balance = startBalance;
		setActive(true);
	}
	//set method
	private void setActive(boolean state){
		active = state;
	}
	public void setOwnerName(String name){
		ownerName = name;
	}

	//get method
	public boolean isActive(){
		return active;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public double getCurrentBalance(){
		return balance;
	}

	//close
	public void close(){
		setActive(false);
	}
	//add
	public void add( double amt){
		//isActive()==true i feel this is the correct stuff 
		if (isActive()==true && amt>0) {
			balance = balance + amt;
		}
	}
	//deduct
	public void deduct(double amt){
		if (isActive() && amt>0) {
			double newBalance = balance - amt;
			if (newBalance>=0) {
				balance = newBalance;
			}
		}
	}


}