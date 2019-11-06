package fr.gcrevisy.media.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;
import fr.gcrevisy.media.service.FilmService;

public class FilmControllerTest {

    @Test
    public void getAllOk() {
        FilmController controller = new FilmController(getService());
        List<Film> liste = controller.getAll();

        Assert.assertTrue(liste != null);
    }

    private FilmService getService() {
        return new FilmService() {

            @Override
            public Film saveOrUpdate(Film item) throws TechnicalException {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public Film getById(String id) throws TechnicalException {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public List<Film> getAll() {
                return new ArrayList<Film>();
            }

            @Override
            public void delete(Film item) throws TechnicalException {
                // TODO Auto-generated method stub

            }

            @Override
            public void delete(String id) throws TechnicalException {
                // TODO Auto-generated method stub

            }
        };
    }
}