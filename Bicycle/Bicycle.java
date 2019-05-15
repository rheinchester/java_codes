class Bicycle {
	//Data member
	private String ownerName;

	//class constructor
	public Bicycle(){
		ownerName = "unknown";
	}

	public void setOwnerName(String name){
		ownerName = name; 
	}

	public String getOwnerName(){
		return ownerName;
	}
}