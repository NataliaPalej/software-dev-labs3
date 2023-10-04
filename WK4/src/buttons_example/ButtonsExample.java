package buttons_example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;


public class ButtonsExample implements ActionListener{
	JFrame w = new JFrame("Hello Buttons!");
		
	JPanel panel = new JPanel();
	
	JButton b1 = new JButton("Left Button");
	JButton b2 = new JButton("Middle Button");
	JButton b3 = new JButton("Right Button");
		
	JLabel l1 = new JLabel("First Label", SwingConstants.CENTER);
	JLabel l2 = new JLabel("Second Label", SwingConstants.CENTER);
	JLabel l3 = new JLabel("Third Label", SwingConstants.CENTER);
	
	
	// Constructor
	public ButtonsExample() {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setBackground(Color.white);
		
		b1.setPreferredSize(new Dimension(150, 30));
		b2.setPreferredSize(new Dimension(150, 30));
		b3.setPreferredSize(new Dimension(150, 30));
		
		// Make the buttons clickable
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		l1.setPreferredSize(new Dimension(150, 30));
		l2.setPreferredSize(new Dimension(150, 30));
		l3.setPreferredSize(new Dimension(150, 30));
		
		l1.setBorder(blackline);
		l2.setBorder(blackline);
		l3.setBorder(blackline);
			
		b1.setBackground(Color.PINK);
		b2.setBackground(Color.PINK);
		b3.setBackground(Color.PINK);
			
			
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
			
		w.getContentPane().add(panel);
		w.pack();
		w.setSize(500, 400); 
		w.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(b1)) {
			l1.setText("Left Button Pressed");
		}
		else if (e.getSource().equals(b2)) {
			l2.setText("Middle Button Pressed");
		}
		else {
			l3.setText("Right Button Pressed");
		}
		
	}
}
