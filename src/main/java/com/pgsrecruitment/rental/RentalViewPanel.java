package com.pgsrecruitment.rental;

import java.awt.Dimension;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class RentalViewPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	DefaultListModel<String> model = new DefaultListModel<>();
	List<String> rentals;
	JList<String> rentalList;
	
	public RentalViewPanel() {
		this.initialise();
	}
	
	private void initialise() {
		JLabel label = new JLabel("Rental history: ");
		JPanel labelPanel = new JPanel();
		labelPanel.setPreferredSize(new Dimension(400,30));
		this.add(labelPanel);
		labelPanel.add(label);
		
		fetchRentals();
		
		JScrollPane scrollPane = new JScrollPane(rentalList);
		scrollPane.setPreferredSize(new Dimension(370,160));
		this.add(scrollPane);
	}
	
	public void fetchRentals() {
		rentals = RentalRepository.AllRentals();
		model.removeAllElements();
		for(String rental : rentals) {
			model.addElement(rental);
		}
		
		rentalList = new JList<>(model);
		
	}
}
