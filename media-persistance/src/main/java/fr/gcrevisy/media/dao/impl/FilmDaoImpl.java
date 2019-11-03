package fr.gcrevisy.media.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;

@Service
public class FilmDaoImpl implements FilmDao {

    @Override
    public void delete(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            throw new TechnicalException("Entree null ou vide FilmDaoImpl#delete");
        }
    }

    @Override
    public void delete(Film item) throws TechnicalException {
        if (item == null) {
            throw new TechnicalException("Entree null ou vide FilmDaoImpl#delete");
        }
    }

    @Override
    public Film saveOrUpdate(Film item) throws TechnicalException {
        if (item == null) {
            throw new TechnicalException("Entree null ou vide FilmDaoImpl#saveOrUpdate");
        }
        return item;
    }

    @Override
    public List<Film> getAll() {
        List<Film> result = new ArrayList<Film>();

        for (int i = 1; i <= 10; i++) {
            result.add(new Film(StringUtils.leftPad(String.valueOf(i), 15, "0"), "libelle", "support", "annee"));
        }

        return result;
    }

    @Override
    public Film getById(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            throw new TechnicalException("Entree null ou vide FilmDaoImpl#delete");
        }
        return new Film("id", "libelle", "support", "annee");
    }

}