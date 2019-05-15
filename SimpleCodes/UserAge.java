import java.util.Scanner;
public class UserAge{
	public static void main(String[] args) {
		System.out.print("Enter your name please: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		int currentYear = 2017; 
		System.out.print("Enter your year of birth ");
		int year = sc.nextInt();
		int requiredAge = 18;
		int age = currentYear - year;
		if (age < requiredAge ){
			System.out.print("wrong age");
		}
		else{
			System.out.print("welcome!");	
		}
	}
}
