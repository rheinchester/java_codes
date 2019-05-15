public class Tele{
	public String color;
	public String make;
	public String model;
	public double price;
	public int volume;
	public int channel;

	public void setColor(String newColor){
		color = newColor;
	}

	public String getColor(){
		return color;
	}

	public void setMake( String newMake){
		make = newMake;
	}

	public String getMake(){
		return make;
	}

	public void setModel(String newModel){
		model = newModel;
	}

	public String getModel(){
		return model;
	}

	public void setPrice(double newPrice){
		price = newPrice;
	}

	public double getPrice(){
		return price;
	}

	public int volumeUp(int newVolume ){
		volume += 1;
		return volume;
	}

	public int volumeDown(int newVolume){
		volume -= 1;
		return volume;
	}

	public int setVolume(int newVolume){
		volume = newVolume;
		return volume;
	}

	public int setChannel(int newChannel){
		channel = newChannel;
		return channel;
	}

	public int channelUp(){
		channel += 1;
		return channel;
	}

	public int channelDown(){
		channel -= 1;
		return channel;
	}

	public int getChannel(){
		return channel;
	}
}


//color
//make
//model
//price
