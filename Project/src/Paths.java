import java.util.ArrayList;


public class Paths {
	public ArrayList<Links> parkConnections = new ArrayList<Links>();
	int total = 0;
	
	Paths(){
	}
	
	public void addPath(Links l){
		this.parkConnections.add(l);
		this.total += l.distance;
	}
	
	public ArrayList<Links> getPaths(){
		return this.parkConnections;
	}
	
	public int getTotal(){
		return this.total;
	}
}
