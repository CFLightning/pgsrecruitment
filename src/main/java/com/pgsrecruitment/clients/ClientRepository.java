package com.pgsrecruitment.clients;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {

	public static List<Client> clientsRepo = new ArrayList<Client>();
	
	public static void AddClient(Client client) {
		ClientRepository.clientsRepo.add(client);
	}
	
	public static List<String> AllClients() {
		List<String> clientList = new ArrayList<>();
		for(Client client: clientsRepo) {
			clientList.add(client.getName() + ", " + client.getSurname());
		}
		return clientList;
	}
}
