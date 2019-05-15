import java.util.Scanner;

public class Profile{
	public static void main(String[] args) {
		System.out.print("Enter your First name: ");
		Scanner sc = new Scanner (System.in);
		String firstName = sc.next();
		System.out.println();
		System.out.print("Enter your Last name: ");
		
		String lastName = sc.next();
		System.out.println("your full name is: " +firstName+ " " + lastName);
	}
}