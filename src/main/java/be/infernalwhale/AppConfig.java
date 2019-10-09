package be.infernalwhale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public EntityManagerFactory getEMF() {
        return Persistence
                .createEntityManagerFactory("datasourceThor");
    }
}
