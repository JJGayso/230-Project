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
		mapPanel map = new mapPanel();
		infoPanel info = new infoPanel();
		
		
		myFrame.add(controls, BorderLayout.NORTH);
		myFrame.add(map, BorderLayout.EAST);
		myFrame.add(info, BorderLayout.SOUTH);
		
		
		
		myFrame.pack();
		myFrame.setVisible(true);
	}

}