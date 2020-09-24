package fr.gcrevisy.media.model.metier;

import java.util.Objects;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import fr.gcrevisy.media.model.Model;

@Entity("films")
public class Film implements Model {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Property("libelle")
    private String libelle;

    @Property("support")
    private String support;

    @Property("annee")
    private int annee;
    
    @Property("realisateur")
    private Realisateur realisateur;

    public Film() {

    }
    
    public Film(String id, String libelle, String support, int annee, Realisateur realisateur) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.support = support;
		this.annee = annee;
		this.realisateur = realisateur;
	}



	public Film(String id, String libelle, String support, int annee) {
        this.id = id;
        this.libelle = libelle;
        this.support = support;
        this.annee = annee;
    }

    public Film(String libelle, String support, int annee) {
        this.libelle = libelle;
        this.support = support;
        this.annee = annee;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getSupport() {
        return this.support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public int getAnnee() {
        return this.annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
    public Realisateur getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}

	@Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Film)) {
            return false;
        }
        Film film = (Film) o;
        return Objects.equals(id, film.id) && Objects.equals(libelle, film.libelle)
                && Objects.equals(support, film.support) && Objects.equals(annee, film.annee)
                && Objects.equals(realisateur, film.realisateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, support, annee, realisateur);
    }

}