package dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyDesert {

	@Autowired
	@Fruity
	private Dessert dessert;
	
	
	public void favDesert() {
		System.out.println("My Fav Desert Is: " + dessert);
	}
}
