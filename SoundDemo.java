import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class SoundDemo extends Applet implements ActionListener {
	Button playSound, stopSound;
	AudioClip tada, glass;

	public void init() {
		stopSound = new Button("Stop Sound");
		add(stopSound);
		stopSound.addActionListener(this);

		glass = getAudioClip(getCodeBase(), "breaking glass.wav");
		playSound = new Button("Play Sound");
		add(playSound);
		playSound.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == playSound) glass.loop();
		else glass.stop();
	}
}
