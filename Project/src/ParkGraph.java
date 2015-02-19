import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class ParkGraph {
	AmusementPark starting;
	AmusementPark ending;
	double distanceTraveled;
	double distanceCost; //a.k.a. straight line distance from the point to final destination
	int timeSpentTraveling;
	int timeCost;
	PriorityQueue<Paths> pathsByDistance = new PriorityQueue<Paths>();
	PriorityQueue<Paths> pathsByTime = new PriorityQueue<Paths>();
	ArrayList<Links> currentLocationLinks = new ArrayList<Links>(); //Neighbors of current
	ArrayList<AmusementPark> parks = new ArrayList<AmusementPark>();
	
	public ParkGraph(AmusementPark start, AmusementPark stop) {
		this.starting = start;
		this.ending = stop;
		this.distanceTraveled = 0;
		this.distanceCost = (double) starting.getLocation().distance(ending.getLocation()); //Need to add links and the distances
		this.timeCost = (int) starting.getLocation().distance(ending.getLocation());
		this.timeSpentTraveling = 0;
		this.pathsByDistance.add(new Paths(starting, ending, distanceTraveled, distanceCost));
		this.pathsByTime.add(new Paths(starting, ending, timeSpentTraveling, timeCost));
	}
	
	//I have a better explanation on paper so just ask, but basically this method will be called after go is pressed, 
	//and will continue to be called until reaching final (which means that the ending location has been reached and has been added to the priority queue with the total distance traveled.
	public PriorityQueue<Paths> travelByDistance() {
		Paths bestPath = pathsByDistance.poll();
		distanceTraveled = bestPath.distanceTraveled;
		AmusementPark currentLocation = bestPath.routeByDistance.getLast();
		currentLocationLinks = currentLocation.getLinks(); //This needs to return an array list of Amusement Parks that the current location is connected to 
		if (currentLocationLinks.size() == 0) return this.pathsByDistance;
		for (int i = 0; i < currentLocationLinks.size(); i++) {
			AmusementPark placeToGo = currentLocationLinks.get(i).getLinkLocation();
			if (!bestPath.routeByDistance.contains(placeToGo)) {
				LinkedList<AmusementPark> temp = (LinkedList<AmusementPark>) bestPath.routeByDistance.clone();
				temp.add(placeToGo);
				Paths newPath = new Paths(starting, ending, currentLocationLinks.get(i).getDistance() + distanceTraveled, (double) placeToGo.getLocation().distance(ending.getLocation()) + distanceTraveled, temp);
				pathsByDistance.add(newPath); //Before calling travel check to see if final location is in the linked list or just check the distance cost which should be zero
			}
		}
		return this.pathsByDistance; //Returns the first path in the priority queue
	}
	
	public PriorityQueue<Paths> travelByTime() {
		Paths bestPath = pathsByTime.poll();
		timeSpentTraveling = bestPath.timeSpentTraveling;
		AmusementPark currentLocation = bestPath.routeByTime.getLast();
		currentLocationLinks = currentLocation.getLinks(); 
		if (currentLocationLinks.size() == 0) return this.pathsByTime;
		for (int i = 0; i < currentLocationLinks.size(); i++) {
			AmusementPark placeToGo = currentLocationLinks.get(i).getLinkLocation();
			if (!bestPath.routeByTime.contains(placeToGo)) {
				LinkedList<AmusementPark> temp = (LinkedList<AmusementPark>) bestPath.routeByTime.clone();
				temp.add(placeToGo);
				Paths newPath = new Paths(starting, ending, currentLocationLinks.get(i).getTime() + timeSpentTraveling, (int) placeToGo.getLocation().distance(ending.getLocation()) + timeSpentTraveling, temp);
				pathsByTime.add(newPath);
			}
		}
		return this.pathsByTime;
	}
	
	public AmusementPark search(AmusementPark park) {
		//Search for a park in the graph
		return park;
	}

	public void insert(AmusementPark park) {
		parks.add(park);
	}
}
