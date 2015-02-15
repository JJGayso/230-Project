import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

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
		ArrayList<AmusementPark> parks = new ArrayList<AmusementPark>();
		
		AmusementPark HolidayWorld = new AmusementPark("Holiday World", 579, 285, 10);
		parks.add(HolidayWorld);
		AmusementPark DisneyWorld = new AmusementPark("Disney World", 680, 460, 9);
		parks.add(DisneyWorld);
		AmusementPark DisneyLand = new AmusementPark("Disneyland", 105, 328, 8);
		parks.add(DisneyLand);
		AmusementPark CedarPoint = new AmusementPark("Cedar point", 627, 218, 4);
		parks.add(CedarPoint);
		AmusementPark ConeyIsland = new AmusementPark("Coney Island", 756, 208, 2);
		parks.add(ConeyIsland);
		AmusementPark SixFlagsOverTexas = new AmusementPark("Six Flags over Texas", 416, 395, 7);
		parks.add(SixFlagsOverTexas);
		AmusementPark WorldsOfFun = new AmusementPark("Worlds of Fun", 466, 277, 1);
		parks.add(WorldsOfFun);
		AmusementPark GlenwoodCavernsAdventurePark= new AmusementPark("Glenwood Caverns Adventure Park", 281, 253, 3);
		parks.add(GlenwoodCavernsAdventurePark);
		AmusementPark Knoebels = new AmusementPark("Knoebels", 707, 216, 6);
		parks.add(Knoebels);
		AmusementPark KnottsBerryFarm = new AmusementPark("Knotts Berry Farm", 95, 315, 5);
		parks.add(KnottsBerryFarm);
		
		
		infoPanel info = new infoPanel();
		mapPanel map = new mapPanel(parks, info);
		ControlPanel controls = new ControlPanel(info);
		map.setControl(controls);
		
		//use this to find the map coords of the amusement parks
//		map.addMouseListener(new MouseAdapter() {
//			@Override 
//			public void mousePressed(MouseEvent e) {
//				System.out.println(e.getX() + "," + e.getY());
//			}
//		});
		
		myFrame.add(controls, "cell 0 0, growy, w 250");
		myFrame.add(map , "dock east");
		myFrame.add(info , "cell 0 1, growy, w 250");
		
		myFrame.pack();
		myFrame.setVisible(true);
		
		ParkGraph graph = new ParkGraph();
		
		

		
		Links holDisConnection = new Links (HolidayWorld, DisneyLand);
		HolidayWorld.addLink(holDisConnection);
		DisneyLand.addLink(holDisConnection);
		
		graph.insert(HolidayWorld);
	}

}