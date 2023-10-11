// A00279259 Natalia Palej

package button_panel_example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ChangeButton implements ActionListener {
	
	JFrame w = new JFrame("Lab2 Change Buttons");
	
	JPanel panel = new JPanel();
	
	JButton b1 = new JButton("RED");
	JButton b2 = new JButton("GREEN");
	JButton b3 = new JButton("BLUE");
		

	public ChangeButton() {
		
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.setPreferredSize(new Dimension(100, 30));
		b2.setPreferredSize(new Dimension(100, 30));
		b3.setPreferredSize(new Dimension(100, 30));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		w.getContentPane().add(panel);
		w.pack();
		w.setSize(400, 300);
		w.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)) {
			b1.setBackground(Color.RED);
			System.out.println("RED Button Pressed");
		}
		else if (e.getSource().equals(b2)) {
			b2.setBackground(Color.GREEN);
			System.out.println("GREEN Button Pressed");
		}
		else {
			b3.setBackground(Color.cyan);
			System.out.println("BLUE Button Pressed");
		}
	}
}
