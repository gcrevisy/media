package fr.gcrevisy.media.dao.impl;

import java.util.List;

import com.mongodb.MongoClient;

import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;

@Service
public class FilmDaoImpl implements FilmDao {

    private Logger logger = LoggerFactory.getLogger(FilmDaoImpl.class);

    protected Datastore datastore;

    public FilmDaoImpl() {
        Morphia morphia = new Morphia();
        morphia.mapPackage("fr.gcrevisy.media.model");

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        this.datastore = morphia.createDatastore(mongoClient, "media-dev");
        this.datastore.ensureIndexes();
    }

    public FilmDaoImpl(Datastore datastore) {
        this.datastore = datastore;
    }

    @Override
    public void delete(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            gestionErreur("Entree null ou vide FilmDaoImpl#delete");
        }
        if (!ObjectId.isValid(id)) {
            gestionErreur("Entree incorrecte FilmDaoImpl#getById");
        }
        ObjectId key = new ObjectId(id);
        datastore.delete(Film.class, key);
    }

    @Override
    public void delete(Film item) throws TechnicalException {
        if (item == null) {
            gestionErreur("Entree null ou vide FilmDaoImpl#delete");
        }
        if (!ObjectId.isValid(item.getId())) {
            gestionErreur("Entree incorrecte FilmDaoImpl#getById");
        }
        ObjectId key = new ObjectId(item.getId());
        datastore.delete(Film.class, key);
    }

    @Override
    public Film saveOrUpdate(Film item) throws TechnicalException {
        if (item == null) {
            gestionErreur("Entree null ou vide FilmDaoImpl#saveOrUpdate");
        }
        datastore.save(item);
        return item;
    }

    @Override
    public List<Film> getAll() {
        Query<Film> query = datastore.find(Film.class);
        List<Film> result = query.asList();
        return result;
    }

    @Override
    public Film getById(String id) throws TechnicalException {
        if (StringUtils.isBlank(id)) {
            gestionErreur("Entree null ou vide FilmDaoImpl#getById");
        }
        if (!ObjectId.isValid(id)) {
            gestionErreur("Entree incorrecte FilmDaoImpl#getById");
        }
        ObjectId key = new ObjectId(id);
        return (Film) datastore.find(Film.class).field("_id").equal(key);
    }

    private void gestionErreur(String messageErreur) throws TechnicalException {
        logger.error(messageErreur);
        throw new TechnicalException(messageErreur);
    }
}