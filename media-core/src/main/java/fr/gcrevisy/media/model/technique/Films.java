package fr.gcrevisy.media.model.technique;

import java.util.ArrayList;
import java.util.List;

import fr.gcrevisy.media.model.metier.Film;

public class Films {

    private List<Film> films;

    public Films() {
        films = new ArrayList<Film>();
    }

    public Films(List<Film> films) {
        this.films = films;
    }

    public List<Film> getFilms() {
        return this.films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

}