package fr.gcrevisy.media.service;

import java.util.List;

import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;

public interface FilmService {

    void delete(String id) throws TechnicalException;

    void delete(Film item) throws TechnicalException;

    Film saveOrUpdate(Film item) throws TechnicalException;

    List<Film> getAll();

    Film getById(String id) throws TechnicalException;

}