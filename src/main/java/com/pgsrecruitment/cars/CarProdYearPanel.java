package com.pgsrecruitment.cars;

import java.awt.Dimension;

import javax.swing.*;

public class CarProdYearPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField prodYearField;
	private JLabel prodYearLabel;
	
	public CarProdYearPanel() {
		this.initialize();
	}

	public int getProdYear() {
		return Integer.parseInt(this.prodYearField.getText());
	}

	private void initialize() {
		this.prodYearField = new JTextField(20);
		this.prodYearLabel = new JLabel("Production Year : ");
		this.prodYearLabel.setPreferredSize(new Dimension(100, 30));
		this.setPreferredSize(new Dimension(400, 30));
		this.add(this.prodYearLabel);
		this.add(this.prodYearField);
	}
}
