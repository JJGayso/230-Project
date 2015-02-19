import java.util.ArrayList;

public class SearchMap {
	ArrayList<ArrayList<AmusementPark>> map = new ArrayList<ArrayList<AmusementPark>>();

	public SearchMap() {
		for (int i = 0; i < 20; i++) {
			map.add(i, null);
		}
	}

	public void insertPark(AmusementPark park) {
		Integer temp = park.getLevelOfFun();
		if (map.get(temp) == null) {
			ArrayList<AmusementPark> adding = new ArrayList<AmusementPark>();
			adding.add(park);
			map.set(temp, adding);
		} else {
			ArrayList<AmusementPark> list = map.get(temp);
			list.add(park);
		}
	}

	public ArrayList<AmusementPark> getList(Integer level) {
		ArrayList<AmusementPark> temp = new ArrayList<AmusementPark>();
		for(int i = level; i >= 1; i--){
			temp.addAll(map.get(i));
		}
		return temp;
	}
}