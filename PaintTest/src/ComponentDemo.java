import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ComponentDemo extends Applet implements ActionListener {
	Label myPrompt1, myPrompt2;
	TextField value1, value2;
	Button addButton;

	public void init() {
		// init components
		myPrompt1 = new Label("This class will add two numbers.");
		myPrompt2 = new Label("Type in the numbers in the spaces.");
		value1 = new TextField(10); // 10 is width of field in pixels
		value2 = new TextField(10);
		addButton = new Button("Press to add");

		// add the components to the window object
		add(myPrompt1);
		add(myPrompt2);
		add(value1);
		add(value2);
		add(addButton);
		
		// add listener
		addButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		int answer = Integer.parseInt(value1.getText());
		answer += Integer.valueOf(value2.getText());
		showStatus(Integer.toString(answer));
		repaint();
	}
}
