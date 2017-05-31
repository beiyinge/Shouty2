package shouty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.en.Given;

public class LocationSteps {
	@Autowired
	private ShoutyHelper shoutyHelper;
	
    @Given("^people are located at$")
    public void peopleAreLocatedAt(List<PeopleCoordinates> pcList) throws Throwable {
    	for (PeopleCoordinates pc : pcList) {
    		shoutyHelper.getShouty().setLocation(pc.getName(), new Coordinate(pc.getX(), pc.getY()));
    	}
    }
    
    @Given("^(Lucy|Sean|Oscar) is at (\\d+), (\\d+)$")
    public void lucy_is_at(String name, int xCoord, int yCoord) throws Throwable {
    	shoutyHelper.getShouty().setLocation(name, new Coordinate(xCoord, yCoord));
    }
}
