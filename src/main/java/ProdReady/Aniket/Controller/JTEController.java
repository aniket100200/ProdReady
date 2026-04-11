package ProdReady.Aniket.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JTEController {
  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("name", "Aniket");
    model.addAttribute("role", "ADMIN");
    return "index"; // Looks for src/main/jte/index.jte
  }
}
