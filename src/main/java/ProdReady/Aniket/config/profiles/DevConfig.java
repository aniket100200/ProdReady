package ProdReady.Aniket.config.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
  @Bean
  public String databaseUrl() {
    System.out.println("Hello ^^^^^^^^^^^^^^^^^^^^^^Aniket");
    return "jdbc:postgresql://localhost:5432/dev_db";
  }
}
