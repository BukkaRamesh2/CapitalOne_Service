package com.capitalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capitalone.model.Client;
import com.capitalone.service.ClientService;


@RestController
public class ClientController {
	
	public ClientController() {
		
	}

	
	public ClientService clientService;
	
	@PostMapping("/saveClient")
	public Client createClient(@RequestBody Client client) {
		return clientService.createClient(client);
	}
	
	@GetMapping("/getClient/{name}")
	public Client getClient(@PathVariable String name) {
		return clientService.getClient(name);
	}
	
	@PutMapping("/updateClient")
	public Client updateClient(@RequestBody Client client) {
		return clientService.updateClient(client);
	}
	
	@DeleteMapping("/deleteClient")
	public void deleteClient(@PathVariable String name) {
		clientService.deleteClient(name);
	}
}
