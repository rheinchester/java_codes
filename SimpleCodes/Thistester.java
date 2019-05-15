public class Thistester{
	public int dog = 2;
	public void clobber(){
	int dog = 5;

	System.out.println("local variable ="+ dog);
	System.out.println("field ="+this.dog );
	}
	public static void main(String[] args) {
		Thistester t = new Thistester();
		t.clobber();
	
	}
}
//local variable =5
//field =2
//this.dog  is used to call field

