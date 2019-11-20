package fr.gcrevisy.media.model.technique;

import fr.gcrevisy.media.model.metier.Film;

public class FilmJson extends ResultJson {

    private Film film;

    public FilmJson() {
        film = new Film();
    }

    public FilmJson(Film film) {
        this.film = film;
    }

    public Film getFilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

}