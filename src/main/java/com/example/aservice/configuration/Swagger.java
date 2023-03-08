package com.example.aservice.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(
  info = @Info
          (
                title ="Test  Api",
                version="V1",
                description = "Api Test UI"

          ),
        servers = {
            @Server
                    (
                        url ="http://localhost:8080/",
                        description= "local Server"
                    )
        }
)
public class Swagger {
}
