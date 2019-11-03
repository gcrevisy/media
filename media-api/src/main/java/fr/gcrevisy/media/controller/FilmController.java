package fr.gcrevisy.media.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gcrevisy.media.model.metier.Film;
import fr.gcrevisy.media.service.FilmService;
import fr.gcrevisy.media.service.impl.FilmServiceImpl;

@RestController
public class FilmController {

    private FilmService filmService;

    public FilmController() {
        filmService = new FilmServiceImpl();
    }

    @GetMapping("/films")
    public List<Film> getAll() {
        return filmService.getAll();
    }
}