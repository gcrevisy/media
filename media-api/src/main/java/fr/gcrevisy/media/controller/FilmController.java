package fr.gcrevisy.media.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.technique.FilmResponse;
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
    public FilmResponse getById(@PathVariable String id) {
        FilmResponse result = new FilmResponse();
        try {
            result.setFilm(filmService.getById(id));
        } catch (TechnicalException e) {
            logger.error("erreur pendant le getById : ", e);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @DeleteMapping("film/delete")
    public ResponseEntity<Void> delete(@RequestBody FilmResponse item) {
        ResponseEntity<Void> result = null;
        try {
            filmService.delete(item.getFilm());
            result = new ResponseEntity<Void>(HttpStatus.OK);
        } catch (TechnicalException e) {
            logger.error("erreur pendant le delete : ", e);
            result = new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        return result;
    }

    @DeleteMapping("film/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        ResponseEntity<Void> result = null;
        try {
            filmService.delete(id);
            result = new ResponseEntity<Void>(HttpStatus.OK);
        } catch (TechnicalException e) {
            logger.error("erreur pendant le delete : ", e);
            result = new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        return result;
    }

    @PutMapping("/film/save")
    public ResponseEntity<FilmResponse> saveOrUpdate(@RequestBody FilmResponse item) {
        FilmResponse filmResult = new FilmResponse();
        ResponseEntity<FilmResponse> result = null;
        try {
            filmResult.setFilm(filmService.saveOrUpdate(item.getFilm()));
            result = new ResponseEntity<FilmResponse>(filmResult, HttpStatus.CREATED);
        } catch (TechnicalException e) {
            logger.error("erreur pendant le saveOrUpdate : ", e);
            filmResult.setMessage(e.getMessage());
            result = new ResponseEntity<FilmResponse>(filmResult, HttpStatus.BAD_REQUEST);
        }

        return result;
    }
}