package fr.rody.bforbank.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.rody.bforbank.model.Cagnotte;
import fr.rody.bforbank.model.Client;
import fr.rody.bforbank.service.CagnotteService;
import fr.rody.bforbank.service.ClientService;

//import fr.rody.bforbank.model.Client;
//import fr.rody.bforbank.service.CagnotteService;
import fr.rody.bforbank.service.ClientService;
@Controller
@RequestMapping("/api")
public class DemoApplication {
	
	@Autowired
	private CagnotteService cagnotteService;
	
	@Autowired 
	private ClientService clientService;
	
	@GetMapping("/clients/{id}")
	public  ResponseEntity<Client> getClientById(@PathVariable Integer id) {
        Optional<Client> client = clientService.findClientById(id);
        if (client.isPresent()) {
            return ResponseEntity.ok(client.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	 @GetMapping("/{id}/passages")
	    public ResponseEntity<Long> countPassagesByClientId(@PathVariable Integer id) {
	        long passages = clientService.countPassagesByClientId(id);
	        return ResponseEntity.ok(passages);
	    }

}
