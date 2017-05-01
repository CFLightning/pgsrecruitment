package com.pgsrecruitment.clients;

import java.awt.Dimension;

import javax.swing.*;

public class ClientNamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField nameField;
	private JLabel nameLabel;
	
	public ClientNamePanel() {
		initialise();
	}
	
	public String getName() {
		return nameField.getText();
	}
	
	private void initialise() {
		this.nameField = new JTextField(20);
		this.nameLabel = new JLabel("Name: ");
		this.nameLabel.setPreferredSize(new Dimension(100,30));
		this.setPreferredSize(new Dimension(400,30));
		this.add(this.nameLabel);
		this.add(this.nameField);
	}
}
