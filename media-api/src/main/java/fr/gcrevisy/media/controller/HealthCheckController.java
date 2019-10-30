package fr.gcrevisy.media.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@ResponseBody
	@GetMapping(value = { "/check" })
	public String check() {
		return "Alive !";
	}

}