class BicycleReg  {
	public static void main(String[] args) {
		Bicycle bike1, bike2;
		String owner1, owner2;

		bike1 = new Bicycle();//initializes new bicycle with unknown owner
		bike1.setOwnerName("Jimmy Jones");

		bike2 = new Bicycle();
		bike2.setOwnerName("Tom Harris");

		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();

		System.out.println(owner1 +" owns a bicycle");
		System.out.println(owner2 +" owns a bicycle");

	}

}