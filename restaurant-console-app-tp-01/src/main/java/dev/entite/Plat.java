package dev.entite;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Repository
@Entity
@Table(name = "PLAT")

public class Plat {

	@Id
	private int id;
	@Column(name="NOM")
	private String nom;
	@Column(name="PRIXENCENTIMESEUROS")
	private int prixEnCentimesEuros;

    public Plat() {
    }

    public Plat(String nom, int prixEnCentimesEuros) {
    	
        this.nom = nom;
        this.prixEnCentimesEuros = prixEnCentimesEuros;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrixEnCentimesEuros() {
        return prixEnCentimesEuros;
    }

    public void setPrixEnCentimesEuros(int i) {
        this.prixEnCentimesEuros = i;
    }

    /**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plat plat = (Plat) o;
        return nom.equals(plat.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
