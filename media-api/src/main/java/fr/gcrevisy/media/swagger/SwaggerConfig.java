package fr.gcrevisy.media.swagger;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Logger logger = LoggerFactory.getLogger(SwaggerConfig.class);

    @Bean
    public Docket api() {
        logger.info("SwaggerConfig#api");
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("fr.gcrevisy.media")).paths(paths()).build();

    }

    private ApiInfo apiInfo() {
        logger.info("SwaggerConfig#apiInfo");
        return new ApiInfoBuilder().title("Mediatheque Rest APIs Documentation").description("Nothing here")
                .version("1.0-SNAPSHOT").build();
    }

    private Predicate<String> paths() {
        logger.info("SwaggerConfig#paths");
        return Predicates.and(PathSelectors.regex("/media.*"), Predicates.not(PathSelectors.regex("/error.*")));
    }
}