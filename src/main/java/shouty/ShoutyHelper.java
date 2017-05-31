package shouty;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class ShoutyHelper {
	private Shouty shouty = new Shouty();

	public Shouty getShouty() {
		return shouty;
	}



}
