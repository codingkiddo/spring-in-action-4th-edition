package dessert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DesertConfig.class);
		
		MyDesert myDesert = applicationContext.getBean(MyDesert.class);
		myDesert.favDesert();
		
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
