package fr.gcrevisy.media.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import fr.gcrevisy.media.dao.FilmDao;
import fr.gcrevisy.media.exception.TechnicalException;
import fr.gcrevisy.media.model.metier.Film;

@Service
public class FilmDaoImpl implements FilmDao {

        @Override
        public void delete(String id) throws TechnicalException {
                if (StringUtils.isBlank(id)) {
                        throw new TechnicalException("Entree null ou vide FilmDaoImpl#delete");
                }
        }

        @Override
        public void delete(Film item) throws TechnicalException {
                if (item == null) {
                        throw new TechnicalException("Entree null ou vide FilmDaoImpl#delete");
                }
        }

        @Override
        public Film saveOrUpdate(Film item) throws TechnicalException {
                if (item == null) {
                        throw new TechnicalException("Entree null ou vide FilmDaoImpl#saveOrUpdate");
                }
                return item;
        }

        @Override
        public List<Film> getAll() {
                List<Film> result = new ArrayList<Film>();

                int cpt = 0;
                int padding = 10;

                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "2 days in New York",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Django Unchained", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Brave", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Looper", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Star Trek into darkness",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Star Trek", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Silver linings", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Beautiful creatures",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Pacific rim", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Hobbit : an unexpected journey", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Princess bride", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The Dark Knight", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Public enemies", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Avengers", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Shutter Island", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Inception", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Gatsby", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "J Edgar", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Les infiltrés", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Sweeney Todd", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Harry Potter et l'école des sorciers", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Harry Potter et la chambre des sercrets", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Harry Potter et le prisionner d'Azkaban", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Harry Potter et la coupe de feu", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Harry Potter et l'Ordre du Phoenix", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Harry Potter et le Prince de sang mélé", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Harry Potter et les reliques de la mort (Pt 1)", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Harry Potter et les reliques de la mort (Pt 2)", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "007 : Skyfall", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "007 : Casino Royal",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "007 : Quantum of Solace",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Le secret des poignards volants", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "500 jours ensemble",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Usual Suspects", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Shrek 2", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Le marchand de Venise",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "2012", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Pluie d'enfer", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Constantine", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "L'exorciste", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Les fugitifs", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Le cercle", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Merlin l'enchanteur",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Wall Street", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Sin City", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Les incorruptibles",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Exitenze", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Ca", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Monsieur N.", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Les infiltrés", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Fantasia", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The green hornet", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Le chacal", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "le nom de la rose",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Requiem for a dream",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Van Helsing", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The Dark Knight rises",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Hell", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Shoot 'em up", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Walk the line", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Happy go lucky", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Ghost world", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The Queen", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "In the loop", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "American beauty", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Frost / Nixon", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "In Bruges", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Raison et sentiments",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Identity", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Ed Wood", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Edward aux mains d'argent", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "L'étrange Noël de Mister Jack", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Aviator", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Watchmen", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "L'amée des 12 singes",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Beetlejuice", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "L'assassinat de Jesse James", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Le nom des gens", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Made in Dagenhan", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Hook", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "True Grit", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Death proof", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Le chateau dans le ciel",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Charlie et la chocolatrie", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The expendables", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Coup de foudre à Bollywood", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Sherlock Holmes", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Sherlock Holmes : jeu d'ombres", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The social network",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Robin des bois", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Boulevard de la mort",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Les desastreuses aventures des orphelins Beaudelaire", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The King's speech",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Eternal sunshine of the spotless mind", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Gran torino", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Bowling for colombine",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Les fils de l'homme",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Invictus", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Orgueil et préjugés",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Priceless", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "La vérité nue", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Mansfielf park", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "A passage to India",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Jane Eyre", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Elizabeth", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Elizabeth, the golden age", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Marie-Antoinette", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Three times", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Elephant", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Plup fiction", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Gladiator", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "2 days in Paris", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Shakespeare in love",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "In her shoes", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Escrocs mais pas trop",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "H2G2, le guide du voyageur galactique", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Little miss sunshine",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Les laisons dangereuses",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Virgin suicides", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Lost in translation",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Gwen", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Dark crystal", "DVD",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Kingdom of heaven",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Lolita", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "King Lear", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Les noces funèbres",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Mon voisin Totoro",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Le chateau ambulant",
                                "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "La ligue des gentlemen extraordinaires", "DVD", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Echelon.Conspiracy.FRENCH.BRRIP.XVID.AC3-TBoss", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The Hunger Games 1",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The Hunger Games 2",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "[nextorrent.net] Kingsman.The.Secret.Service.2014.UNRATED.TRUEFRENCH.BDRip.XviD-ripSoT",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Captain America - The Winter Soldier", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Midnight in Paris",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Detective.dee.2.2013.FRENCH.BDRIP.XviD-CREED", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 01",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 02",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 03",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 04",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 05",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 06",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 07",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 08",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 09",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S1 10",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 01",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 02",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 03",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 04",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 05",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 06",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 07",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 08",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 09",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S2 10",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "GxOxT.S03E010.FRENCH.HDTV.WwW.Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "GxOxT.S03E02.FRENCH.HDTV.WwW.Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "GxOxT.S03E03.FRENCH.HDTV.WwW.Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "GxOxT.S03E04.FRENCH.HDTV.WwW.Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "GxOxT.S03E05.FRENCH.HDTV.WwW.Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "GxOxT.S03E06.FRENCH.HDTV.WwW.Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "GxOxT.S03E07.FRENCH.HDTV.WwW.Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "GxOxT.S03E08.FRENCH.HDTV.WwW.Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "GxOxT.S03E09.FRENCH.HDTV.WwW.Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E01.deux.épées.FRENCH.BDRip.www.zone-telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E02.le lion.et.la.rose.FRENCH.BDRip.www.zone-telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E03.Briseuse.de.chaines.FRENCH.BDRip.www.zone-telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E04.Féale.FRENCH.BDRip.www.zone-telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E05.Premier.du.nom.FRENCH.BDRip.www.zone-telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E06.les.lois.des.dieux.et.des.hommes.FRENCH.BDRip.www.zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E07.FRENCH.L'oiseau.moqueur.BDRip.www.zone-telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E08.La.montagne.et.la.vipére.FRENCH.BDRip.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E09.Les.veilleurs.au.rempart.FRENCH.BDRip.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "S04E10.FiNAL.Les.enfants.FRENCH.BDRip.www.zone-telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S05E01.FRENCH.HDTV.XviD.SVR.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S05E02.FRENCH.HDTV.XviD-ARK01.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S05E03.FRENCH.HDTV.XviD-SVR.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S05E04.FRENCH.HDTV.XviD-ZT.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.of.Thrones.S05E05.FRENCH.HDTV.XviD-ARK01.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.of.Thrones.S05E06.FRENCH.WEB-DL.XviD-ARK01.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.of.Thrones.S05E07.FRENCH.WEB-DL.XviD-ARK01.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S05E08.FRENCH.LD.WEB-DL.XviD-SVR.www.zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S05E09.FRENCH.LD.WEB-DL.XviD.SVR.www.zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S05E10.FRENCH.REPACK.LD.WEB-DL.XviD.SVR.www.zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S06E01.FRENCH.HDTV.XviD-ASPHiXiAS.www.zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.of.Thrones.S06E02.FRENCH.LD.WEB-DL.XviD-ZT.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S06E03.FRENCH.LD.WEB-DL.XviD-ZT.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S06E04.FRENCH.AHDTV.XviD-ZT.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S06E05.FRENCH.LD.WEB-DL.XviD-ZT.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S06E06.FRENCH.LD.WEB-DL.XviD-ZT.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S06E07.FRENCH.LD.WEB-DL.XviD-ZT.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S06E08.FRENCH.LD.WEB-DL.XviD-ZT.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S06E09.FRENCH.AHDTV.XviD-ZT.www.zone-telechargement.ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Game.Of.Thrones.S06E10.FiNAL.FRENCH.LD.WEB-DL.XviD-ZT.www.zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 04", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "La.Nonne.FRENCH.DVDRip.XVID.www.zone-telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "LES 7 MERCENAIRES FRENCH DVDRIP XVID AC-3 schumi", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Pour.une.poignee.de.dollars", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Hundred.Foot.Journey.2014.TRUEFRENCH.DVDRip.XviD.AC3-UTT", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "12 years a slave - 1080p VFF EN mHDgz", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "20.Ans.d.Ecart.2013.FRENCH.1080p.BluRay.x264-ULSHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Ant-Man 2015 VFF-VFQ-VOA 1080p HDLight x264.GHT", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Babel (2006) [1080p] MULTi BluRay x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Battleship (2012) [MULTi] [1080p] BluRay x264-anod", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Big.Bad.Wolves.2013.LIMITED.720p.BluRay.x264-IGUANA", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Capitaine Phillips (2013) [1080p] MULTi VFF BluRay x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Deadpool 2016 MULTi VFF-VFQ-VOA AC3 1080p HDLight x264.GHT", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Divergente.2.2015.TRUEFRENCH.1080p.HDlight.x264-SVR", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor Strange (2016) MULTi VFF [1080p] BluRay x264 AC3-DTS-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E00.Christmas.Special.720p.HDTV.x264-FoV[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Drive.2011.MULTi.(VFF+VFQ).1080p.BluRay.HDLight.AC3.x264-Zone80", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Exodus.Gods.and.Kings.2014.French.1080p.HDLight-x264.GHT", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Fury 2014 TRUEFRENCH 1080p x264 AC3 [MorphisM]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Gods.of.Egypt.2016.MULTI.VFF.VFQ.VO.1080p.BluRay.x264-SVR", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Hugo Cabret 2011 French 1080p HDrip x264 ac3 HDLight.Mph", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "I Give It a Year 2013 MULTI 1080p BluRay x264-CARPEDIEM", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Independence Day Resurgence 2016 2016 MULTi VFF AC3-DTS 1080p HDLight x264.GHT",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Into The Wild 2007 BluRay 1080p x264-Nyu", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Jack Reacher Never Go Back 2016 MULTi VFF-VFQ-VOA AC3 1080p HDLight x264.GHT",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Jason Bourne - L'Héritage", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Josephine.HDrip.720p.X264.AC3", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Jupiter Ascending (2015) - 1080p VFF EN x264 ac3 mHDgz", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Jurassic World 2015 MULTi VFF (DTS-AC3) 1080p HDLight x264.GHT", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "La.vie.secrète.(rêvée).de.Walter.Mitty.truefrench.2013.BDrip.x264.aac.(The.Secret.Life.of.Walter.Mitty)-Les Bidochons",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Le Labyrinthe La Terre brulee 2015 TRUEFRENCH HDLight 1080p x264 AC3-Wita", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Le.Conte.de.la.Princesse.Kaguya.1080p.Multi.x264.AC3-Kayneth", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "lost-indipalace.720p",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "lost-machetekills.1080p",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Machete.2010.FRENCH.720p.x264.mHD-FTX", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Mad Max Fury Road 2015 MULTi FR2 1080p HDLight x265 HEVC.GHT", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Mercy.2014.FRENCH.WEB-DL.1080p.x264.AC3-BaliBalo", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Mr. Holmes (2015) MULTI [1080p] Bluray x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "No Escape (2015) MULTI [1080p] Bluray x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Now You See Me 2 2016 MULTi TrueFrench 1080p HDLight x264.GHT", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Oh.My.God!.2011.Truefrench.BDrip.x264-Les Bidochons", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Percy Jackson 1 [1080p] MULTI 2010 BluRay x264-Pop .Le Voleur de foudre. ", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Pitch Perfect 2 (2015) MULTI (VFF-VO) [1080p] Bluray x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Pitch Perfect.2012.1080p.Multi TrueFrench.BDRip.x264.sub (by kimo)", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Point.Break.2015.1080p.Truefrench.DTS.H264~Xantar", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Premonitions (2015) [1080p] Multi Dts AAC Hdlight x264-Ju", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Rogue.One.A.Star.Wars.Story.2016.Truefrench.1080p.HDLight.DTS.H264-Xantar", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Seul.Sur.Mars.The.Martian.2015.1080p.Truefrench.DTS.H264~Xantar", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Sin City J'ai tué pour Elle (2014) [1080p] MULTi BluRay x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Snowden.2016.Truefrench.1080p.HDLight.DTS.H264-Xantar", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Spectre (2015) MULTi (VFF-VOA) [1080p] BluRay x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star Trek Beyond 2016 MULTi VFF 1080p HDLight x264.GHT", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Trek.Beyond.2016.MULTi.VFF.VFQ.VOA.1080p.WEB.H264-SVR", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Wars.Episode.VII.The.Force.Awakens.2015.1080p.Truefrench.DTS.H264~Xantar",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Wars.I.[1080p].MULTi.(1999).BluRay.x264-PopHD.(La.menace.fantome.1)", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Wars.II.[1080p].MULTi.(2002).BluRay.x264-PopHD(L.attaque.des.clones.2)",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Wars.III.[1080p].MULTi.(2005).BluRay.x264-PopHD.(La.revanche.des.siths.3)",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Wars.IV.[1080p].MULTi.(1977).BluRay.x264-PopHD(Un.nouvel.espoir.4)", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Wars.V.[1080p].MULTi.(1980).BluRay.x264-PopHD(L.empire.contre.attaque.5)",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Wars.VI.[1080p].MULTi.(1983).BluRay.x264-PopHD(Le.retour.du.Jedi.6)", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Survivor 2015 MULTi 1080p HDLight x264.GHT", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The 6th Day (2000) A l'aube du 6eme jour MULTi TrueFrench 1080p HDLight x264.GHT",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The Dark Knight Rise(2012)", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The Hunger Games Mockingjay Part 1 (2014) [1080p] MULTi BluRay x264-PopHD", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Great.Wall.2016.Truefrench.1080p.HDLight.AC3.H264-Xantar", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Hobbit.The.Desolation.of.Smaug.2013.TRUEFRENCH.1080p.BluRay.AC3.x264", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Wolf.of.Wall.Street.2013.TRUEFRENCH.1080p.BluRay.AC3.x264", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Thor - The Dark World 2013 BluRay 1080p x264 [FAB -2014]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "[nextorrent.cx] Alien.Covenant.2017.MULTI.1080p.HDLight.x264.AC3-EXTREME", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Amazonia", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "American Sniper",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Atomic Blonde",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Captain America - Civil War", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Doctor Strange",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Edge of tomorrow",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Gladiator", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Godzilla (2014)",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Interstellar", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Intouchables", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Kill Bill Vol 1",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Kill Bill Vol 2",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Le Hobbit La bataille des cinq armees", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Les Animaux fantastiques", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Les huit salopards",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Lucy", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Magic in the moonlight",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Mission Impossible - Rogue Nation", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Mission Impossible Fallout", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Monuments Men",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Nikita", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "No country for old men",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Prometheus", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Pulp Fiction", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Seul sur Mars",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Sixième sens", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Snowpiercer", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The Artist", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The best offer",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The Imitation Game",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "The Revenant", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Thor", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "True Lies", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Warcraft", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "47 Ronin [2013] TRUEFRENCH 1080p BluRay AC3 x264-Phoenix186", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Alita.Battle.Angel.2019.MULTi.1080p.BluRay.Light.x264.AC3-ACOOL.WwW.Zone-Telechargement.Net",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "AllMoWo.2017.MTFR.BL1080p", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "American.Made.2017.MULTI.TRUEFRENCH.1080p.BluRay.Light.x264.AC3.ACOOL.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Annabelle.2.Creation.2017.MULTi.TRUEFRENCH.1080p.BluRay.Light.x264.AC3.ACOOL.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Arrival.2016.MULTI.1080p.HDLight.x264.AC3.WwW Zone-Telechargement.Ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Assassins.Creed.2016.Truefrench.1080p.HDLight.DTS.H264", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Avengers.Endgame.2019.MULTi.1080p.BluRay.Light.x264.AC3-ACOOL.WwW.Zone-Telechargement.NET",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Avengers.Infinity.War.2018.MULTi.TRUEFRENCH.1080p.HDLight.x264-RDH.WwW.Zone-Telechargement1.ORG",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Birdman (2014) 1080p x264 AC3 5.1 MULTI [NOEX]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Blitz.2011.MULTi.TREUFRENCH.1080p.HDLight.x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Conjuring.Les.Dossiers.Warren.TRUEFRENCH.1080p.HDLight.x264.AC3.JiM-ZT.WwW.Zone-Telechargement.NET",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Divergente.2014.TRUEFRENCH.720p.Bluray.LIGHT.x264-SVR", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S09E04.720p.HDTV.x264-TLA[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E00.The.Return.of.Doctor.Mysterio.HDTV.x264-DEADPOOL[eztv]",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E01.720p.HDTV.x264-MTB[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E02.720p.HDTV.x264-FoV[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E03.720p.HDTV.x264-MTB[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E04.720p.HDTV.x264-FoV[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E05.720p.HDTV.x264-FoV[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E06.720p.HDTV.x264-FoV[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E07.720p.HDTV.x264-MTB[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E08.720p.HDTV.x264-FoV[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E09.720p.WEB.h264-TBS[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E10.720p.HDTV.x264-FoV[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E11.720p.HDTV.x264-FoV[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Doctor.Who.2005.S10E12.720p.HDTV.x264-FoV[eztv]", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Escape.Room.2017.MULTi.1080p.BluRay.Light.x264.AC3-ACOOL-ZT-WwW.Annuaire-Telechargement.CoM",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 01",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 02",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 03",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 04",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 05",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 06",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 07",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 08",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 09",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S3 10",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 01",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 02",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 03",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 04",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 05",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 06",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 07",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 08",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 09",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S4 10",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S5 01",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S5 02",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S5 03",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S5 04",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S5 05",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S5 06",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S5 07",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S5 08",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game Of Thrones S5 09",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 01",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 02",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 03",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 04",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 05",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 06",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 07",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 08",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 09",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S6 10",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S7 01",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S7 02",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S7 03",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S7 04",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S7 05",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S7 06",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "Game of Thrones S7 07",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Green.Book.2018.MULTi.1080p.BluRay.Light.x264.AC3-ACOOL.WwW.Annuaire-Telechargement.CoM",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Guardians.of.the.Galaxy.Vol.2.2017.MULTi.1080p.BluRay.x264-VENUE.WwW.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Hellboy.2004.DC.1080p.TRUEFRENCH.Hdlight.AC3.x264-Ju-ZT-zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Hellboy.II.The.Golden.Army.2008.1080p.TRUEFRENCH.Hdlight.AC3.x264-Ju-zonne-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Hidden.Figures.2016.MULTi.1080p.HDLight.x264.AC3-SPADE.WwW.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 01", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 02", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 03", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 05", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 06", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 07", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 08", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 09", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 10", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 11", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 12", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 13", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S1 14&15", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 01", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 02 à refaire", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 03", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 04", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 05", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 06", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 07", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 08", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 09", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 10", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 11", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 12", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 13", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 14", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S2 15", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 01", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 02", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 03", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 04", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 05", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S3 06", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S3 07", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S3 08", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away with Murder S3 09", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 10", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 11", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 12", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 13", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 14", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "How To Get Away With Murder S3 15", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Independence Day Extended - TF Multi 1080p HDL", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Independence.Day.Resurgence.2016.MULTi.VFF.1080p.BluRay.x264-SVR", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Jack.Reacher.2012.MULTi.(VFF VFQ).1080p.Bluray.HDLight.AC3.x264-Zone80-zone-Telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "John.Wick.2.MultiTrueFrench.HDLight.1080p", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "John.Wick.2014.MULTi.TRUEFRENCH.1080p.BluRay.DTS.x264", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "jurrasick world 2 jwfk.fhl-rdh.zone", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Kingsman.The.Golden.Circle.2017.MULTI.1080p.BluRay.Light.x264.AC3.ACOOL.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Kingsman.The.Golden.Circle.2017.MULTi.TRUEFRENCH.1080p.BluRay.DTS.x264.WwW.Zone-Telechargement1.com",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Kingsman.The.Golden.Circle.2017.MULTi.TRUEFRENCH.1080p.BluRay.Light.x264.AC3-ACOOL.Zone-Telechargement1.Com",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "La 5ème vague 2016 MULTi VFQ AC3 1080p HDLight x264.GHT (The 5th Wave)-zone-Telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "La.Planète.des.Singes.L'affrontement.1080p.BluRay.HDLight.5AUDIO.x264-Zone80",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Le.Choc.Des.Titans.2010.MULTI.Bluray.1080p.mHDLight.AC3.5.1.x264-Zone80", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Les.Gardiennes.2017.FRENCH.1080p.BluRay.Light.x264.AC3-ACOOL.Zone-Telechargement1.Com",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Les Recettes du bonheur (2014) (The Hundred-Foot Journey) 1080p x264 AC3 5.1 MULTI [NOEX]",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Les Rivie'res Pourpres (HDLight - 1080p)-zone-Telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Life.2017.FRENCH.1080p.BluRay.Light.x265.HEVC.AC3.ACOOL.Zone-Telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Guns, Knives & Explosives PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "London Has Fallen (2016) MULTi [1080p] BluRay x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The Making of London Has Fallen PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Men.In.Black.1.MULTi.VFF.1080p.HDLIGHT.x264-SVR", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Men.In.Black.2.MULTi.VFF.1080p.HDLIGHT.x264-SVR", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Men.In.Black.3.MULTi.VFF.1080p.HDLIGHT.x264-SVR", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Money Monster 2016 MULTi VFQ AC3-DTS 1080p HDLight x264.GHT-zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "mu.on.the.or.expr.2017.multi.1080p.bluray.x264-venue-WwW.zone-telechargement1.com",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "New York Melody (2013) (Begin Again)", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Night at the Museum (2006) [1080p] MULTi BluRay x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Night at the Museum Battle of the Smithsonian (2009) MULTi-VF2 [1080p] BluRay x264-PopHD",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Night at the Museum Secret of the Tomb (2014) MULTi-VF2 [1080p] BluRay x264-PopHD ",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "OSS 117 RIo 1080 FR 2009 BluRay x264 Zone-Telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Pacfc.Rm.Uprising.2018.MULTi.TRUEFRENCH.1080p.BluRay.Light.x264.AC3-ACOOL-WwW.Annuaire-Telechargement.CoM",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Passengers.2016.MULTi.TRUEFRENCH.1080p.BluRay.Light.x264.ACOOL.Zone-Telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Pirates.of.the.Caribbean.Dead.Men.Tell.No.Tales.2017.MULTi.TRUEFRENCH.1080p.BluRay.Light.x264.AC3.ACOOL.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Pirates.of.the.Caribbean.Dead.Men.Tell.No.Tales.2017.MULTi.TRUEFRENCH.1080p.BluRay.Light.x265.HEVC.AC3.ACOOL.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Ready.Player.One.2018.MULTi.TRUEFRENCH.1080p.BluRay.Light.x264.AC3-ACOOL.Zone-Telechargement1.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Red.Sparrow.2018.MULTI.VFF.1080p.mHD.x264.AC3.5.1-SEL-1ww.zone-telechargement1.com",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Reservoir Dogs (1992) [1080p] VFF Hdlight x264", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Shining.1980.MULTi.1080p.HDLight.x264.AAC5.1-TRUNKDU92-zone-Telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"), "ninhd-sphere-1080",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Spider-Man.Homecoming.2017.MULTi.TRUEFRENCH.1080p.BluRay.DTS-HDMA.x264-ZT.WwW.Zone-Telechargement.NET",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Split.2016.MULTI.1080p.HDLight.x264.AC3-SPADE-Zone-Telechargement.ws-", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Wars.The.Last.Jedi.2017.MULTi.TRUEFRENCH.1080p.HDLight.x264.AC3-Annuaire-Telechargement.Com",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Star.Wars.Episode.VII.-.Le.Réveil.de.la.Force.2015.x265.HEVC.1080p.Multi.VFF.AC3.VO.AC3.Sub.Fr.GuS2SuG",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Suicide Squad (2016) Extended MULTi [1080p] BluRay x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The Beguiled (2017)  1080p  BluRay x264-Nyu-Shanks@Zone-Telechargement.Ws", "Fichier",
                                ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.BFG.2016.MULTi.1080p.BluRay.x264-VENUE.pemium.www.zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Conjuring.2.2016.Truefrench.1080p.HDLight.DTS.H264-Xantar.www.zone-telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Dark.Tower.2017.MULTI.1080p.BluRay.Light.x264.AC3.ACOOL.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Equalizer.2.2018.MULTi.TRUEFRENCH.1080p.HDLight.x264-RDH.WwW.Annuaire-Telechargement.CoM",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Equalizer.2014.MULTi.1080p.Bluray.HDLight.AAC-LC.x264-Zone80-zone-Telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The Huntsman Winters War - Multi 1080p HDL-zone-Telechargement.ws", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The Huntsman Winters War - Multi 1080p HDL", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Magnificent.Seven.2016.Truefrench.1080p.HDLight.AC3.H264-Xantar-zone-Telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "fhd-adjustment.bureau.720p", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Bling.Ring.2013.FRENCH.720p.BluRay.x264-NERDHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "The.Butler.2013.1080p.BluRay.x264.VO(STFR)-VF.ACC-5.1", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "the.iron.lady.2011.multi.truefrench.1080p.bluray.x264.dts-rough", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "There Will Be Blood (2007) MULTi VFF 1080p BluRay x264-PopHD-zone-Telechargement.ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Thor.Ragnarok.2017.MULTI.1080p.BluRay.Light.x264.AC3-ACOOL.Zone-Telechargement1.Com",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Tolkien.2019.MULTi.1080p.BluRay.Light.x264.AC3-ACOOL.WwW.Zone-Telechargement.Net",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Tomb.Raider.2018.MULTi.TRUEFRENCH.1080p.BluRay.Light.x264.AC3-ACOOL.Zone-Telechargement1.Com",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Ocean's 11 - 1080p FR EN x264 ac3 mHDgz", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Ocean's 12 - 1080p FR EN x264 ac3 mHDgz", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Ocean's 13 - 1080p FR EN x264 ac3 mHDgz", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Valerian.and.the.City.of.a.Thousand.Planets.2017.MULTI.1080p.BluRay.Light.x264.AC3",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Venom.2018.MULTi.1080p.HDLight.AC3.x264-RDH.WwW.Annuaire-Telechargement.COM",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Venom.2018.MULTi.TRUEFRENCH.1080p.BluRay.Light.x264.AC3-ACOOL.WwW.Annuaire-Telechargement.CoM",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "War.for.the.Planet.of.the.Apes.2017.MULTi.1080p.BluRay.Light.x264.AC3.ACOOL.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Wonder.Woman.2017.MULTi.1080p.BluRay.Light.x264.AC3.ACOOL.Zone-Telechargement.Ws",
                                "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "X-Men Apocalypse (2016) MULTi [1080p] BluRay x264-PopHD", "Fichier", ""));
                result.add(new Film(StringUtils.leftPad(String.valueOf(++cpt), padding, "0"),
                                "Yves Saint Laurent (2014) 1080p x264 AC3 5.1 [NOEX]", "Fichier", ""));

                return result;
        }

        @Override
        public Film getById(String id) throws TechnicalException {
                if (StringUtils.isBlank(id)) {
                        throw new TechnicalException("Entree null ou vide FilmDaoImpl#delete");
                }
                return new Film("id", "libelle", "support", "annee");
        }

}