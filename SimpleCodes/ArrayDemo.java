import java.util.Scanner;
public class ArrayDemo{
	public static void main(String[] args) {
	// dataType[] nameOfArray = new dataType [length of array]	
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[8];
		for(int i=0; i<scores.length; i++){
			System.out.println("Enter value for the" +(i+1)+   "cell");
			scores[i] = sc.nextInt();
		}
		

	System.out.println("The value stored in array is");
	for (int i=0 ;i<scores.length; i++ ) {
		System.out.println(scores[i]);
	}
	}


}