package ProdReady.Aniket.config;

import ProdReady.Aniket.config.jwt.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {
  @Autowired JwtAuthenticationFilter jwtAuthenticationFilter;

  @Bean
  public SecurityFilterChain getSecurityFilterChain(HttpSecurity http) {
    http.authorizeHttpRequests(
            auth ->
                auth.requestMatchers("/admin/**")
                    .hasRole("ADMIN")
                    .requestMatchers("/employee/**")
                    .permitAll()
                    .requestMatchers("/auth/**")
                    .permitAll()
                    .anyRequest()
                    .authenticated())
        .sessionManagement(
            session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

    return http.build();
  }
}
