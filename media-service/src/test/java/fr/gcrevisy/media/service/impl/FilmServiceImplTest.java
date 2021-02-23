package fr.gcrevisy.media.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

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
        Film item = new Film("libelle", "support", 2020);
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
        Film item = new Film("libelle", "support", 2020);
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemValueLibelleVide() throws TechnicalException {
        Film item = new Film("", "support", 2020);
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemValueLibelleNull() throws TechnicalException {
        Film item = new Film(null, "support", 2020);
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemValueSupportVide() throws TechnicalException {
        Film item = new Film("libelle", "", 2020);
        FilmService service = new FilmServiceImpl(initDao());
        Film result = service.saveOrUpdate(item);

        Assert.assertNotNull(result);
    }

    @Test(expected = TechnicalException.class)
    public void saveOrUpdateItemValueSupportNull() throws TechnicalException {
        Film item = new Film("libelle", null, 2020);
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
        FilmDao mocked = Mockito.mock(FilmDao.class);

        Mockito.when(mocked.findAll()).thenReturn(new ArrayList<>());

        Film film = new Film("id", "libelle", "support", 2020);
        Mockito.when(mocked.findById(Mockito.anyString())).thenReturn(Optional.of(film));

        Mockito.when(mocked.save(Mockito.any(Film.class))).thenReturn(film);

        return mocked;
    }
}