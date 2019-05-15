import java.util.*; 
class Ch3SelectWinner {
	public static void main(String[] args) {
		int startNumber;
		int count;
		int winningNumber;
		int min, max;

		Scanner sc =  new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter the starting Number");
		startNumber =  sc.nextInt();

		System.out.print("Enter the number of party goers");
		count = sc.nextInt();

		min  = startNumber + 1;
		max = startNumber + count;

		winningNumber = rand.nextInt(max-min+1) + min;

		System.out.println("\nThe Winning Number is "+ winningNumber);
	}
}