package fr.rody.bforbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.rody.bforbank.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
	
	@Query("SELECT SUM(cg.passages) FROM Client c JOIN c.cagnotte cg WHERE c.id = :clientId")
    long countPassagesByClientId(@Param("clientId") Integer clientId);

}
