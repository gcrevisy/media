package fr.gcrevisy.media.model.technique;

import fr.gcrevisy.media.model.metier.Film;

public class FilmResponse extends MediaHttpResponse {

    private Film film;

    public FilmResponse() {
    }

    public FilmResponse(Film film) {
        this.film = film;
    }

    public Film getFilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

}