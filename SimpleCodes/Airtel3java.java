import java.util.Scanner;
public class Airtel3java{
	public static void main(String[] args) {
		System.out.println("Welcome user. please dial *131# to proceed");
		String dial = "*131#";
		Scanner sc = new Scanner(System.in);
		String userDial = sc.next();
		// while (userDial.equals("1")|| userDial.equals("2")||userDial.equals("3") ||  userDial.equals("*131#")) {
		// put switch inside method
		switch(userDial){
			case "*131#":{
					System.out.println("1 Buy Data plans ");
					System.out.println("2 to buy bun");
					System.out.println("Enter 3 to MAke a recharge");
					System.out.println("4 for exit");
					String a = sc.next();
					// while (!(a.equals("4"))) {
					switch(a){
						case "1":{
							System.out.println("1 N100 for 10mb ");
							System.out.println("2 N200 for 30mb ");
							System.out.println("3 N300 for 100mb ");
							System.out.println("4 N500 for 750mb ");
							String b = sc.next();
							switch(b){
								case "1":
								case "2":
								case "3":
								case "4":{
									System.out.println(" Successful recharge");
									System.out.println("press any key to continure if not, press 1 to exit ");
									String reply = sc.next();
									switch (reply) {
										case "1":{
											return;
										}
										// case "2" : {
									
										// }
									}

									
									break;
									
								}
								
							}

						}
						case "2":{
							System.out.println("1 N100 ");
							System.out.println("2 N200  ");
							System.out.println("3 N300  ");
							System.out.println("4 N500  ");
							String c = sc.next();
							switch (c) {
								case "1":
								case "2":
								case "3":
								case "4":{
									System.out.println(" Successful recharge");
									System.out.println("TO continue press anykey. if not, press 1 to exit ");
									String reply = sc.next();
									switch (reply) {
										case "1":{
											return;
										}
										// case "2" : {
									
										// }
									}

									
									break;
									
									}
								}
							}
							
						
							
						
						 }
					// }
				}
				break;


				default:{
					System.out.println("No match in the above");
					

			}		
		}
		System.out.println("Thanks for using our service");
	}
}


