public class TestClass{
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		NewCar car = new NewCar();
		Lorry lorry = new Lorry(true, true);

		car.setNumDoors(4);
		car.setMake("Rolls Royce");
		car.setNumTyres(4);

		lorry.setNumDoors(2);
		lorry.setMake("Rolls Royce");
		lorry.setNumTyres(8);

		System.out.println("Made by " + car.getMake());		
		System.out.println(" Car has "+ car.getNumDoors());
		System.out.println("it has"+ car.getNumTyres());

		System.out.println("Made by " + lorry.getMake() );		
		System.out.println(" Car has "+ lorry.getNumDoors());
		System.out.println("it has"+ lorry.getNumTyres());
	}
}

// Once vehicle is abstract it cannot be instantianted....Google abstract class.