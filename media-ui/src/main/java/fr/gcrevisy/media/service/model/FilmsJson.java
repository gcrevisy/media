package fr.gcrevisy.media.service.model;

import java.util.List;

import fr.gcrevisy.media.model.Film;

/**
 * FilmsJson
 */
public class FilmsJson {

    private List<Film> films;

    public FilmsJson() {
    }

    public FilmsJson(List<Film> films) {
        this.films = films;
    }

    public List<Film> getFilms() {
        return this.films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

}