class LibraryCard {
	private int borrowCnt;
	private Student owner;

	public LibraryCard(){
		borrowCnt = 0;
		owner = null;
	} 

//Checking the number of books checked out
	public void checkOut( int numOfbooks){
			borrowCnt  = borrowCnt + numOfbooks;
	}

	//getStudent's namr
	public String getStudentName(){
	   return owner.getName();
	}

	public void setOwner(Student name ){
		owner = name;
	}

	public int getNumberOfBooks(){
		return borrowCnt;	
	}

	public String toString(){
		return "Owner name: "+ owner.getName()+"\n"+
				"Owner email: "+owner.getEmail()+"\n"+
				"Books borrowed: "+ borrowCnt;
	}
}