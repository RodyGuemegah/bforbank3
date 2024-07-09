package fr.rody.bforbank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	  	@Id
	    @Column(name = "clt_id")
	    private Integer id;

	    @Column(name = "clt_nom")
	    private String nom;

	    @OneToOne
	    @JoinColumn(name = "cgt_id")
	    private Cagnotte cagnotte;

	    // Getters and setters
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public Cagnotte getCagnotte() {
	        return cagnotte;
	    }

	    public void setCagnotte(Cagnotte cagnotte) {
	        this.cagnotte = cagnotte;
    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Client [id=");
			builder.append(id);
			builder.append(", name=");
			builder.append(nom);
			builder.append(", cagnotte=");
			builder.append(cagnotte);
			builder.append("]");
			return builder.toString();
		}

}
