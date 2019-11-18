package fr.gcrevisy.media.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.gcrevisy.media.service.MediaServiceImpl;

@Controller
public class MediaController {
    private Logger logger = LoggerFactory.getLogger(MediaController.class);

    @Autowired
    private MediaServiceImpl mediaService;

    @GetMapping(value = "/")
    public String home(Model model) {
        logger.info("Entree dans la methode DashboardController#homePage : " + model.toString());

        model.addAttribute("films", mediaService.getAllFilms());

        return "home";
    }
}