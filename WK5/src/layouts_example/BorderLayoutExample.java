package layouts_example;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BorderLayoutExample extends JFrame {
	
	// Border Layout - when used, the position of the component needs to be specified 	
	JButton north = new JButton("North");
	JButton east = new JButton("East");
	JButton west = new JButton("West");
	JButton south = new JButton("South");
	JButton center = new JButton("Center");
	
	public BorderLayoutExample() {
		setTitle("Border Layout Example");
		
		getContentPane().add(north, BorderLayout.NORTH);
		getContentPane().add(east, BorderLayout.EAST);
		getContentPane().add(west, BorderLayout.WEST);
		getContentPane().add(south, BorderLayout.SOUTH);
		getContentPane().add(center, BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutExample();
	}

}
