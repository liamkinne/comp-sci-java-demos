import java.applet.Applet;
import java.awt.*;

public class ImageDemo extends Applet {
	Image butterfly, picture;

	public void init() {
		butterfly = getImage(getDocumentBase(), "butterfly.gif");
		picture = getImage(getDocumentBase(), "picture.gif");
	}

	public void paint(Graphics g) {
		g.drawImage(picture, 50, 60, this);

		int width = butterfly.getWidth();
		int height = butterfly.getHeight();

		g.drawImage(butterfly, 130, 250, width*2, height*2, this);
	}
}
