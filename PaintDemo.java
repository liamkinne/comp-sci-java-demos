import java.applet.Applet; // applet class
import java.awt.*; // graphics class

public class PaintDemo extends Applet {
	public void paint (Graphics g) {
		g.setFont(new Font("serif", Font.BOLD, 13));
		g.setColor(new Color(255, 0, 0));
		g.drawString("Hello, World.", 25, 65);
		g.setColor(new Color(0, 0, 255));
		g.drawRect(20, 20, 80, 80);
		g.setColor(new Color(0, 0, 255));
		g.drawOval(20, 20, 80, 80);
		g.setColor(Color.cyan);
		g.fillRect(20, 110, 80, 40);
	}
}
