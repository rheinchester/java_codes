public class ArrayMethod{
	public static void main(String[] args) {
	int[] anArray = { 
    100, 200, 300,
    400, 500, 600, 
    700, 800, 900, 1000
};

//multidime.
	String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

	int[] num ;
	num = new int[12];

	for (int i= 0; i<num.length ;i++ ) {
		System.out.println(num[i]);
	}
	System.out.println(names[1][0]);
	}
}