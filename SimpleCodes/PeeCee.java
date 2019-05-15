public class PeeCee extends Device {

	private boolean hasKeyBoard;
	private boolean hasCdDrive;

	public PeeCee(boolean hasKeyBoard, boolean hasCdDrive){
		super();

		this.hasKeyBoard = hasKeyBoard;
		this.hasCdDrive = hasCdDrive;
	}

	public void power( String action){
		System.out.println("i have "+ action);
	}
}