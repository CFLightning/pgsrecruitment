package com.pgsrecruitment.rental;

import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.pgsrecruitment.cars.CarRepository;

public class RentalCarPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JComboBox carList = new JComboBox<>();
	private JLabel carLabel;
	
	
	public RentalCarPanel() {
		this.initialise();
	}
	
	public void findCars() {
		DefaultComboBoxModel comboList = new DefaultComboBoxModel(CarRepository.AllCars().toArray());
		this.carList.setModel(comboList);
	}
	
	public String getCar() {
		return this.carList.getSelectedItem().toString();
	}
	
	private void initialise() {
		
		findCars();
		
		this.carLabel = new JLabel("Choose car: ");
		this.carLabel.setPreferredSize(new Dimension(100,30));
		this.carList.setPreferredSize(new Dimension(250,30));
		this.setPreferredSize(new Dimension(400,35));
		this.add(this.carLabel);
		this.add(this.carList);
	}
}
