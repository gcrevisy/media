package fr.gcrevisy.media.mediaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = "fr.alteca.media.controller")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args); 
	}

}
