package fr.gcrevisy.media.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gcrevisy.media.model.technique.Films;
import fr.gcrevisy.media.service.FilmService;

@RestController
public class FilmController {

    @Autowired
    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/films")
    public Films getAll() {
        return new Films(filmService.getAll());
    }

}