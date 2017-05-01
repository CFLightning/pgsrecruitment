package com.pgsrecruitment;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;

import javax.swing.*;

import com.pgsrecruitment.cars.CarAddPanel;
import com.pgsrecruitment.cars.CarViewPanel;
import com.pgsrecruitment.clients.ClientAddPanel;
import com.pgsrecruitment.clients.ClientViewPanel;
import com.pgsrecruitment.rental.RentalAddPanel;
import com.pgsrecruitment.rental.RentalViewPanel;

public class Workspace extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel mainPanel = new JPanel();
	
	public Workspace() {
		this.initialize();
	}
	
	private void initialize() {
		this.createMenuBar();
		this.createLayout();
		this.setTitle("Car rental");
		this.setSize(400, 270);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout() {
		LayoutManager overlay = new OverlayLayout(this.mainPanel);
		this.mainPanel.setLayout(overlay);
		this.add(mainPanel);
	}
	
	private void createMenuBar() {
		JMenuBar menubar = new JMenuBar();
		
		// Adding car menu and all components
		CarAddPanel carAddPanel = new CarAddPanel();
		this.mainPanel.add(carAddPanel);
		carAddPanel.setVisible(false);
		
		CarViewPanel carViewPanel = new CarViewPanel();
		this.mainPanel.add(carViewPanel);
		carViewPanel.setVisible(false);
		
		// Adding client menu and all components
		ClientAddPanel clientAddPanel = new ClientAddPanel();
		this.mainPanel.add(clientAddPanel);
		clientAddPanel.setVisible(false);
		
		ClientViewPanel clientViewPanel = new ClientViewPanel();
		this.mainPanel.add(clientViewPanel);
		clientViewPanel.setVisible(false);
		
		// Adding rental menu and all components
		RentalAddPanel rentalAddPanel = new RentalAddPanel();
		this.mainPanel.add(rentalAddPanel);
		rentalAddPanel.setVisible(false);
		
		RentalViewPanel rentalViewPanel = new RentalViewPanel();
		this.mainPanel.add(rentalViewPanel);
		rentalViewPanel.setVisible(false);
		
		JMenu cars = new JMenu("Cars");
		
		JMenuItem addCar = new JMenuItem("New car");
		addCar.setToolTipText("Add a new car");
		addCar.addActionListener((ActionEvent event) -> {
			carAddPanel.setVisible(true);
			carViewPanel.setVisible(false);
			clientAddPanel.setVisible(false);
			clientViewPanel.setVisible(false);
			rentalAddPanel.setVisible(false);
			rentalViewPanel.setVisible(false);
		});
		
		cars.add(addCar);
		
		JMenuItem viewCars = new JMenuItem("View all cars");
		viewCars.setToolTipText("View a list of all cars");
		viewCars.addActionListener((ActionEvent event) -> {
			carViewPanel.fetchCars();
			carViewPanel.setVisible(true);
			carAddPanel.setVisible(false);
			clientAddPanel.setVisible(false);
			clientViewPanel.setVisible(false);
			rentalAddPanel.setVisible(false);
			rentalViewPanel.setVisible(false);
		});
		
		cars.add(viewCars);
		
		// Adding clients menu and all components
		JMenu clients = new JMenu("Clients");
		
		JMenuItem addClient = new JMenuItem("New client");
		addClient.setToolTipText("Add a new client");
		addClient.addActionListener((ActionEvent event) -> {
			clientAddPanel.setVisible(true);
			carAddPanel.setVisible(false);
			carViewPanel.setVisible(false);
			clientViewPanel.setVisible(false);
			rentalAddPanel.setVisible(false);
			rentalViewPanel.setVisible(false);
		});
		
		clients.add(addClient);
		
		JMenuItem viewClients = new JMenuItem("View all clients");
		viewClients.setToolTipText("View a list of all cars");
		viewClients.addActionListener((ActionEvent event) -> {
			clientViewPanel.fetchClients();
			clientViewPanel.setVisible(true);
			carAddPanel.setVisible(false);
			carViewPanel.setVisible(false);
			clientAddPanel.setVisible(false);
			rentalAddPanel.setVisible(false);
			rentalViewPanel.setVisible(false);
		});
		
		clients.add(viewClients);
		
		// Adding clients menu and all components
		JMenu rentals = new JMenu("Rentals");
				
		JMenuItem addRental = new JMenuItem("New rental");
		addRental.setToolTipText("Add a new rental");
		addRental.addActionListener((ActionEvent event) -> {
			rentalAddPanel.update();
			rentalAddPanel.setVisible(true);
			rentalViewPanel.setVisible(false);
			carAddPanel.setVisible(false);
			carViewPanel.setVisible(false);
			clientAddPanel.setVisible(false);
			clientViewPanel.setVisible(false);
		});
				
		rentals.add(addRental);
				
		JMenuItem viewRentals = new JMenuItem("View all rentals");
		viewRentals.setToolTipText("View a list of all rentals");
		viewRentals.addActionListener((ActionEvent event) -> {
			rentalViewPanel.fetchRentals();
			clientViewPanel.setVisible(false);
			carAddPanel.setVisible(false);
			carViewPanel.setVisible(false);
			clientAddPanel.setVisible(false);
			rentalAddPanel.setVisible(false);
			rentalViewPanel.setVisible(true);
		});
		
		rentals.add(viewRentals);
	
		// Adding menubar menus
		menubar.add(cars);
		menubar.add(clients);
		menubar.add(rentals);
		setJMenuBar(menubar);
	}
}
