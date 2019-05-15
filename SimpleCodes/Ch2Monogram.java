/*
Chapter 2 Sample Program: Displays the Monogram
File: Step1/Ch2Monogram.java
*/

// import java.util.*;
// class Ch2Monogram {
// 	public static void main(String[] args) {
// 		String name;
// 		Scanner scanner = new Scanner(System.in);
// 		scanner.useDelimiter(System.getProperty("line.separator"));
// 		System.out.print("Enter your full name (first, middle, last):");
// 		name = scanner.next( );
// 		System.out.println("Name entered: " + name);
// 	}
// }
import java.util.*;

class Ch2Monogram {//it's supposed to be a recursive function
	public static void main(String[] args) {
		String name;
		String first, middle, last;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Enter your full name (first middle and last): ");
		name = scanner.next();
		first = name.substring(0,name.indexOf(" "));
		String middle_last = name.substring(name.indexOf(" ")+1 , name.length());
		middle = middle_last.substring(0,name.indexOf(" "));
		last = middle_last.substring(middle_last.indexOf(" ")+1,middle_last.length());
		System.out.println("Name entered: " + name);
		System.out.println("First:" + first);
		System.out.println("Middle:" + middle);
		System.out.println("Last:" + last);
		// System.out.println(middle_last);
		System.out.println(first.substring(0, 1)+ middle.substring(0, 1) + last.substring(0, 1));
	}
}
