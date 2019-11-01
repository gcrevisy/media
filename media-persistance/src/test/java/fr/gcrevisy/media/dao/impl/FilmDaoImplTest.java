package fr.gcrevisy.media.dao.impl;

import org.junit.Test;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;

public class FilmDaoImplTest {

    @Test(expected = TechnicalException.class)
    public void deleteItemNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        dao.delete((Film) null);
    }

    @Test(expected = TechnicalException.class)
    public void deleteIdNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        dao.delete((String) null);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        dao.saveOrUpdate(null);
    }

    @Test(expected = TechnicalException.class)
    public void getByIdIdNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        dao.getById(null);
    }
}