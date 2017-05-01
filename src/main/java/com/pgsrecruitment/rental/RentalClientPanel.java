package com.pgsrecruitment.rental;

import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.pgsrecruitment.cars.CarRepository;
import com.pgsrecruitment.clients.ClientRepository;

@SuppressWarnings("unused")
public class RentalClientPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JComboBox clientList = new JComboBox<>();
	private JLabel clientLabel;
	
	public RentalClientPanel() {
		this.initialise();
	}
	
	public void findClients() {
		DefaultComboBoxModel comboList = new DefaultComboBoxModel(ClientRepository.AllClients().toArray());
		this.clientList.setModel(comboList);
	}
	
	public String getClient() {
		return this.clientList.getSelectedItem().toString();
	}
	
	private void initialise() {
		
		findClients();
		
		this.clientLabel = new JLabel("Choose client: ");
		this.clientLabel.setPreferredSize(new Dimension(100,30));
		this.clientList.setPreferredSize(new Dimension(250,30));
		this.setPreferredSize(new Dimension(400,35));
		this.add(this.clientLabel);
		this.add(this.clientList);
	}
	
}
