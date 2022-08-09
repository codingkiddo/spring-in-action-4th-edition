package soundsystem;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExpressiveConfig.class);
		
		ApplicationContext applicationContext = new GenericXmlApplicationContext("soundsystem-config.xml");
		System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));

		MediaPlayer cdPlayer = (MediaPlayer) applicationContext.getBean("cdPlayer");
		cdPlayer.play();
		cdPlayer.displayTitle();
		
		
//		((AnnotationConfigApplicationContext)applicationContext).close();
		((GenericXmlApplicationContext)applicationContext).close();
	}

}
