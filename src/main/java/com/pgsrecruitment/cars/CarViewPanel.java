package com.pgsrecruitment.cars;

import java.awt.Dimension;
import java.util.List;

import javax.swing.*;

public class CarViewPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	DefaultListModel<String> model = new DefaultListModel<>();
	List<String> cars;
	JList<String> carList;
	
	public CarViewPanel() {
		this.initialise();
	}
	
	private void initialise() {
		JLabel label = new JLabel("All available cars: ");
		JPanel labelPanel = new JPanel();
		labelPanel.setPreferredSize(new Dimension(400,30));
		this.add(labelPanel);
		labelPanel.add(label);
		
		fetchCars();
		
		JScrollPane scrollPane = new JScrollPane(carList);
		scrollPane.setPreferredSize(new Dimension(370,160));
		this.add(scrollPane);
	}
	
	public void fetchCars() {
		cars = CarRepository.AllCars();
		model.removeAllElements();
		for(String car : cars) {
			model.addElement(car);
		}
		
		carList = new JList<>(model);
		
	}

}
