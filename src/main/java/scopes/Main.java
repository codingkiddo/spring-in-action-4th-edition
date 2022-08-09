package scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ShoppingConfig.class);
		
		StoreService service = applicationContext.getBean(StoreService.class);
		service.addToCart();
		
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
