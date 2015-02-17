import java.util.LinkedList;
import java.util.PriorityQueue;


public class Paths implements Comparable<Paths>{
	public LinkedList<AmusementPark> parkConnections = new LinkedList<AmusementPark>();
	public AmusementPark startLocation;
	public AmusementPark endLocation;
	public double distanceTraveled;
	public double distanceCost;
	
	public Paths(AmusementPark startLocation, AmusementPark endLocation, double distanceTraveled, double distanceCost) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.parkConnections.add(startLocation);
		this.distanceTraveled = distanceTraveled;
		this.distanceCost = distanceCost;
	}
	
	public Paths(AmusementPark startLocation, AmusementPark endLocation, double distanceTraveled, double distanceCost, LinkedList<AmusementPark> route) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.distanceTraveled = distanceTraveled;
		this.distanceCost = distanceCost;
		this.parkConnections = route;
	}

	public int compareTo(Paths p) {
		if(this.distanceCost > p.distanceCost) return 1;
		if(this.distanceCost < p.distanceCost) return -1;
		return 0;
	}
}
