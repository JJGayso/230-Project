import java.awt.geom.Point2D;

public class Links {
	public Point2D p1;
	public Point2D p2;
	public int minutes;
	public double distance;
	public AmusementPark travelToLocation;

	public Links(AmusementPark first, AmusementPark second) {
		p1 = first.getLocation();
		p2 = second.getLocation();
		this.distance = calcDistance();
		this.minutes = calcTime();
		this.travelToLocation = second;
	}

	public double calcDistance() {
		return (double) p1.distance(p2);
	}

	public int calcTime() {
		return (int) (Math.round(this.distance / 70.0)) * 60;
	}
	
	public double getDistance(){
		return this.distance;
	}
	
	public int getTime(){
		return this.minutes;
	}
	
	public AmusementPark getLinkLocation() {
		return this.travelToLocation;
	}
}
