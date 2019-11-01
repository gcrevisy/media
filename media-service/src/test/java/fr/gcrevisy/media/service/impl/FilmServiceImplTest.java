package fr.gcrevisy.media.service.impl;

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

    @Test(expected = TechnicalException.class)
    public void deleteIdNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        service.delete((String) null);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        service.saveOrUpdate(null);
    }

    @Test(expected = TechnicalException.class)
    public void getByIdIdNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl();
        service.getById(null);
    }
}