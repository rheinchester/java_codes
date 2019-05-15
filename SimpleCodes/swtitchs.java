import java.util.Scanner;
public class Swtitchs{
	public static void main(String[] args) {
		switch(pin){
			System.out.print("Enter your name please: ");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			System.out.print("Welcome " + name +" to the atm simulator");
			System.out.print("Please enter your 4 digit pin");
			int pin = sc.nextInt();
			int savedPin = 1234;


				case 1234:{
					System.out.println("Enter 1 to MAke a Transfer ");
					System.out.println("Enter 2 to MAke a withrawal");
					System.out.println("Enter 3 to MAke a recharge");
					
					break;

				}
				case 1986:{
					System.out.println("Reserved for jacob");
				break;
				}
				default:{
					System.out.println("No match in th above");
					



		}
				}
	}
}
