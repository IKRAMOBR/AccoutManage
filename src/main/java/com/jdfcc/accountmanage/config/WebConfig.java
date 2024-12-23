
package com.jdfcc.accountmanage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Appliquer à toutes les routes
                        .allowedOrigins("http://localhost:3000") // Origine autorisée
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Méthodes autorisées
                        .allowCredentials(true); // Permet l'envoi de cookies et des en-têtes de sécurité
            }
        };
    }
}
