package layouts_example;

import java.awt.Container;
import java.awt.GridBagConstraints;
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
		super();
		
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		cp = getContentPane();
		cp.setLayout(gridBag);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.gridx = 0;
		c.gridy = 0;
		gridBag.setConstraints(b1, c);
		cp.add(b1);
		
		c.gridx = 1;
		c.gridy = 0;
		gridBag.setConstraints(b2, c);
		cp.add(b2);
		
		c.gridx = 0;
		c.gridy = 1;
		gridBag.setConstraints(b3, c);
		cp.add(b3);
		
		c.gridx = 1;
		c.gridy = 1;
		gridBag.setConstraints(b4, c);
		cp.add(b4);
		
		c.gridx = 0;
		c.gridy = 3;
		gridBag.setConstraints(b5, c);
		cp.add(b5);
		
		setTitle("Grid Bag Layout Example");
		
		setSize(600, 600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new GridBagLayoutExample();
	}

}
