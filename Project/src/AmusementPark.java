import java.awt.geom.Point2D;
import java.util.ArrayList;

public class AmusementPark {
	public int levelOfFun;
	Point2D.Double location = new Point2D.Double();
	ArrayList<Links> ParkConnections;
	
	public AmusementPark(int xCoordinate, int yCoordinate, int levelOfFun){
		location = new Point2D.Double(xCoordinate, yCoordinate);
		levelOfFun = levelOfFun;
	}
	
	public ArrayList<Links> getLinks(){
		return ParkConnections;
	}
	
	public int getLevelOfFun(){
		return levelOfFun;
	}
	
	public Point2D.Double getLocation(){
		return location;
	}
	
	AmusementPark HolidayWorld = new AmusementPark(50, 50, 10);
	AmusementPark DisneyWorld = new AmusementPark(90, 20, 9);
	AmusementPark DisneyLand = new AmusementPark(5, 40, 8);
	AmusementPark CedarPoint = new AmusementPark(70, 60, 4);
	AmusementPark ConeyIsland = new AmusementPark(100, 80, 2);
	AmusementPark SixFlagsOverTexas = new AmusementPark(35, 15, 7);
	AmusementPark WorldsOfFun = new AmusementPark(40, 50, 1);
	AmusementPark  GlenwoodCavernsAdventurePark= new AmusementPark(10, 70, 3);
	AmusementPark Knoebels = new AmusementPark(95, 80, 6);
	AmusementPark KnottsBerryFarm = new AmusementPark(7, 30, 5);
	
}
