import java.util.LinkedList;
import java.util.PriorityQueue;


public class Paths {
	public LinkedList<AmusementPark> parkConnections = new LinkedList<AmusementPark>();
	public AmusementPark startLocation;
	public AmusementPark endLocation;
	public int distanceTraveled;
	public int distanceCost;
	
	public Paths(AmusementPark startLocation, AmusementPark endLocation, int distanceTraveled, int distanceCost) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.parkConnections.add(startLocation);
		this.distanceTraveled = distanceTraveled;
		this.distanceCost = distanceCost;
	}
	
	public Paths(AmusementPark startLocation, AmusementPark endLocation, int distanceTraveled, int distanceCost, LinkedList<AmusementPark> route) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.distanceTraveled = distanceTraveled;
		this.distanceCost = distanceCost;
		this.parkConnections = route;
	}
	
	

}
