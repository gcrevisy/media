package fr.gcrevisy.media.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.dao.impl.FilmDaoImpl;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;
import fr.gcrevisy.media.service.FilmService;

public class FilmServiceImpl implements FilmService {
    @Override
    public void delete(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#delete");
        }
        getFilmDao().delete(id);
    }

    @Override
    public void delete(Film item) throws TechnicalException {
        if (item == null) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#delete");
        }
        getFilmDao().delete(item);

    }

    @Override
    public Film saveOrUpdate(Film item) throws TechnicalException {
        if (item == null) {
            throw new TechnicalException("Entree null ou vide // FilmServiceImpl#saveOrUpdate");
        }
        
        if (StringUtils.isBlank(item.getLibelle())) {
            throw new TechnicalException("Valeur vide : libelle // FilmServiceImpl#saveOrUpdate");
        }
        
        if (StringUtils.isBlank(item.getSupport())) {
            throw new TechnicalException("Valeur vide : support // FilmServiceImpl#saveOrUpdate");
        }

        return getFilmDao().saveOrUpdate(item);
    }

    @Override
    public List<Film> getAll() {
        return getFilmDao().getAll();
    }

    @Override
    public Film getById(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#delete");
        }
        return getFilmDao().getById(id);
    }

    private FilmDao getFilmDao() {
        return new FilmDaoImpl();
    }
}