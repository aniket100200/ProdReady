package ProdReady.Aniket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AniketApplication {

  public static void main(String[] args) {
    SpringApplication.run(AniketApplication.class, args);
  }
}
