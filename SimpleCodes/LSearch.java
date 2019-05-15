
public class LSearch{
	public int binarySearch(int[] number, int searchValue){
		int low = 0;
		int high = number.length-1;
		int mid = (low + high)/2;

		while (low<=high && number[mid]!=searchValue){ //if low is equal to high, we have one value
			if (number[mid]<searchValue){
				low = mid + 1;//the number after middle point is the highest value (hence all numbers before mid is scratched off)	
			}else{
				high = mid -1;// the number before mid is the highes number. scratch all values after mid;
			}
			mid = (low + high)/2;//keep locating the mid			
		}   	
		if (low> high){
			mid = NOT_FOUND;
		}
		return mid;
	}
}
 













































































// public class 
// public int LSearch(int key, int[] array){
// 	for (int i = 0; i<array.length; i++){
// 		if (array[i] == key) {
// 			return i;
// 		}
// 		else {
// 			return -1;
// 		}
// 	}
// }