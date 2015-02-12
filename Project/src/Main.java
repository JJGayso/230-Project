import java.awt.BorderLayout;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

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
		myFrame.setLayout(new MigLayout());
		myFrame.setTitle(" Bits Please ");
		
		ControlPanel controls = new ControlPanel();
		mapPanel map = new mapPanel();
		infoPanel info = new infoPanel();
		
		myFrame.add(controls, "cell 0 0, growy, w 250");
		myFrame.add(map , "dock east");
		myFrame.add(info , "cell 0 1, growy, w 250");
		
		myFrame.pack();
		myFrame.setVisible(true);
		
		ParkGraph graph = new ParkGraph();
		
		
		AmusementPark HolidayWorld = new AmusementPark("Holiday World", 50, 50, 10);
		AmusementPark DisneyWorld = new AmusementPark("Disney World", 90, 20, 9);
		AmusementPark DisneyLand = new AmusementPark("Disneyland", 5, 40, 8);
		AmusementPark CedarPoint = new AmusementPark("Cedar point", 70, 60, 4);
		AmusementPark ConeyIsland = new AmusementPark("Coney Island", 100, 80, 2);
		AmusementPark SixFlagsOverTexas = new AmusementPark("Six Flags over Texas", 35, 15, 7);
		AmusementPark WorldsOfFun = new AmusementPark("Worlds of Fun", 40, 50, 1);
		AmusementPark GlenwoodCavernsAdventurePark= new AmusementPark("Glenwood Caverns Adventure Park", 10, 70, 3);
		AmusementPark Knoebels = new AmusementPark("Knoebels", 95, 80, 6);
		AmusementPark KnottsBerryFarm = new AmusementPark("Knotts Berry Farm", 7, 30, 5);
		
		Links holDisConnection = new Links (HolidayWorld, DisneyLand);
		HolidayWorld.addLink(holDisConnection);
		DisneyLand.addLink(holDisConnection);
		
		graph.insert(HolidayWorld);
	}

}