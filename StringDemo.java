import java.applet.Applet;
import java.awt.*;

public class StringDemo extends Applet {
	String s1, s2, s3, s4,
	s5 = "How are you?";
	
	public void init() {
		s1 = new String();
		s2 = new String("Hello");
		s3 = new String(s2);
		s4 = "	Hello	";
	}

	public void paint(Graphics g) {
		g.drawString(s2 + ". What a nice day.", 25, 25);
		g.drawString("s2 equals: " + s2, 25, 50);
		g.drawString("Length of s2 is " + s2.length(), 25, 75);
		g.drawString("UpperCase is " + s2.toUpperCase(), 25, 100);
		g.drawString("LowerCase is " + s2.toLowerCase(), 25, 125);

		s1 = s4.trim();
		g.drawString("The original s4 is:" + s4, 25, 150);
		g.drawString("After trimming s4 is: " + s1, 25, 175);

		s1 = s2.replace("H", "h");
		g.drawString("s2 after replace is " + s1, 25, 200);
	}
}
