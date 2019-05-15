public class DeviceTest {
	public static void main(String[] args) {
		Device d = new Device();
		PeeCee pc = new PeeCee(true, true);
		Phone p = new Phone();

	    pc.setMake("Hp");
		pc.setModel("Envy");
		pc.setOs("windows");
		pc.setProcessorSpeed(2400);
		pc.setMemory("1 Terabyte");


		p.setMake("Samsung");
		p.setModel("Galaxy S7");
		p.setOs("Android");
		p.setProcessorSpeed(2400);
		p.setMemory("300 GB");
		p.increaseProcessorSpeed(5);


		d.setMake("Apple");
		d.setModel("iPad 3");
		d.setOs("iOS");
		d.setProcessorSpeed(2400);
		d.setMemory("700 GB ");

		System.out.println(p.getMake());
		System.out.println(p.getModel());
		System.out.println(p.getOs());
		System.out.println(p.getProcessorSpeed());
		System.out.println(p.getMemory());
		System.out.println(p.increaseProcessorSpeed(5));

	}
}