public class Counter {
	protected int count;
	Counter() {count = 0;}
	public int getCount(){ return count;}
	public void incrementCount() { count++; }
	public void decrementCount() { count--;}
}

public class Example{
	public static void main(String[] args) {
		Counter c;
		Counter d = new Counter();
		c = new Counter();
		d = c;
	}
}

