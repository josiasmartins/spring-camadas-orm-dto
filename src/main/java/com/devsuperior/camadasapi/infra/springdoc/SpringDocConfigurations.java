package com.devsuperior.camadasapi.infra.springdoc;

import io.swagger.v3.oas.annotations.tags.Tags;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
//        Server server = new Server().url("http://localhost:8080/users");
        return new OpenAPI()
                .info(new Info()
                        .title("devsuperior.camadas API")
                        .description("API Rest da aplicação devsuperior.camadas API")
                        .contact(new Contact()
                                .name("Time backend")
                                .email("http://camadas/api/licenca")
                        )
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://camadas/api/licenca")
                        )

                )
                .servers(List.of(new Server()
                        .url("http://localhost:8080/users")
                ))
                .tags(List.of(new Tag()
                        .name("api")
                        .description("api rest web")

                ));

    }

}
