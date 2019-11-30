package fr.gcrevisy.media.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.technique.FilmJson;
import fr.gcrevisy.media.model.technique.FilmsJson;
import fr.gcrevisy.media.service.FilmService;

@RestController
public class FilmController {

    private Logger logger = LoggerFactory.getLogger(FilmController.class);

    @Autowired
    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/films")
    public FilmsJson getAll() {
        return new FilmsJson(filmService.getAll());
    }

    @GetMapping("/film/get/{id}")
    public FilmJson getById(@PathVariable String id) {
        FilmJson result = new FilmJson();
        try {
            result.setFilm(filmService.getById(id));
        } catch (TechnicalException e) {
            logger.error("erreur pendant le getById : ", e);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @DeleteMapping("film/delete")
    public void delete(@RequestBody FilmJson item) {
        try {
            filmService.delete(item.getFilm());
        } catch (TechnicalException e) {
            logger.error("erreur pendant le delete : ", e);
        }
    }

    @DeleteMapping("film/delete/{id}")
    public void delete(@PathVariable String id) {
        try {
            filmService.delete(id);
        } catch (TechnicalException e) {
            logger.error("erreur pendant le delete : ", e);
        }
    }

    @PutMapping("/film/saveorupdate")
    public FilmJson saveOrUpdate(@RequestBody FilmJson item) {
        FilmJson result = new FilmJson();
        try {
            result.setFilm(filmService.saveOrUpdate(item.getFilm()));
        } catch (TechnicalException e) {
            logger.error("erreur pendant le saveOrupdate : ", e);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}