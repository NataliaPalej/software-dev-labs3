package layouts_example;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GridLayoutExample extends JFrame {
	
	Container cp;
	
	// Grid Layout
	JButton b1 = new JButton("First Button");
	JButton b2 = new JButton("Second");
	JButton b3 = new JButton("Third Button");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("Fith Button-Long Name");
	
	public GridLayoutExample() {
		cp = getContentPane();
		
		cp.setLayout(new GridLayout(3, 2));
		
		setTitle("Grid Bag LayoutExample");
		
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
		cp.add(b5);
		
		setSize(400, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GridLayoutExample();
	}
}
