
public class LSearch{
	public int linearSearch (int[] number, int searchValue) {
		int loc = 0;
		while ( loc < number.length && number[loc] != searchValue ) {
		loc++;
		}
		if (loc == number.length) { //Not found
		return NOT_FOUND;
		} else {
		return loc; //Found, return the position
}

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