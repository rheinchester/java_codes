import java.util.Scanner;
	public class Loop1{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "yes";
		Scanner scan = new Scanner(System.in);
		while( choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")){
			//old code added from here
		System.out.print("Enter your name please: ");
		String name = scan.nextLine();
		System.out.print("Welcome " + name +" to the atm simulator");
		System.out.print("Please enter your 4 digit pin");
		int pin = sc.nextInt();
		int savedPin = 1234;
		
		if( pin == savedPin){
			System.out.println("Enter 1 to make a transfer ");
			System.out.println("Enter 2 to make a withdral ");
			System.out.println("Enter 3 to recharge phone ");
			int enteredValue = sc.nextInt();
			if (enteredValue == 1) {
				System.out.println("Enter an amount to transfer");
				double amountTOTransfer  = sc.nextDouble();
				System.out.println("Enter an account to transfer to");
				int account  = sc.nextInt();
				System.out.println("The amount of " + amountTOTransfer+ "was transferred to  "+ account );
			}
			else if (enteredValue == 2){
				System.out.println("Enter an account to withdraw");
				double amountTOWithdraw = sc.nextDouble();
				System.out.println("please here's ypur cash");
			}
			else if (enteredValue == 3){
				System.out.println("Enter an amount to recharge");
				long amountTORecharge  = sc.nextLong();
				System.out.println("Enter a phone number to transfer to");
				int phone  = sc.next();
				System.out.println("The amount of " + amountTORecharge+ "was transferred to  "+ phone );


			}
		}	
			else{
				System.out.println("incorrect pin");				
			}

			//new code added
			System.out.print("Do you want to continue ?");
			choice = sc.next();
			System.out.println("thanks for using our stuff");
		

				
			
		}
	}
}
