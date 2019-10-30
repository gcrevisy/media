package fr.gcrevisy.media.controller;

import org.springframework.stereotype.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class FilmController {

	@ResponseBody
	@GetMapping(value = { "/getcheck" })
	public String test() {
		return "Alive !";
	}

}