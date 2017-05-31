package shouty;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ShoutyHooks {

	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Before (order = 4)
	public void before4() {
		System.out.println("Before 4");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
}
