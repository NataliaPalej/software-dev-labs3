package layouts_example;

import javax.swing.*;

@SuppressWarnings("serial")
public class BoxLayoutExample extends JFrame {
	
	// Box Layout -
	JButton b1 = new JButton("Left");
	JButton b2 = new JButton("Right");
	JButton b3 = new JButton("Center");
	JButton b4 = new JButton("Right");
	JButton b5 = new JButton("Left");
	
	JButton b6 = new JButton("Top");
	JButton b7 = new JButton("Bottom");
	JButton b8 = new JButton("Center");
	JButton b9 = new JButton("Bottom");
	JButton b10 = new JButton("Top");
	
	public BoxLayoutExample() {
		setTitle("Box Layout Example");
		
		/**
		 * Y axis against X axis (vertical)
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); 
		
		b1.setAlignmentX(Component.LEFT_ALIGNMENT);
		getContentPane().add(b1);
		b2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		getContentPane().add(b2);
		b3.setAlignmentX(Component.CENTER_ALIGNMENT);
		getContentPane().add(b3);
		b4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		getContentPane().add(b4);
		b5.setAlignmentX(Component.LEFT_ALIGNMENT);
		getContentPane().add(b5);
		**/
		
		// X axis against Y axis (horizontal)
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS)); 
		b6.setAlignmentY(TOP_ALIGNMENT);
		getContentPane().add(b6);
		b7.setAlignmentY(BOTTOM_ALIGNMENT);
		getContentPane().add(b7);
		b8.setAlignmentY(CENTER_ALIGNMENT);
		getContentPane().add(b8);
		b9.setAlignmentY(BOTTOM_ALIGNMENT);
		getContentPane().add(b9);
		b10.setAlignmentY(TOP_ALIGNMENT);
		getContentPane().add(b10);
		
		setSize(500, 500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BoxLayoutExample();
	} 

}
