import java.applet.Applet;
import java.awt.*;
import java.Text.DecimalFormat;

public class RealDemo extends Applet {
	float f = 2.345f;
	double d = 5.678;
	double prod, quot;
	double e = 1.456E+45;
	int i;
	DecimalFormat precision2;

	public void init() {
		precision2 = new DecimalFormat("#0.00");
	}

	public void paint(Graphics g) {
		g.drawString("Float = " + f, 25, 50);
		g.drawString("Double = " + d, 25, 75);
		g.drawString("Precise product is " + (f*d), 25, 100);
		g.drawString("Rounded product is " + precision2.format(f*d), 25, 125);
		g.drawString("Exponent value is " + e, 25, 100);
		g.drawString("Exponent times float is " + e*f, 25, 175);

		g.drawString("Float rounded is" + Math.round(f), 25, 200);
		g.drawString("Double rounded is " + Math.round(d), 25, 225);
		g.drawString("Square root of float is" + Math.sqrt(f), 25, 250);
		g.drawString("The largest of f and d is " + Math.max(f,d), 25, 275);
		g.drawString("A random real from 0 to 1 is " + Math.random(), 25, 300);
		g.drawString("Integer value of float " + f + " is " + (int)(f), 25, 350);
		g.drawString("Integer value of double " + d + " is " + (int)(d), 25, 375);
		g.drawString("A random integer from 1 to 100 is " (int)(Math.random() * 100 + 1), 25, 400);
		g.drawString("Integer value of 33/7 is " + (33/7), 25, 425);
		g.drawString("Double value of 33/7 is " + (double)(33/7), 25, 450);
	}
}
