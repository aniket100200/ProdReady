package ProdReady.Aniket.config;

import ProdReady.Aniket.Repository.Impl.InmemoryUserRepository;
import ProdReady.Aniket.Repository.UserRepository;
import ProdReady.Aniket.Service.UserService.Impl.UserServiceImp;
import ProdReady.Aniket.Service.UserService.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean
  public UserService userService() {
    return new UserServiceImp(userRepository());
  }

  @Bean
  public UserRepository userRepository() {
    return new InmemoryUserRepository();
  }
}
