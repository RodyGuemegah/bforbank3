package fr.rody.bforbank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rody.bforbank.model.Client;
import fr.rody.bforbank.repository.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	public Optional<Client> findClientById(Integer clientId) {
		return clientRepository.findById(clientId);
	}
	
	public long countPassagesByClientId(Integer clientId) {
		return clientRepository.countPassagesByClientId(clientId);
	}
	
	

}
