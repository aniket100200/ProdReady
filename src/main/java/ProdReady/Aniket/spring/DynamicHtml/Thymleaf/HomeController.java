package ProdReady.Aniket.spring.DynamicHtml.Thymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @Controller
// public class HomeController {
//  @GetMapping("/home")
//  public String home(Model model) {
//    model.addAttribute("message", "Welcome to Springboot Thymeleaf");
//    return "home";
//  }
// }

@Controller
public class HomeController {
  @GetMapping("/home12")
  public String home123() {
    return "home";
  }
}
