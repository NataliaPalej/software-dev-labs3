package layouts_example;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlowLayoutExample extends JFrame {
	
	Container cp;
	
	// Flow Layout - will put everything across, if it doesnt fit, it will put the next item below
	JButton b1 = new JButton("First Button");
	JButton b2 = new JButton("Second");
	JButton b3 = new JButton("Third Button");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("Fith Button-Long Name");
	
	public FlowLayoutExample() {
		setTitle("Flow Layout Example");
		
		cp = getContentPane();
		
		cp.setLayout(new FlowLayout());
		
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
		cp.add(b5);
		
		setSize(400, 400);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutExample();
	}

}
