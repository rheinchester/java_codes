public class ArrayStudy1{
	public static void main(String[] args) {
		double[] arr = {1.1,2.1,4.1,4.1};
		//print all the list
		for (int i = 0;i<arr.length ;i++ ) {
			System.out.println(arr[i] +" ");
		}
		//summing all the list
		double total = 0;
		for (int i = 0; i<arr.length ; i++ ) {
			total += arr[i];
			System.out.println(total);	
		//finding max
		double max = arr[0];//max is the first element
		for (int j = 0;j<arr.length ;j++ ) {//iterate
			if (arr[j] > max) {
				max = arr[j];
				}
			}
			System.out.println(max);

		}

	}
}

//double[] myList = new double[10]; 
	//or
//dataType[] arrayRefVar = {value0, value1, ..., valuek}; 

