import java.util.Scanner;
public class Atm{
	public static void main(String[] args) {
		System.out.print("Enter your name please: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("Welcome " + name +" to the atm simulator");
		System.out.print("Please enter your 4 digit pin");
		int pin = sc.nextInt();
		int savedPin = 1234;
		if( pin == savedPin){
			System.out.println("Enter 1 to make a transfer ");
			System.out.println("Enter 2 to make a withdral ");
			System.out.println("Enter 3 to recharge phone ");
		}
		else if( pin == 1871){
			System.out.println("This pn is specially made for jacob ");			
		}
		else{
			System.out.println("This is an invalid pin");			

	
	}
}
}
