package com.pgsrecruitment.clients;

import java.awt.Dimension;

import javax.swing.*;

public class ClientSurnamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField surnameField;
	private JLabel surnameLabel;
	
	public ClientSurnamePanel() {
		initialise();
	}
	
	public String getSurname() {
		return surnameField.getText();
	}
	
	private void initialise() {
		this.surnameField = new JTextField(20);
		this.surnameLabel = new JLabel("Surname: ");
		this.surnameLabel.setPreferredSize(new Dimension(100,30));
		this.setPreferredSize(new Dimension(400,30));
		this.add(this.surnameLabel);
		this.add(this.surnameField);
	}
}