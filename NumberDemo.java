import java.applet.Applet;
import java.applet.awt.*;
import java.text.DeciamalFormat;

public class NumberDemo extends Applet {
	String s1, s2;
	String s3 = "76.5156";
	int int1, int2;
	double real1;
	DeciamalFormat precision2;

	public void init() {
		s1 = new String("1256");
		s2 = "5678";

		precision2 = new DeciamalFormat("#.00");

		int1 = Integer.parseInt(s1);
		int2 = Integer.valueOf(s2).intValue();
		real1 = Double.valueOf(s3).doubleValue();
	}

	public void paint(Graphics g) {
		g.drawString(Integer.toString(int1), 25, 25);
		g.drawString(Integer.toString(int2), 25, 50);
		g.drawString(Double.toString(real1), 25, 75);
		g.drawString(precision2.format(real1), 25, 100);
	}
}
