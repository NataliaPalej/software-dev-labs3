package swing_example;

import java.awt.*;
import javax.swing.*;

public class SwingExample {

	public static void main(String[] args) {
		// Sets title of the window
		JFrame w = new JFrame("Hello World");
		
		// Closes the program on close
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create pannel which is attached on top of the window
		JPanel p = new JPanel();
		
		// Creates label with specific text
		JLabel label =  new JLabel("I am a Swing Label");
		
		// Create button
		JButton b = new JButton("Click Me");
		// Set button size (x,y) x = width y = height of the button
		b.setPreferredSize(new Dimension(100, 30));
		
		// Add label and button to the panel
		p.add(label);
		p.add(b);
		
		// Adds the content to the window
		w.getContentPane().add(p);
		
		// Sets size of the window to match preferred size of component
		w.pack();
		
		// Resize your window
		w.setSize(300, 300);
		
		// Make your window visible 
		w.setVisible(true);

	}

}
