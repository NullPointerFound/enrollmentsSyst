package com.hackathon.enrollmentSystem.enrollmentSystem.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info =@Info(
                title = "Enrollment System API",
                version = "1.0",
                contact = @Contact(
                        name = "Malek", email = "malik.mstr@gmail.com"
                ),
                license = @License(
                        name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
                ),
                termsOfService = "none",
                description = "Documentation for Enrollment System API"
        )
)
@SecurityScheme(
        name = "Bearer Authentication",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class SwaggerConfig {

}
