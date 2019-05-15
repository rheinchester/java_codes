/*
Chapter 5 Sample Program: Draw a rectangle on a frame
window's content pane
File: Ch5SampleGraphics.java
*/
import javax.swing.*; //for JFrame
import java.awt.*; //for Graphics and Container
class Ch5SampleGraphics {
	public static void main( String[] args ) {
		JFrame win;
		Container contentPane;
		Graphics g;
		win = new JFrame("My First Rectangle");
		win.setSize(300, 200);
		win.setLocation(100,100);
		win.setVisible(true);
		contentPane = win.getContentPane();
		g = contentPane.getGraphics();
		g.drawRect(100,50,100,100);
	}
}