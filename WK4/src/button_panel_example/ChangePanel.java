// A00279259 Natalia Palej

package button_panel_example;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChangePanel implements ActionListener {
	
	JFrame w = new JFrame("Lab2 Change Panel");
	
	JPanel panel = new JPanel();
	
	JButton b1 = new JButton("First Button");
	JButton b2 = new JButton("Second Button");
	JButton b3 = new JButton("Third Button");
	
	JLabel l1 = new JLabel("First Label");
	
	
	public ChangePanel() {
		
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.setPreferredSize(new Dimension(150, 30));
		b2.setPreferredSize(new Dimension(150, 30));
		b3.setPreferredSize(new Dimension(150, 30));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		l1.setBackground(Color.darkGray);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(l1);
		
		w.getContentPane().add(panel);
		w.pack();
		w.setSize(500, 200);
		w.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)) {
			l1.setText("First Button Clicked");
			panel.setBackground(Color.PINK);
			System.out.println("First Button - Pink");
		}
		else if (e.getSource().equals(b2)) {
			l1.setText("Second Button Clicked");
			panel.setBackground(Color.magenta);
			System.out.println("Second Button - Magenta");
		}
		else {
			l1.setText("Third Button Clicked");
			panel.setBackground(Color.white);
			System.out.println("Third Button - White");
		}
	}

}
