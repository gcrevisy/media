package fr.gcrevisy.media.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;
import fr.gcrevisy.media.service.FilmService;

public class FilmServiceImplTest {

    @Test(expected = TechnicalException.class)
    public void deleteItemNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl(initDao());
        service.delete((Film) null);
    }

    @Test
    public void deleteItemValue() throws TechnicalException {
        Film item = new Film("id", "libelle", "support", "annee");
        FilmService service = new FilmServiceImpl(initDao());
        service.delete(item);
    }

    @Test(expected = TechnicalException.class)
    public void deleteIdNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl(initDao());
        service.delete((String) null);
    }

    @Test(expected = TechnicalException.class)
    public void deleteIdBlank() throws TechnicalException {
        FilmService service = new FilmServiceImpl(initDao());
        service.delete("");
    }

    @Test
    public void deleteIdValue() throws TechnicalException {
        FilmService service = new FilmServiceImpl(initDao());
        service.delete("1234");
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl(initDao());
        service.saveOrUpdate(null);
    }

    @Test
    public void saveOrUpdateItemValue() throws TechnicalException {
        Film item = new Film("id", "libelle", "support", "annee");
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemValueLibelleVide() throws TechnicalException {
        Film item = new Film("id", "", "support", "annee");
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemValueLibelleNull() throws TechnicalException {
        Film item = new Film("id", null, "support", "annee");
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemValueSupportVide() throws TechnicalException {
        Film item = new Film("id", "libelle", "", "annee");
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemValueSupportNull() throws TechnicalException {
        Film item = new Film("id", "libelle", null, "annee");
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void getByIdIdNull() throws TechnicalException {
        FilmService service = new FilmServiceImpl(initDao());
        service.getById(null);
    }

    @Test
    public void getByIdIdValue() throws TechnicalException {
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.getById("1234");

        Assert.assertNotNull(result);
    }

    @Test
    public void getAllValue() throws TechnicalException {
        FilmService service = new FilmServiceImpl(initDao());
        List<Film> result = service.getAll();

        Assert.assertNotNull(result);
    }

    private FilmDao initDao() {
        return new FilmDao() {

            @Override
            public Film saveOrUpdate(Film item) throws TechnicalException {
                return new Film("id", "libelle", "support", "annee");
            }

            @Override
            public Film getById(String id) throws TechnicalException {
                return new Film("id", "libelle", "support", "annee");
            }

            @Override
            public List<Film> getAll() {
                return new ArrayList<Film>();
            }

            @Override
            public void delete(Film item) throws TechnicalException {

            }

            @Override
            public void delete(String id) throws TechnicalException {

            }
        };
    }
}