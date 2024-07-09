package fr.rody.bforbank.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cagnotte")
public class Cagnotte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cgt_id")
    private Integer id;

    @Column(name = "cgt_montant")
    private Double montant;

    @Column(name = "cgt_passages")
    private Integer passages;

    @OneToOne
    @JoinColumn(name = "clt_id")
    private Client client;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Integer getPassages() {
        return passages;
    }

    public void setPassages(Integer passages) {
        this.passages = passages;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cagnotte [id=");
		builder.append(id);
		builder.append(", montant=");
		builder.append(montant);
		builder.append(", passages=");
		builder.append(passages);
		builder.append(", client=");
		builder.append(client);
		builder.append("]");
		return builder.toString();
	}
}
