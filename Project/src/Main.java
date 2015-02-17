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
		ParkGraph graph = new ParkGraph(DisneyWorld, CedarPoint);
		
		Links holDisW = new Links (HolidayWorld, DisneyWorld);
		Links holCed = new Links(HolidayWorld, CedarPoint);
		Links holWor = new Links(HolidayWorld, WorldsOfFun);
		Links holSix = new Links(HolidayWorld, SixFlagsOverTexas);
		Links conKno = new Links(ConeyIsland, Knoebels);
		Links knoCed = new Links(Knoebels, CedarPoint);
		Links knoDisW = new Links(Knoebels, DisneyWorld);
		Links worSix = new Links(WorldsOfFun, SixFlagsOverTexas);
		Links worGlen = new Links(WorldsOfFun, GlenwoodCavernsAdventurePark);
		Links sixGlen = new Links(SixFlagsOverTexas, GlenwoodCavernsAdventurePark);
		Links sixDisL = new Links(SixFlagsOverTexas, DisneyLand);
		Links glenKnot = new Links(GlenwoodCavernsAdventurePark, KnottsBerryFarm);
		Links knotDisL = new Links(KnottsBerryFarm, DisneyLand);
		
		Links disWhol = new Links(DisneyWorld, HolidayWorld);
		Links cedHol = new Links(CedarPoint, HolidayWorld);
		Links worHol = new Links(WorldsOfFun, HolidayWorld);
		Links sixhol = new Links(SixFlagsOverTexas, HolidayWorld);
		Links knoCon = new Links(Knoebels, ConeyIsland);
		Links cedKno = new Links(CedarPoint, Knoebels);
		Links disWKno = new Links(DisneyWorld, Knoebels);
		Links sixWor = new Links(SixFlagsOverTexas, WorldsOfFun);
		Links glenWor = new Links(GlenwoodCavernsAdventurePark, WorldsOfFun);
		Links glenSix = new Links(GlenwoodCavernsAdventurePark, SixFlagsOverTexas);
		Links disLSix = new Links(DisneyLand, SixFlagsOverTexas);
		Links knotGlen = new Links(KnottsBerryFarm, GlenwoodCavernsAdventurePark);
		Links disLKnot = new Links(DisneyLand, KnottsBerryFarm);
		
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
		
		while (!graph.paths.peek().parkConnections.contains(CedarPoint)) {
			graph.travel();
		}
		Paths bestPath = graph.paths.poll();
		for (int i = 0; i < bestPath.parkConnections.size(); i++) {
			System.out.println(bestPath.parkConnections.get(i).name);
		}
		
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