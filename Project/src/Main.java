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
		myFrame.setTitle(" Bits Please Navigation System ");
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
		controls.setMap(map);
		map.setControl(controls);
		
		//use this to find the map coords of the amusement parks
//		info.addMouseListener(new MouseAdapter() {
//			@Override 
//			public void mousePressed(MouseEvent e) {
//				System.out.println(e.getX() + "," + e.getY());
//			}
//		});
//		
		myFrame.add(controls, "cell 0 0, growy, w 250");
		myFrame.add(map , "dock east");
		myFrame.add(info , "cell 0 1, growy, w 250");
		
		myFrame.pack();
		myFrame.setVisible(true);
		//This is where the start and end come in from the gui
		ParkGraph graph = new ParkGraph(GlenwoodCavernsAdventurePark, DisneyWorld);
		
		Links holDisW = new Links (HolidayWorld, DisneyWorld, 767);
		Links holCed = new Links(HolidayWorld, CedarPoint, 395);
		Links holWor = new Links(HolidayWorld, WorldsOfFun, 393);
		Links holSix = new Links(HolidayWorld, SixFlagsOverTexas, 728);
		Links conKno = new Links(ConeyIsland, Knoebels, 195);
		Links knoCed = new Links(Knoebels, CedarPoint, 351);
		Links knoDisW = new Links(Knoebels, DisneyWorld, 980);
		Links worSix = new Links(WorldsOfFun, SixFlagsOverTexas, 496);
		Links worGlen = new Links(WorldsOfFun, GlenwoodCavernsAdventurePark, 654);
		Links sixGlen = new Links(SixFlagsOverTexas, GlenwoodCavernsAdventurePark, 883);
		Links sixDisL = new Links(SixFlagsOverTexas, DisneyLand, 1185);
		Links glenKnot = new Links(GlenwoodCavernsAdventurePark, KnottsBerryFarm, 728);
		Links knotDisL = new Links(KnottsBerryFarm, DisneyLand, 10);
		
		Links disWhol = new Links(DisneyWorld, HolidayWorld, 767);
		Links cedHol = new Links(CedarPoint, HolidayWorld, 395);
		Links worHol = new Links(WorldsOfFun, HolidayWorld, 393);
		Links sixhol = new Links(SixFlagsOverTexas, HolidayWorld, 728);
		Links knoCon = new Links(Knoebels, ConeyIsland, 195);
		Links cedKno = new Links(CedarPoint, Knoebels, 351);
		Links disWKno = new Links(DisneyWorld, Knoebels, 980);
		Links sixWor = new Links(SixFlagsOverTexas, WorldsOfFun, 496);
		Links glenWor = new Links(GlenwoodCavernsAdventurePark, WorldsOfFun, 654);
		Links glenSix = new Links(GlenwoodCavernsAdventurePark, SixFlagsOverTexas, 883);
		Links disLSix = new Links(DisneyLand, SixFlagsOverTexas, 1185);
		Links knotGlen = new Links(KnottsBerryFarm, GlenwoodCavernsAdventurePark, 728);
		Links disLKnot = new Links(DisneyLand, KnottsBerryFarm, 10);
		
		HolidayWorld.addLink(holDisW);
		HolidayWorld.addLink(holCed);
		HolidayWorld.addLink(holWor);
		HolidayWorld.addLink(holSix);
		ConeyIsland.addLink(conKno);
		Knoebels.addLink(knoCon);
		Knoebels.addLink(knoCed);
		Knoebels.addLink(knoDisW);
		CedarPoint.addLink(cedHol);
		CedarPoint.addLink(cedKno);
		DisneyWorld.addLink(disWhol);
		DisneyWorld.addLink(disWKno);
		WorldsOfFun.addLink(worHol);
		WorldsOfFun.addLink(worGlen);
		WorldsOfFun.addLink(worSix);
		SixFlagsOverTexas.addLink(sixWor);
		SixFlagsOverTexas.addLink(sixhol);
		SixFlagsOverTexas.addLink(sixGlen);
		SixFlagsOverTexas.addLink(sixDisL);
		GlenwoodCavernsAdventurePark.addLink(glenWor);
		GlenwoodCavernsAdventurePark.addLink(glenSix);
		GlenwoodCavernsAdventurePark.addLink(glenKnot);
		KnottsBerryFarm.addLink(knotGlen);
		KnottsBerryFarm.addLink(knotDisL);
		DisneyLand.addLink(disLKnot);
		DisneyLand.addLink(disLSix);
		
		//Finding best route
//		while (!graph.pathsByDistance.peek().routeByDistance.contains(DisneyWorld)) {
//			graph.travelByDistance();
//		}
//		Paths bestPath = graph.pathsByDistance.poll();
//		for (int i = 0; i < bestPath.routeByDistance.size(); i++) {
//			System.out.println(bestPath.routeByDistance.get(i).name);
//		}
		
		while (!graph.pathsByTime.peek().routeByTime.contains(DisneyWorld)) {
			graph.travelByTime();
		}
		Paths bestPath = graph.pathsByTime.poll();
		for (int i = 0; i < bestPath.routeByTime.size(); i++) {
			System.out.println(bestPath.routeByTime.get(i).name);
		}
		System.out.println(bestPath.timeSpentTraveling);
		
		graph.insert(HolidayWorld);
		graph.insert(KnottsBerryFarm);
		graph.insert(Knoebels);
		graph.insert(GlenwoodCavernsAdventurePark);
		graph.insert(WorldsOfFun);
		graph.insert(SixFlagsOverTexas);
		graph.insert(ConeyIsland);
		graph.insert(CedarPoint);
		graph.insert(DisneyLand);
		graph.insert(DisneyWorld);
	}

}