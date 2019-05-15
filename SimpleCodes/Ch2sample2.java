
import java.util.*;
class Ch2sample2  {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstName, lastName;
		System.out.print("Enter your first name: ");
		firstName = scanner.next();

		System.out.print("Enter your lastName: ");
		lastName = scanner.next();

		System.out.println("Nice to meet you "+firstName+" "+lastName+".");
	}
}