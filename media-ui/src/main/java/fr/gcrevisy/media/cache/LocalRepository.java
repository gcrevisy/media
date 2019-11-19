package fr.gcrevisy.media.cache;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import fr.gcrevisy.media.model.metier.Film;

public class LocalRepository {
    private static LocalRepository repository;
    private List<Film> films;

    private LocalRepository() {
        chargerCache();
    }

    public static LocalRepository getInstance() {
        if (repository == null) {
            repository = new LocalRepository();
        }
        return repository;
    }

    public List<Film> getAllFilms() {
        return films;
    }

    private void chargerCache() {
        films = new ArrayList<Film>();

        try (InputStream input = LocalRepository.class.getClassLoader()
                .getResourceAsStream("LocalRepository.properties")) {
            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            prop.load(input);
            FileInputStream fis = new FileInputStream(prop.getProperty("key"));
            ObjectInputStream ois = new ObjectInputStream(fis);

            films = (List<Film>) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}