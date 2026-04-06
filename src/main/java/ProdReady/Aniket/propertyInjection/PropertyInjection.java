package ProdReady.Aniket.propertyInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prop")
public class PropertyInjection {

  @Value("${spring.datasource.url}")
  String url;

  @GetMapping("/url")
  public String getUrl() {
    return url;
  }
}
