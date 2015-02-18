import java.util.LinkedList;
import java.util.PriorityQueue;


public class Paths implements Comparable<Paths>{
	public LinkedList<AmusementPark> routeByDistance = new LinkedList<AmusementPark>();
	public LinkedList<AmusementPark> routeByTime = new LinkedList<AmusementPark>();
	public AmusementPark startLocation;
	public AmusementPark endLocation;
	public double distanceTraveled;
	public double distanceCost;
	public int timeSpentTraveling;
	public int timeCost;
	
	public Paths(AmusementPark startLocation, AmusementPark endLocation, double distanceTraveled, double distanceCost) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.routeByDistance.add(startLocation);
		this.distanceTraveled = distanceTraveled;
		this.distanceCost = distanceCost;
	}
	
	public Paths(AmusementPark startLocation, AmusementPark endLocation, double distanceTraveled, double distanceCost, LinkedList<AmusementPark> route) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.distanceTraveled = distanceTraveled;
		this.distanceCost = distanceCost;
		this.routeByDistance = route;
	}
	
	public Paths(AmusementPark startLocation, AmusementPark endLocation, int timeSpentTraveling, int timeCost) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.routeByTime.add(startLocation);
		this.timeSpentTraveling = timeSpentTraveling;
		this.timeCost = timeCost;
	}
	
	public Paths(AmusementPark startLocation, AmusementPark endLocation, int timeSpentTraveling, int timeCost, LinkedList<AmusementPark> route) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.timeSpentTraveling = timeSpentTraveling;
		this.timeCost = timeCost;
		this.routeByTime = route;
	}
	

	public int compareTo(Paths p) {
		if(this.distanceCost > p.distanceCost) return 1;
		if(this.distanceCost < p.distanceCost) return -1;
		if(this.timeCost > p.timeCost) return 1;
		if(this.timeCost < p.timeCost) return -1;
		return 0;
	}
}
