import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class AmusementPark {
	public int levelOfFun;
	public Point2D.Double location = new Point2D.Double();
	public ArrayList<Links> parkConnections = new ArrayList<Links>();
	public String name; 
	public Color color;
	
	public AmusementPark(String name, int xCoordinate, int yCoordinate, int levelOfFun){
		this.location = new Point2D.Double(xCoordinate, yCoordinate);
		this.levelOfFun = levelOfFun;
		this.name = name;
		color = Color.RED;
	}
	
	public ArrayList<Links> getLinks(){
		return this.parkConnections;
	}
	
	public int getLevelOfFun(){
		return this.levelOfFun;
	}
	
	public Point2D.Double getLocation(){
		return this.location;
	}	
	
	public String getName(){
		return this.name;
	}
	
	public void addLink(Links q){
		this.parkConnections.add(q);
	}
}
