package soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import soundsystem.CDPlayer;
import soundsystem.CompactDisc;

@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {

	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer();
	}
}
