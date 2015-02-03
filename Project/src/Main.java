import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * @author Your team number and names here and in all your code files
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Add code here.  Create any other needed methods in this class, 
		//      and any other classes that you need.
		JFrame myFrame = new JFrame();
		myFrame.setTitle("");
		myFrame.setSize(1000,900);
		
		ControlPanel controls = new ControlPanel();
		ViewPanel map = new ViewPanel();
		
		myFrame.add(controls, BorderLayout.NORTH);
		myFrame.add(map, BorderLayout.CENTER);
		
		
		
		myFrame.setVisible(true);
	}

}