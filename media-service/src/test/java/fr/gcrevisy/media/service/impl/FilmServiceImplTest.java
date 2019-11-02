package fr.gcrevisy.media.service.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;
import fr.gcrevisy.media.service.FilmService;

public class FilmServiceImplTest {

    @Test(expected = TechnicalException.class)
    public void deleteItemNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        service.delete((Film) null);
    }

    @Test
    public void deleteItemValue() throws TechnicalException {
        Film item = new Film("id", "libelle", "support", "annee");
        FilmService service = new FilmServiceImpl();
        service.delete(item);
    }

    @Test(expected = TechnicalException.class)
    public void deleteIdNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        service.delete((String) null);
    }

    @Test(expected = TechnicalException.class)
    public void deleteIdBlank() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        service.delete("");
    }

    @Test
    public void deleteIdValue() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        service.delete("1234");
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        service.saveOrUpdate(null);
    }

    @Test
    public void saveOrUpdateItemValue() throws TechnicalException {
        Film item = new Film("id", "libelle", "support", "annee");
        FilmService service = new FilmServiceImpl();
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void getByIdIdNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        service.getById(null);
    }

    @Test
    public void getByIdIdValue() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        Film result = service.getById("1234");

        Assert.assertNotNull(result);
    }

    @Test
    public void getAllValue() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        List<Film> result = service.getAll();

        Assert.assertNotNull(result);
    }
}