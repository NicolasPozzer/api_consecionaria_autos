package com.demo.api_consecionaria_autos.Swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
    @Bean
    public OpenAPI api(){
        return new OpenAPI().info(new Info().title("Api Rest de una Consecionaria de Vehiculos")
                .version("v0.1.0").contact(new Contact().name("Nico")
                .url("https://github.com/NicolasPozzer").email("pozzernico@gmail")).license(new License()
                        .url("https://www.google.com").name("Google"))
                .description("Api encargada de realizar peticiones a una base de datos" +
                        " que almacena toda la informacion de una consecionaria."));
    }
}
