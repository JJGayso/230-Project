import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing {
	
	@Test
	public void testGetName(){
		AmusementPark HolidayWorld = new AmusementPark("Holiday World", 50, 50, 10);
		String name = "Holiday World";
		assertEquals(name, HolidayWorld.getName());
	}
	
	@Test
	public void testCreatLink(){
		AmusementPark holidayWorld = new AmusementPark("Holiday World", 50, 50, 10);
		AmusementPark  disneyWorld= new AmusementPark("Disney World", 90, 20, 9);
		Links link = new Links(holidayWorld, disneyWorld);
//		System.out.println(link.getDistance());
//		System.out.println(link.getTime());
//		assertEquals(name, HolidayWorld.getName());
	}
	
	@Test
	public void testLinks(){
		AmusementPark HolidayWorld = new AmusementPark("Holiday World", 50, 50, 10);
		AmusementPark DisneyLand = new AmusementPark("Disneyland", 5, 40, 8);
		Links holDisConnection = new Links (HolidayWorld, DisneyLand);
		HolidayWorld.addLink(holDisConnection);
		DisneyLand.addLink(holDisConnection);
		
		assertEquals(holDisConnection.getDistance(), HolidayWorld.getLinks().get(0).getDistance());
		assertEquals(HolidayWorld.getLinks().get(0).getDistance(), DisneyLand.getLinks().get(0).getDistance());
	}

}
