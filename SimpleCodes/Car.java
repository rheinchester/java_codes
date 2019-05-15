import javax.swing.JOptionPane;
public class Car{
//attribute or fields
	private int numOfDoors;
	private final static int NUM_OF_TYRES = 4;
	private int speed;
	private String color;
 	private int yearModel;
 	private String make;

 	public Car(){ //default constructor

 	}
 	public Car( int numOfDoors, int yearModel, String make, String color){
 		this.numOfDoors = numOfDoors;
 		this.make = make;
 		this.color = color;
 		this.yearModel = yearModel;
 	}
 	public void setNumOfDoors(int numOfDoors){ //setter method
 		if ( (numOfDoors == 0) || (numOfDoors == 1) ) {
 			JOptionPane.showMessageDialog( null,"Car cannot have zero doors");
 		}
 		else{
 		this.numOfDoors = numOfDoors;
 		}//"this" allows the interpreter dot distinguish between attribute and parameter 
 	}

 	public int getNumOfDoors(){
 		return this.numOfDoors;
 	}
 	public void openDoor(){
 		System.out.println("Door Open");
 	}

 	public void closeDoor(){
 		System.out.println("DOor closed");
 	}

 	public void changeTyre(){
 		System.out.println("changeTyre");
 	}

 	public int accelerate(int speedUp){
 		speed += speedUp;
 		return speed;
 	}

 	public int decelerate(int speedDown){
 		speed -= speedDown;
 		return speed;
 	}
 	public void setYearModel(int year){
 		yearModel = year;
 	}
 	public int getYearModel(){
 		return yearModel;
 	}
 	public void setMake(String name ){
 		make = name;
 	}
 	public String getMake(){
 		return make;
 	}
 	public int getSpeed(){
 		return speed;
 	}
}

//in a blueprint no main method
//ALL CONSTANTS HAVE UPPERCASE
//year model might be string
//will not work unless it has a main method


//behaviors are methods
//we can write method to chande tyre


//const

//setter and getter allows access to data
// Interface  can not be instantiated.
//Google inferface and abstracts. ALl through today.

//polymorphism

//Public variables, are variables that are visible to all classes.
//Private variables, are variables that are visible only to the class to which they belong.
//Protected variables, are variables that are visible only to the class to which they belong, and any subclasses. 
//i've noticed that public does not have this but private has this

//what is static?

//after example look for a public class in github

//static all devices must share property. Final, the property never changes


//interface
//public github
//hotel stuff



// Abstraction lets you focus on what the object does instead of how it does it.

// Maybe abstraction is like steel metal. It is abstract. But  steel-spoon provides implementation.
//https://www.javatpoint.com/abstract-class-in-java

//http://addictedtojava.blogspot.com.ng/2013/09/abstraction-in-oops-how-it-can-be.html

//  https://www.tutorialspoint.com/java/java_abstraction.htm