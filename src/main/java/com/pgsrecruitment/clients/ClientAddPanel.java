package com.pgsrecruitment.clients;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ClientAddPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private ClientNamePanel namePanel;
	private ClientSurnamePanel surnamePanel;
	
	public ClientAddPanel() {
		this.initialise();
	}
	
	private void initialise() {
		JLabel label = new JLabel("Add a new client here");
		JPanel labelPanel = new JPanel();
		labelPanel.setPreferredSize(new Dimension(400,30));
		this.add(labelPanel);
		labelPanel.add(label);
		
		createNameField();
		createSurnameField();
		
		this.add(namePanel);
		this.add(surnamePanel);
		this.add(createAddButton());
	}
	
	private void createNameField() {
		namePanel = new ClientNamePanel();
	}
	
	private void createSurnameField() {
		surnamePanel = new ClientSurnamePanel();
	}
	
	private JPanel createAddButton() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(400,40));
		
		JButton addButton = new JButton("Add this client");
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String newName = namePanel.getName();
				String newSurname = surnamePanel.getSurname();
				
				Client newClient = new Client(newName, newSurname);
				ClientRepository.AddClient(newClient);
			}
		});
		buttonPanel.add(addButton);
		return buttonPanel;
	}

}
