package fr.gcrevisy.media.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {

	@ResponseBody
	@GetMapping(value = { "/getcheck" })
	public String test() {
		return "Alive !";
	}

}