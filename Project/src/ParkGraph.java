import java.util.PriorityQueue;


public class ParkGraph {
	AmusementPark starting;
	AmusementPark ending;
	int distanceTraveled;
	int timeTraveled;
	//Journey?
	//Linked list of the locations you have visited?
	PriorityQueue<AmusementPark> parksVisited;
	
	public ParkGraph() {
		//Start location from gui
		//End location gui
		
		this.distanceTraveled = 0;
		this.timeTraveled = 0;
		this.links.add(starting);
	}
	
	public Boolean insert(AmusementPark park) {
		//Insert parks into the graph or to my list of locations i have visited?
		return true;
	}
	
	public AmusementPark search(AmusementPark park) {
		//Search for a park in the graph
		return park;
	}
}
