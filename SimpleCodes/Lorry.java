public class Lorry extends Vehicle{

	private boolean hasCarriage;
	private boolean usesDiesel;

	public Lorry( boolean hasCarriage , boolean usesDiesel){
		super();

		this.hasCarriage = hasCarriage;
		this.usesDiesel = usesDiesel;
	}


	public void unload( String item){
		System.out.println("unloaded " +item);
	}

}