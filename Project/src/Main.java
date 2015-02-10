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
		myFrame.setTitle(" Bits Please ");
		
		ControlPanel controls = new ControlPanel();
		ViewPanel map = new ViewPanel();
		
		myFrame.add(controls, BorderLayout.WEST);
		myFrame.add(map, BorderLayout.CENTER);
		
		
		myFrame.pack();
		myFrame.setVisible(true);
	}

}