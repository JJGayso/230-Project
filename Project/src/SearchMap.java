import java.util.ArrayList;

public class SearchMap{
	ArrayList<ArrayList<AmusementPark>> map = new ArrayList<ArrayList<AmusementPark>>();
	
	public SearchMap(){
		
	}
	
	public void insertPark(AmusementPark park){
		Integer temp = park.getLevelOfFun();
		ArrayList<AmusementPark> list = map.get(temp);
		
		list.add(park);
	}
	
	public ArrayList<AmusementPark> getList(Integer level){
		return map.get(level);
	}
}
