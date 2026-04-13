package ProdReady.Aniket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
  /**
   * Enabled Global level CORS
   *
   * @param registry
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry
        .addMapping("/auth/**")
        .allowedOrigins("http://localhost:42000")
        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH");
  }
}
