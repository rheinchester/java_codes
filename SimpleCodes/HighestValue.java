public class HighestValue{
	public static void main(String[] args) {


		
		int	highestValue = myArray[0];
		for (int i=0;i<myArray.length ;i++ ) {
			if (myArray[i]>highestValue) {
				highestValue = myArray[i];
				
			}
		}
	}
}