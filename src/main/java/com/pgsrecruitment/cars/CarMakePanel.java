package com.pgsrecruitment.cars;

import java.awt.Dimension;
import javax.swing.*;

public class CarMakePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField makeField;
	private JLabel makeLabel;
	
	public CarMakePanel() {
		initialize();
	}
	
	public String getMake() {
		return makeField.getText();
	}
	
	private void initialize() {
		this.makeField = new JTextField(20);
		this.makeLabel = new JLabel("Make : ");
		this.makeLabel.setPreferredSize(new Dimension(100,30));
		this.setPreferredSize(new Dimension(400,30));
		this.add(this.makeLabel);
		this.add(this.makeField);
	}
}
