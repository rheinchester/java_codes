import java.util.Scanner;
// write a ajava program that will take
// in first name last name and university 
// ("university of") and department
// area of cylinder 

public class Profile1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name ");
		String firstName = sc.next();
		
		System.out.println("Enter your last name ");
		String lastName = sc.next();
		
		String profile = (firstName +" "+ lastName);
		
		System.out.println("Enter your university");
		String university = sc.next();
		
		System.out.println("Enter your department ");
		String department = sc.next();
		
		System.out.println("Welcome "+ profile+ " we are aware that you a student of  "+ university+ " in the department of "+ department );
		


		
	}
}