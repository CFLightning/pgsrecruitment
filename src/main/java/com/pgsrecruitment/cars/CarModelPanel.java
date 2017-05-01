package com.pgsrecruitment.cars;

import java.awt.Dimension;

import javax.swing.*;

public class CarModelPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField modelField;
	private JLabel modelLabel;

	public CarModelPanel() {
		initialize();
	}

	public String getModel() {
		return this.modelField.getText();
	}

	private void initialize() {
		this.modelField = new JTextField(20);
		this.modelLabel = new JLabel("Model : ");
		this.modelLabel.setPreferredSize(new Dimension(100, 30));
		this.setPreferredSize(new Dimension(400, 30));
		this.add(this.modelLabel);
		this.add(this.modelField);
	}
}