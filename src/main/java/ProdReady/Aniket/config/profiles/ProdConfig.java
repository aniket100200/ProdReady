package ProdReady.Aniket.config.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {
  @Bean
  public String databaseUrl() {
    System.out.println("Hello ^^^^^^^^^^^^^^^^^^^^^^ Prod only");
    return "jdbc:postgresql://localhost:5432/prod_db";
  }
}
