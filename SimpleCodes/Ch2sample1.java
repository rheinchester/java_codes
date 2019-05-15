import javax.swing.*;
class Ch2sample1  {
	public static void main(String[] args) {
		JFrame  myWindow;//object naming convention
		myWindow = new JFrame();
		myWindow.setSize(300, 200);
		myWindow.setTitle("My first java program");
		myWindow.setVisible(true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}