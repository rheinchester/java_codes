public class Vehicle{
	private int numOfDoors;
	private static int numberOfTyres ;
	private int speed;
	private String color;
 	private int yearModel;
 	private String make;

//this distinguishes attribute from parameters
 	public void setNumDoors(int numOfDoors){
 		this.numOfDoors = numOfDoors;
 	}


 	public int getNumDoors(){
 		return this.numOfDoors;
 	}

 	public void setNumTyres( int numberOfTyres){
 		this.numberOfTyres = numberOfTyres;
 	}



	public int getNumTyres(){
 		return numberOfTyres;
 	}

	public void setColor( String color){
	this.color = color;
	} 
 	public String getColor(){
 		return this.color;
 	}

 	public void setSpeed( int speed){
	this.speed = speed;
	} 

 	public int getSpeed(){
 		return this.speed;
 	}


 	public void setMake( String make){
	this.make = make;
	} 

 	public String getMake(){
 		return this.make;
 	}

}