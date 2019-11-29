package fr.gcrevisy.media.dao.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

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

    @Test(expected = TechnicalException.class)
    public void getByIdIdEmptyValue() throws TechnicalException {
        FilmDao dao = new FilmDaoImpl(getMockedDataStore());
        dao.getById("");
    }

    @Ignore
    @Test
    public void getByIdIdValue() throws TechnicalException {
        // Datastore ds = Mockito.mock(Datastore.class);
        // Query<Film> query = Mockito.mock(Query.class);
        // Mockito.when(ds.createQuery(Film.class)).thenReturn(query);
        // Mockito.when(((OngoingStubbing<Query<Film>>) ds.find(Film.class).field("_id").equal("5dc7df97e11f13383f09c531")).thenReturn(query));
        // Mockito.when(query.get()).thenReturn(new Film("5dc7df97e11f13383f09c531", "libelle", "support", "annee"));

        Datastore ds = Mockito.mock(Datastore.class);
        Query<Film> query = Mockito.mock(Query.class);
        Mockito.when(ds.find(Film.class)).thenReturn(query);
        Mockito.when(query.field("field")).thenReturn(new Fie)
        Mockito.when(query.field("_id").equal("5dc7df97e11f13383f09c531").get())
                .thenReturn(new Film("5dc7df97e11f13383f09c531", "libelle", "support", "annee"));

        FilmDao dao = new FilmDaoImpl(ds);
        Film result = dao.getById("5dc7df97e11f13383f09c531");

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