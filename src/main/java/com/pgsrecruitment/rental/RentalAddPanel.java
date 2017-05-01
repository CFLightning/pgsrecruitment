package com.pgsrecruitment.rental;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RentalAddPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private RentalCarPanel carPanel;
	private RentalClientPanel clientPanel;
	private RentalDaysPanel daysPanel;
	
	public RentalAddPanel() {
		this.initialise();
	}
	
	public void update() {
		this.carPanel.findCars();
		this.clientPanel.findClients();
	}
	
	private void initialise() {
		JLabel label = new JLabel("Add a new rental here");
		JPanel labelPanel = new JPanel();
		labelPanel.setPreferredSize(new Dimension(400,30));
		this.add(labelPanel);
		labelPanel.add(label);
		
		createCarField();
		createClientField();
		createDaysField();
		
		this.add(carPanel);
		this.add(clientPanel);
		this.add(daysPanel);
		this.add(createAddButton());
	}
	
	private void createCarField() {
		carPanel = new RentalCarPanel();
	}
	
	private void createClientField() {
		clientPanel = new RentalClientPanel();
	}
	
	private void createDaysField() {
		daysPanel = new RentalDaysPanel();
	}
	
	private JPanel createAddButton() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(400,40));
		
		JButton addButton = new JButton("Add this rental");
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String newCar = carPanel.getCar();
				String newClient = clientPanel.getClient();
				int newDays = daysPanel.getDays();
				RentalRepository.AddRental(newCar + " | " + newClient + " | Rent days: " + newDays);
			}
		});
		buttonPanel.add(addButton);
		return buttonPanel;
	}
}
