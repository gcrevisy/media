package fr.gcrevisy.media.dao.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.mongodb.morphia.Datastore;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;

public class FilmDaoImplTest {

    @Test(expected = TechnicalException.class)
    public void deleteItemNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.delete((Film) null);
    }

    @Ignore
    @Test
    public void deleteItemValue() throws TechnicalException {
        Film item = new Film("libelle", "support", "annee");
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.delete(item);
    }

    @Test(expected = TechnicalException.class)
    public void deleteIdNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.delete((String) null);
    }

    @Test(expected = TechnicalException.class)
    public void deleteIdBlank() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.delete("");
    }

    @Ignore
    @Test
    public void deleteIdValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.delete("1234");
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.saveOrUpdate(null);
    }

    @Test
    public void saveOrUpdateItemValue() throws TechnicalException {
        Film item = new Film("libelle", "support", "annee");
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        Film result = dao.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void getByIdIdNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.getById(null);
    }

    @Ignore
    @Test
    public void getByIdIdValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        Film result = dao.getById("1234");

        Assert.assertNotNull(result);
    }

    @Ignore
    @Test
    public void getAllValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        List<Film> result = dao.getAll();

        Assert.assertNotNull(result);
    }

    private Datastore getMockedDataStore() {
        Datastore result = Mockito.mock(Datastore.class);

        return result;
    }
}