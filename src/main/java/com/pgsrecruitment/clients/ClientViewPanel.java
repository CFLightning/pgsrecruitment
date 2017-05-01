package com.pgsrecruitment.clients;

import java.awt.Dimension;
import java.util.List;
import javax.swing.*;

public class ClientViewPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	DefaultListModel<String> model = new DefaultListModel<>();
	List<String> clients;
	JList<String> clientList;
	
	public ClientViewPanel() {
		this.initialise();
	}
	
	private void initialise() {
		JLabel label = new JLabel("All current customers: ");
		JPanel labelPanel = new JPanel();
		labelPanel.setPreferredSize(new Dimension(400,30));
		this.add(labelPanel);
		labelPanel.add(label);
		
		fetchClients();
		
		JScrollPane scrollPane = new JScrollPane(clientList);
		scrollPane.setPreferredSize(new Dimension(370,160));
		this.add(scrollPane);
	}
	
	public void fetchClients() {
		clients = ClientRepository.AllClients();
		model.removeAllElements();
		for(String client : clients) {
			model.addElement(client);
		}
		
		clientList = new JList<>(model);
		
	}
	
}
