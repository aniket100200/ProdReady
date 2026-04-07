package ProdReady.Aniket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean
  public void userService() {
//    return new UserServiceImp(userRepository());
  }


  public String userRepository() {
    return null;
  }
}
