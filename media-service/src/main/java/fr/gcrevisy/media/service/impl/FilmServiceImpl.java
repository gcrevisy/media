package fr.gcrevisy.media.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;
import fr.gcrevisy.media.service.FilmService;

public class FilmServiceImpl implements FilmService {
    @Override
    public void delete(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#delete");
        }
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Film item) throws TechnicalException {
        // TODO Auto-generated method stub
        if (item == null) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#delete");
        }

    }

    @Override
    public Film saveOrUpdate(Film item) throws TechnicalException {
        // TODO Auto-generated method stub
        if (item == null) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#saveOrUpdate");
        }
        return null;
    }

    @Override
    public List<Film> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Film getById(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#delete");
        }
        // TODO Auto-generated method stub
        return null;
    }
}