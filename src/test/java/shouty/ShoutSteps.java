package shouty;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.util.Collections.emptyMap;
import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;


public class ShoutSteps {
    private static final String ARBITRARY_MESSAGE = "Hello, world";
    @Autowired
    private ShoutyHelper shoutyHelper;


    @When("^(Sean|Oscar) shouts$")
    public void sean_shouts(String name) throws Throwable {
    	shoutyHelper.getShouty().shout(name, ARBITRARY_MESSAGE);
    }

    @Then("^Lucy should hear Sean$")
    public void lucy_should_hear_sean() throws Throwable {
        assertEquals(1, shoutyHelper.getShouty().getMessagesHeardBy("Lucy").size());
    }

    @Then("^(Lucy|Sean|Oscar) should hear nothing$")
    public void lucy_should_hear_nothing(String name) throws Throwable {
        assertEquals(emptyMap(), shoutyHelper.getShouty().getMessagesHeardBy(name));
    }
    
    @Then("^Lucy should not hear Oscar$")
    public void lucyShouldHearNotHearOscar() throws Throwable {
    	assertEquals(null, shoutyHelper.getShouty().getMessagesHeardBy("Lucy").get("Oscar"));
    }
    
    
    @Then("^Lucy should hear 2 shouts from Sean$")
    public void lucyShouldHear2ShoutsFromSean() throws Throwable {
    	assertEquals(2, shoutyHelper.getShouty().getMessagesHeardBy("Lucy").get("Sean").size());
    }
 
  
    
}
