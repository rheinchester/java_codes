public class Bicycle{
	//fields
	public int cadence;
	public int speed;
	public int gear;
		
	//constructor
	public Bicycle(int startCadence, int startSpeed, int startGear){
	 cadence = startCadence;
	 speed = startSpeed;
	 gear  = startGear;
	}	
	//method
	public void setGear(int newGear){
		gear = newGear;
	}
	public int getGear(){
		return gear;
	}

	public void setCadence(int newCadence){
		cadence = newCadence;
	}
	public int getCadence(){
		return cadence;
	}

	public void incrementSpeed( int increment){
		speed += increment;
	}

	public void decrementSpeed(int decrement){
		speed -= decrement;
	}

	Bicycle myBike = new Bicycle(12,2, 13 );
	System.out.println();

	
	
}

public class MountainBike extends Bicycle {
	//one field
	public int seatHeight;
	
	//one constructor
	public MountainBike(int startHeight, int startSpeed, int startCadence, int startGear){
	super( startCadence,  startSpeed,startGear);
	int seatHeight = startHeight;
	}	
	// one method
	public void setHeight(int newValue){
		seatHeight = newValue;
	}

	public int getHeight(){
		return seatHeight;
	}
}