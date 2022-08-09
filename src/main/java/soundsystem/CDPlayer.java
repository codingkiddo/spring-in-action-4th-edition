package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class CDPlayer implements MediaPlayer {

	@Autowired
	@Qualifier("blank")
	private CompactDisc cd;
	
	
	@Value("#{disc.title.toUpperCase()}")
	private String title;

	@Value("#{T(java.lang.Math).PI}")
	private double PI;
	
	@Value("#{2 * T(java.lang.Math).PI * 100.0 }")
	private double circumference;
	
	@Value("#{ disc.email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.com' }")
	private boolean isEmailValid;
	
	public void play() {
		cd.play();
	}

	public void displayTitle() {
		System.out.println(this.title);
		System.out.println(this.PI);
		System.out.println(this.circumference);
		System.out.println(this.isEmailValid);
	}
}
