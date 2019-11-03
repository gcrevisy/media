package fr.gcrevisy.media.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gcrevisy.media.model.metier.Film;
import fr.gcrevisy.media.service.FilmService;

@RestController
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/films")
    public List<Film> getAll() {
        return filmService.getAll();
    }
}