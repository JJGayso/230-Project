import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class ParkGraph {
	AmusementPark starting;
	AmusementPark ending;
	int distanceTraveled;
	int distancecost; //a.k.a. straight line distance from the point to final destination
	int timeTraveled;
	PriorityQueue<Paths> paths = new PriorityQueue<Paths>();
	ArrayList<Links> currentLocationLinks = new ArrayList<Links>(); //Neighbors of current
	
	public ParkGraph() {
		//Start location from gui
		//End location gui
		this.distanceTraveled = 0;
		this.distancecost = (int) starting.getLocation().distance(ending.getLocation()); //Need to add links and the distances
		this.timeTraveled = 0;
		this.paths.add(new Paths(starting, ending, distanceTraveled, distancecost));
	}
	
	//I have a better explanation on paper so just ask, but basically this method will be called after go is pressed, 
	//and will continue to be called until reaching final (which means that the ending location has been reached and has been added to the priority queue with the total distance traveled.
	public PriorityQueue<Paths> travel() {
		Paths bestPath = paths.poll();
		distanceTraveled = bestPath.distanceTraveled;
		AmusementPark currentLocation = bestPath.parkConnections.getLast();
		currentLocationLinks = currentLocation.getLinks(); //This needs to return an array list of Amusement Parks that the current location is connected to 
		for (int i = 0; i < currentLocationLinks.size(); i++) {
			AmusementPark placeToGo = currentLocationLinks.get(i).getLinkLocation();
			if (!bestPath.parkConnections.contains(placeToGo)) {
				LinkedList<AmusementPark> temp = (LinkedList<AmusementPark>) bestPath.parkConnections.clone();
				temp.add(placeToGo);
				Paths newPath = new Paths(starting, ending, currentLocationLinks.get(i).getDistance() + distanceTraveled, (int) placeToGo.getLocation().distance(ending.getLocation()), temp);
				paths.add(newPath); //Before calling travel check to see if final location is in the linked list or just check the distance cost which should be zero
			}
		}
		return this.paths; //Returns the first path in the priority queue
	}
	
	public AmusementPark search(AmusementPark park) {
		//Search for a park in the graph
		return park;
	}

	public void insert(AmusementPark holidayWorld) {
		// TODO Auto-generated method stub
		
	}
}
