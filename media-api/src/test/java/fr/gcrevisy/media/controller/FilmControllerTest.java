package fr.gcrevisy.media.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;
import fr.gcrevisy.media.model.technique.FilmResponse;
import fr.gcrevisy.media.model.technique.FilmsJson;
import fr.gcrevisy.media.service.FilmService;

public class FilmControllerTest {

    @Test
    public void getAllOk() {
        FilmController controller = new FilmController(getService());
        FilmsJson liste = controller.getAll();

        Assert.assertTrue(liste != null && liste.getFilms() != null);
    }

    @Test
    public void getByIdNull() {
        FilmController controller = new FilmController(getService());
        FilmResponse item = controller.getById(null);

        Assert.assertTrue(item != null);
        Assert.assertTrue(StringUtils.isNotBlank(item.getMessage()));
        Assert.assertTrue(item.getFilm() == null);
    }

    @Test
    public void getByIdValue() {
        FilmController controller = new FilmController(getService());
        FilmResponse item = controller.getById("id");

        Assert.assertTrue(item != null);
        Assert.assertTrue(StringUtils.isBlank(item.getMessage()));
        Assert.assertTrue(item.getFilm() != null);

    }

    @Test
    public void deleteByIdOk() {
        FilmController controller = new FilmController(getService());
        controller.delete("id");
    }

    @Test
    public void deleteByItemOk() {
        FilmController controller = new FilmController(getService());
        controller.delete(new FilmResponse(new Film("id", "libelle", "support", "annee")));
    }

    @Test
    public void saveOrUpdateOk() {
        FilmController controller = new FilmController(getService());
        controller.saveOrUpdate(new FilmResponse(new Film("id", "libelle", "support", "annee")));
    }

    @Test
    public void deleteByIdNull() {
        FilmController controller = new FilmController(getService());
        controller.delete("");
    }

    @Test
    public void deleteByItemNull() {
        FilmController controller = new FilmController(getService());
        controller.delete(new FilmResponse(new Film(null, null, "support", "annee")));
    }

    @Test
    public void saveOrUpdatenNull() {
        FilmController controller = new FilmController(getService());
        controller.saveOrUpdate(new FilmResponse(new Film("id", null, "support", "annee")));
    }

    private FilmService getService() {
        return new FilmService() {

            @Override
            public Film saveOrUpdate(Film item) throws TechnicalException {
                if (StringUtils.isBlank(item.getLibelle()))
                    throw new TechnicalException("erreur");
                return null;
            }

            @Override
            public Film getById(String id) throws TechnicalException {
                if (StringUtils.isBlank(id))
                    throw new TechnicalException("Entree null ou vide FilmServiceImpl#getById");

                if ("1234".equals(id))
                    throw new TechnicalException("Entree incorrecte FilmServiceImpl#getById");

                return new Film("id", "libelle", "support", "annee");
            }

            @Override
            public List<Film> getAll() {
                return new ArrayList<Film>();
            }

            @Override
            public void delete(Film item) throws TechnicalException {
                if (StringUtils.isBlank(item.getId()))
                    throw new TechnicalException("erreur");
            }

            @Override
            public void delete(String id) throws TechnicalException {
                if (StringUtils.isBlank(id))
                    throw new TechnicalException("erreur");
            }
        };
    }
}