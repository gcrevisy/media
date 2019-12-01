package fr.gcrevisy.media.cache;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import fr.gcrevisy.media.model.metier.Film;

public class LocalRepository {
    private static LocalRepository repository;
    private List<Film> films;

    private LocalRepository() {
        // Properties prop = new Properties();

        // if (input == null) {
        // System.out.println("Sorry, unable to find config.properties");
        // return;
        // }
        // prop.load(input);
        // FileInputStream fis = new FileInputStream(prop.getProperty("key"));
        String path = "C:\\MongoDB\\LocalRepository.data";
        films = chargerCache(path);
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

    protected List<Film> chargerCache(String repositoryPath) {
        List<Film> result = new ArrayList<Film>();

        try {

            if (!Files.exists(Paths.get(repositoryPath))) {
                creerRepository(repositoryPath, result);
            }

            FileInputStream fis = new FileInputStream(repositoryPath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            result = (List<Film>) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    protected void creerRepository(String repositoryPath, List<Film> liste) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(repositoryPath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(liste);
        oos.close();
        fos.close();
    }
}