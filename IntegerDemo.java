import java.applet.Applet;
import java.awt.*;


public class IntegerDemo extends Applet {
	int n, m, sum, diff, prod, quot, rem;
	
	public void init() {
		n = 25;
		m = 6;
		sum = n + m;
		diff = n - m;
		prod = n * m;
		quot = n / m;
		rem = n % m;
	}
	
	public void paint (Graphics g) {
		g.drawString("The original values are: " + n + " and " + m, 25, 25);
		g.drawString("The sum is: " + sum, 25, 50);
		g.drawString("The difference is: " + diff, 25, 75);
		g.drawString("The product is: " + prod, 25, 100);
		g.drawString("The quotent is: " + quot, 25, 125);
		g.drawString("the remainder is: " + rem, 25, 150);
		g.drawString("(n + m) / (n - m): " + (n + m) / (n - m), 25, 175);
		g.drawString("(n + m) * (n - m): " + (n + m) * (n - m), 25, 200);
		g.drawString("n + n / m: " + n + n / m, 25, 225);
		g.drawString("n / m + n: " + n / m + n, 25, 250);
		g.drawString("n / (m + n): " + n / (m + n), 25, 275);
	}
}
