package layouts_example;

import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GridBagLayoutExample extends JFrame {
	
	Container cp;
	
	// Grid Bag Layout 
	JButton b1 = new JButton("First Button");
	JButton b2 = new JButton("Second");
	JButton b3 = new JButton("Third Button");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("Fith Button-Long Name");
	
	public GridBagLayoutExample() {
		cp = getContentPane();
		
		cp.setLayout(new GridBagLayout());
		
		setTitle("Grid Bag Layout Example");
		
		setSize(400, 400);
		setVisible(true);
		
		
	}

}
