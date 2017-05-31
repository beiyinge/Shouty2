package shouty;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static java.util.Collections.emptyMap;

public class ShoutyTest {

	@Test
	public void it_doesnt_return_shouts_from_listerner() {
		Shouty shouty = new Shouty();
		shouty.setLocation("me", new Coordinate(0,0));
		shouty.shout("me", "hello world");
		assertEquals(emptyMap(), shouty.getMessagesHeardBy("me"));
		
	}
}
