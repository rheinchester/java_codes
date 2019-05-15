class Librarian {
	public static void main(String[] args) {
		Student student;
		LibraryCard card1, card2;

		student = new Student();
		student.setName("jacob munez");
		student.setEmail("jj@gmail.com");

		card1 = new LibraryCard();
		card1.setOwner(student);
		card1.checkOut(3);
		//the same student is the owner
		//of the second card, too
		card2 = new  LibraryCard();
		card2.setOwner(student);
		System.out.println("card info"+"\n");
		System.out.println(card1.toString()+"\n");
	}
}