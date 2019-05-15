public class Newbiker {
	public int speed;
	public int gear;
	public int cadence;


	public Newbiker( int startSpeed, int startGear, int startCadence){
		speed = startSpeed;
		gear = startGear;
		cadence = startCadence;
	}

	public void setGear(int newValue){
		gear = newValue;
	}

	public void setCadence(int newValue){
		cadence = newValue;
	}

	public void incrementSpeed(int increment){
		speed += increment;
	}

	public void decrementSpeed( int decrement){
		speed -= decrement;
	}


}

public class MountainBike extends Newbiker {
	public int seatHeight;

	public MountainBike(int startCadence, int startGear, int startSpeed, int startHeight){
		super(startCadence,  startGear,  startSpeed,  startHeight);
		seatHeight = startHeight;
	}

	public void setHeight(int newHeight){
		seatHeight = newHeight;
	}
}