package fr.gcrevisy.media.dao.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;

public class FilmDaoImpl implements FilmDao {

    @Override
    public void delete(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            throw new TechnicalException("Entree null ou vide FilmDaoImpl#delete");
        }
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Film item) throws TechnicalException {
        // TODO Auto-generated method stub
        if (item == null) {
            throw new TechnicalException("Entree null ou vide FilmDaoImpl#delete");
        }

    }

    @Override
    public Film saveOrUpdate(Film item) throws TechnicalException {
        // TODO Auto-generated method stub
        if (item == null) {
            throw new TechnicalException("Entree null ou vide FilmDaoImpl#saveOrUpdate");
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
            throw new TechnicalException("Entree null ou vide FilmDaoImpl#delete");
        }
        // TODO Auto-generated method stub
        return null;
    }

}