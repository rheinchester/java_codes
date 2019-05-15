public class Teletest{
	public static void main(String[] args) {
		Tele teleObject = new Tele();
		System.out.println(teleObject);

		teleObject.setMake("toshiba");
		System.out.println(teleObject.getMake());
		teleObject.volumeUp(1);
		teleObject.volumeUp(1);	
		teleObject.volumeDown(1);
		System.out.println(teleObject.volumeDown(1));
		System.out.println(teleObject.volumeUp(9));
		System.out.println(teleObject.volumeUp(1));
		System.out.println(teleObject.volumeDown(1)); 
		System.out.println(teleObject.setChannel(123));
		System.out.println(teleObject.channelUp());
		int v = teleObject.getChannel() ;
		System.out.println(v);

	}
}