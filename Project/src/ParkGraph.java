import java.util.PriorityQueue;

public class ParkGraph {
	AmusementPark starting;
	AmusementPark ending;
	int distanceTraveled;
	int timeTraveled;
	//Journey?
	//Linked list of the locations you have visited?
	PriorityQueue<AmusementPark> parks = new PriorityQueue<AmusementPark>();
	
	public ParkGraph() {
		//Start location from gui
		//End location gui
		
		this.distanceTraveled = 0;
		this.timeTraveled = 0;
		//Not really sure what this is but it was breaking a lot of code so I commented it out
//		this.links.add(starting);
	}
	
	public Boolean insert(AmusementPark park) {
		//Insert parks into the graph or to my list of locations i have visited?
		//David, I believe this insert is just all the parks possible, comes down to how you want
		//to implement it. I have an example of what I thought created
		parks.add(park);
		return true;
	}
	
	public AmusementPark search(AmusementPark park) {
		//Search for a park in the graph
		return park;
	}
}
