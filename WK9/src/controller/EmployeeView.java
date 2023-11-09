package controller;

import javax.swing.*;

public class EmployeeView extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//JFrame window = new JFrame("Employee");
	JPanel p = new JPanel();
	
	public void showDetails(String name, String id) {
		JLabel nameLabel = new JLabel(name);
		JLabel idLabel = new JLabel(id);
		
		p.add(nameLabel);
		p.add(idLabel);
		
		setSize(200, 200);
		add(p);
		pack();
		setVisible(true);
	}

	public void printEmployeeDetails(String name, String id) {
		System.out.println("Employee");
		System.out.println("Name: " + name + "\nID: " + id);
	}
}
