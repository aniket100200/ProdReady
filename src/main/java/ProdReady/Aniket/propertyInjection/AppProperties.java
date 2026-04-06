package ProdReady.Aniket.propertyInjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@ConfigurationProperties("spring.datasource")
@AllArgsConstructor
@NoArgsConstructor
@Data
@RestController
@RequestMapping("/app")
public class AppProperties {
  private String url;
  private String username;
  private String password;

  @GetMapping("/all")
  public String getAllData() {
    return url + "-->" + username + "--->" + password;
  }
}
