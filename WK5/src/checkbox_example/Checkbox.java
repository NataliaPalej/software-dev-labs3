package checkbox_example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Checkbox implements ActionListener {
	
	JFrame w = new JFrame("Checkbox Example");
	JPanel panel = new JPanel();
	
	JCheckBox cb1 = new JCheckBox("One", true);
	JCheckBox cb2 = new JCheckBox("Two", false);
	
	public Checkbox() {
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		
		panel.add(cb1);
		panel.add(cb2);
		
		w.getContentPane().add(panel);
		w.pack();
		w.setSize(400, 300);
		w.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(cb1)) {
			if (cb1.isSelected()){
				cb2.setSelected(false);
			}
			// Once we unselect the cb1, it will change the background color
			else {
				panel.setBackground(Color.pink);
			}
		}
		else if (e.getSource().equals(cb2)) {
			// if we select cb2, background color will change 
			if (cb2.isSelected()) {
				cb1.setSelected(false);
				panel.setBackground(Color.magenta);
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Checkbox();
	}
	
}
