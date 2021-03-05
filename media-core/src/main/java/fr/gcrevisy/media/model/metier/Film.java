package fr.gcrevisy.media.model.metier;

import java.util.Objects;

import org.springframework.data.annotation.Id;

import fr.gcrevisy.media.model.Model;

public class Film implements Model {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String libelle;
    private String support;
    private int annee;
    private Realisateur realisateur;

    public Film() {

    }

    public Film(String id, String libelle, String support, int annee) {
        this.id = id;
        this.libelle = libelle;
        this.support = support;
        this.annee = annee;
    }

    public Film(String id, String libelle, String support, int annee, Realisateur realisateur) {
        super();
        this.id = id;
        this.libelle = libelle;
        this.support = support;
        this.annee = annee;
        this.realisateur = realisateur;
    }

    public Film(String libelle, String support, int annee) {
        this.libelle = libelle;
        this.support = support;
        this.annee = annee;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
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

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Film)) {
            return false;
        }
        Film film = (Film) o;
        return Objects.equals(id, film.id) && Objects.equals(libelle, film.libelle)
                && Objects.equals(support, film.support) && Objects.equals(annee, film.annee);
    }

}