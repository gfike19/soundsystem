package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer implements MediaPlayer {

	@Autowired
	private CompactDisc cd;
	
	public void play() {
		cd.play();
	}

}
