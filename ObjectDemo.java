import java.applet.Applet;
import java.awt.*;

public class ObjectDemo extends Applet {
	Color color1, color2, color3;
	Font font1;
	
	public void init() {
		setBackground(Color.yellow);
		color1 = new Color(255, 50, 50);
		color2 = new Color(50, 255, 50);
		color3 = new Color(50, 50, 255);
		font1 = new Font("SansSerif", Font.ITALIC, 14);
	}
	
	public void paint(Graphics g) {
		g.setColor(color1);
		g.drawRect(20, 20, 120, 60);
		g.setColor(color2);
		g.fillOval(20, 20, 120, 60);
		g.setColor(color3);
		g.setFont(font1);
		g.drawString("Hello, world", 50, 50);
	}
}
