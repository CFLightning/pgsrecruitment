package com.pgsrecruitment.cars;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CarAddPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private CarMakePanel makePanel;
	private CarModelPanel modelPanel;
	private CarProdYearPanel prodYearPanel;

	public CarAddPanel() {
		this.initialize();
	}
	
	private void initialize() {
		JLabel label = new JLabel("Add a new car here");
		JPanel labelPanel = new JPanel();
		labelPanel.setPreferredSize(new Dimension(400,30));
		this.add(labelPanel);
		labelPanel.add(label);
		
		createMakeField();
		createModelField();
		createProdYearField();
		
		this.add(makePanel);
		this.add(modelPanel);
		this.add(prodYearPanel);
		this.add(createAddButton());
	}
	
	private void createMakeField() {
		makePanel = new CarMakePanel();
	}
	
	private void createModelField() {
		modelPanel = new CarModelPanel();
	}
	
	private void createProdYearField() {
		prodYearPanel = new CarProdYearPanel();
	}
	
	private JPanel createAddButton() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(400,40));
		
		JButton addButton = new JButton("Add this car");
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String newMake = makePanel.getMake();
				String newModel = modelPanel.getModel();
				int newProdYear = prodYearPanel.getProdYear();
				
				Car newCar = new Car(newMake, newModel, newProdYear);
				CarRepository.AddCar(newCar);
			}
		});
		buttonPanel.add(addButton);
		return buttonPanel;
	}
}
