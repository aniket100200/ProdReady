package ProdReady.Aniket.validation;

import ProdReady.Aniket.models.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/validate")
@RestController
public class ValidationController {
  @Autowired ValidationService service;

  @PostMapping("/add")
  public ResponseEntity addUser(@Valid @RequestBody User user, @RequestParam("amt") int amount) {
    service.process(amount);

    return ResponseEntity.ok("Is a valid User");
  }
}

@Service
@Validated
class ValidationService {
  public void process(@Min(100) int amount) {
    System.out.println("Successfully Withdrawn " + amount);
  }
}
