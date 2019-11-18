package fr.gcrevisy.media;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fr.gcrevisy.media")
public class RestApp {

    public static void main(String[] args) {
        SpringApplication.run(RestApp.class, args);
    }

}
