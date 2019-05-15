public class Device{
	//fields
	private String model; //why did they use private here if i can access it in the other class
	private String make;
	private String os;
	private int processorSpeed;
	private String memory;
	

	//method (setters and getters)
	protected void setModel( String newModel ){
		model = newModel; //we are calling public string model here
	}

	public void setMake( String make){
		this.make = make;
	}

	public void setOs( String os){
		this.os = os;
	}

	public void setProcessorSpeed(int processorSpeed ){
		this.processorSpeed = processorSpeed;
	}

	public void setMemory( String newMemory){
		memory = newMemory;
	}

	public String getModel(){
		return this.model;
	}

	public String getMake(){
		return this.make;
	}

	protected String getOs(){
		return this.os;
	}

	public int getProcessorSpeed(){
		return this.processorSpeed;
	}

	public String getMemory(){
		return this.memory;
	}

	protected int increaseProcessorSpeed(int speed){
		this.processorSpeed += speed;
		return this.processorSpeed;
	};
}






