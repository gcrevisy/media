package fr.gcrevisy.media.dao.impl;

import java.util.List;

import org.junit.Assert;
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

    @Test
    public void deleteItemValue() throws TechnicalException {
        Film item = new Film("id", "libelle", "support", "annee");
        FilmDao dao = new FilmDaoImpl();
        dao.delete(item);
    }

    @Test(expected = TechnicalException.class)
    public void deleteIdNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        dao.delete((String) null);
    }

    @Test(expected = TechnicalException.class)
    public void deleteIdBlank() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        dao.delete("");
    }

    @Test
    public void deleteIdValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        dao.delete("1234");
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        dao.saveOrUpdate(null);
    }

    @Test
    public void saveOrUpdateItemValue() throws TechnicalException {
        Film item = new Film("id", "libelle", "support", "annee");
        FilmDao dao = new FilmDaoImpl();
        Film result = dao.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void getByIdIdNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        dao.getById(null);
    }

    @Test
    public void getByIdIdValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        Film result = dao.getById("1234");

        Assert.assertNotNull(result);
    }

    @Test
    public void getAllValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl();
        List<Film> result = dao.getAll();

        Assert.assertNotNull(result);
    }
}