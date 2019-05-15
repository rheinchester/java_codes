import java.util.Random;

public class ArrayCopyDemo{//go through code today
	public static void main(String[] args) {
		char [] copyFrom = {'c','u','p','s'};
		char [] copyTo = new char[copyFrom.length];
	// 	for(char letter : copyFrom){
	// 	System.out.println(letter);//returns string verion
	// }
	// 	for(char letter : copyTo){
	// 	System.out.println(letter);//returns string verion
	// } google for each

		for (int i=0 ;i<copyFrom.length;i++ ) {
			copyTo[i]= copyFrom[i];
			
		}
		for (char letter : copyTo ) {
			System.out.println(letter);
		}
// int i = 5;
// System.out.println(i--);
// System.out.println(--i);
// Random rand = new Random();
// int [] myArray = new int[5];
// for (int i =0;i<myArray.length ;i++ ) {
// 	myArray[i] = rand.nextInt(1)+1;	
// }

// for (int value : myArray ) {
// 	System.out.println(value);
}

	}
}


// //manual stuff
// int [][]arr = new int[3][];
// arr[0] = new int[3];
// arr[0] = new int[3];
// arr[0] = new int[3];
//google post increment and pre increment
//post increments but does not return. but subsequently uses in other instances
//pre increments before return;