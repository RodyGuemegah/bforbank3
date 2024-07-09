package fr.rody.bforbank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rody.bforbank.model.Cagnotte;
import fr.rody.bforbank.model.Client;
import fr.rody.bforbank.repository.CagnotteRepository;
import fr.rody.bforbank.repository.ClientRepository;

@Service
public class CagnotteService {
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CagnotteRepository cagnotteRepository;
	
	public Optional<Cagnotte> findCagnotteById(Integer cagnotteId) {
		return cagnotteRepository.findById(cagnotteId);
	}
	public void addMontantCagnotte(double montant) {
		Client client = clientRepository.findAll(clientId).orElseThrow(() -> new RuntimeException("Client not found"));
		
		Cagnotte cagnotte = client.getCagnotte();
		
		if (cagnotte == null) {
            cagnotte = new Cagnotte();
            cagnotte.setClient(client);
            client.setCagnotte(cagnotte);
		}
		
	}

}
