package ProdReady.Aniket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
//  @Bean
//  public UserService userService() {
//       return new UserServiceImp(userRepository());
//  }

  public String userRepository() {
    return null;
  }

  @Bean
  public AuthenticationManager authenticationManager(AuthenticationConfiguration config)
      throws Exception {
    return config.getAuthenticationManager();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    UserDetails user =
        User.builder()
            .username("aniket")
            .password(passwordEncoder().encode("123"))
            .roles("USER")
            .build();

    UserDetails user2 =
        User.builder()
            .username("ojas")
            .password(passwordEncoder().encode("ojas"))
            .roles("ADMIN")
            .build();

    return new InMemoryUserDetailsManager(user, user2);
  }
}
