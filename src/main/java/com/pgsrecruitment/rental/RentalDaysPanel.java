package com.pgsrecruitment.rental;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RentalDaysPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField daysField;
	private JLabel daysLabel;

	public RentalDaysPanel() {
		this.initialize();
	}
	
	public int getDays() {
		return Integer.parseInt(this.daysField.getText());
	}
	
	private void initialize() {
		this.daysField = new JTextField(20);
		this.daysLabel = new JLabel("How many days : ");
		this.daysLabel.setPreferredSize(new Dimension(100, 30));
		this.setPreferredSize(new Dimension(400, 30));
		this.add(this.daysLabel);
		this.add(this.daysField);
	}
}
