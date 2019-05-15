import java.util.*;
class WhileLoop  {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter an age between 0 and 130");
		age = sc.nextInt();
		while (age<70 || age > 130) {
			System.out.println("wrong age");
		 	System.out.println("Enter an age between 0 and 130");
		 	age = sc.nextInt();
		 } 
	}
}	

