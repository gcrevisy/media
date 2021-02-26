package fr.gcrevisy.media.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import fr.gcrevisy.media.model.metier.Film;

public interface FilmDao extends MongoRepository<Film, String> {

    @Query("{'annee' : {$gte : ?0, $lte : ?1}}")
    List<Film> findByAnneeBetween(String debut, String fin);

}