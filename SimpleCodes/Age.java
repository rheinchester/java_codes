import java.util.Scanner;
public class Age{
	public static void main(String[] args) {
		System.out.print("Enter your name please: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();		
		int currentYear = 2017; 
		System.out.print("Enter your year of birth ");
		int yearofBirth = sc.nextInt();
		int requiredAge = 18;
		int age = currentYear - yearofBirth;
		if (age <= requiredAge ){
			System.out.print("wrong age");
		}
		else{
			System.out.println("welcome!");	
		System.out.println(age);	
		System.out.println(requiredAge);
		}
	}
}
