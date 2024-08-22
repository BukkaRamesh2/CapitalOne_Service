package com.capitalone.service;

import com.capitalone.model.Client;

public interface ClientService {
	
	Client createClient(Client client);

	Client getClient(String name);

	Client updateClient(Client client);

	void deleteClient(String name);

}
