package fr.gcrevisy.media.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;

public class FilmDaoImplTest {

    private static String ID = "5dc7df97e11f13383f09c531";

    @Test(expected = TechnicalException.class)
    public void deleteItemNull() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.delete((Film) null);
    }

    @Test
    public void deleteItemValue() throws TechnicalException {
        Film item = new Film(ID, "libelle", "support", "annee");
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

    @Test
    public void deleteIdValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.delete(ID);
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

    @Test(expected = TechnicalException.class)
    public void getByIdIdEmptyValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.getById("");
    }

    @Test(expected = TechnicalException.class)
    public void getByIdIdWrongValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.getById("1234");
    }

    @Test
    public void getAllValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        List<Film> result = dao.getAll();

        Assert.assertNotNull(result);
    }

    private Datastore getMockedDataStore() {
        Datastore ds = Mockito.mock(Datastore.class);

        Query<Film> queryAll = Mockito.mock(Query.class);
        Mockito.when(ds.find(Film.class)).thenReturn(queryAll);
        Mockito.when(queryAll.asList()).thenReturn(new ArrayList<Film>());

        Mockito.when(ds.delete(Film.class, ID)).thenReturn(null);

        return ds;
    }
}