package fr.gcrevisy.media.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;
import fr.gcrevisy.media.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmDao filmDao;

    public FilmServiceImpl(FilmDao dao) {
        filmDao = dao;
    }

    @Override
    public void delete(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#delete");
        }
        filmDao.deleteById(id);
    }

    @Override
    public void delete(Film item) throws TechnicalException {
        if (item == null) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#delete");
        }
        filmDao.delete(item);

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

        //appel imdb

        return filmDao.save(item);
    }

    @Override
    public List<Film> getAll() {
        return filmDao.findAll();
    }

    @Override
    public Film getById(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            throw new TechnicalException("Entree null ou vide FilmServiceImpl#getById");
        }
        Optional<Film> optionalResult = filmDao.findById(id);
        Film result = null;
        if (optionalResult.isPresent())
            result = optionalResult.get();

        return result;
    }

}