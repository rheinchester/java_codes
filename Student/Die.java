import java.util.Random;
class Die {
	private static final int MAX_NUMBER = 6;
	private static final int MIN_NUMBER = 1; 
	private static final int NO_NUMBER = 0;

	private Random random;
	private int number;

	public Die(){
		random = new Random();
		roll();
	}

	public void roll(){//set method
		number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
	}

	public int getNumber(){
		return number;
	}
}