public class ArrayCopy1{
	public static void main(String[] args) {
		char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e'};
		char[] copyTo  = new char[7];
		System.arraycopy(copyFrom,2,copyTo,0,7);
		 for (int i = 0;i<copyTo.length ;i++ ) {
		 	System.out.println(copyTo[i]);
		 }

	}
}