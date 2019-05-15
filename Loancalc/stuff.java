// owner
// borrowCnt

// LibraryCard( )
// checkOut( int )
// getNumberOfBooks( )
// getOwnerName( )
// setOwner( Student )
// toString( )

class LibraryCard{
	private Student  owner;
	private int borrowCnt;

	public LibraryCard(){
		owner = null;
		borrowCnt = 0; 
	}

	public  void numCheckout(int num ){
		borrowCnt = borrowCnt +num;
	}

	public Student getOwnerName(){
		return  owner;
	}

	public void setOwner(Student name){
		owner = name;
	}




	public int getNumberOfBooks(){
		return borrowCnt;
	}
}