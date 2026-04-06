package ProdReady.Aniket.Controller;

import ProdReady.Aniket.User;
import ProdReady.Aniket.exceptions.UserNotFoundException;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Practice {
  @GetMapping("/exc")
  public String getResp() throws Exception {
    if (true) throw new UserNotFoundException();

    return "Loved";
  }

  /*
   Content Negotiation
  */

  @GetMapping(
      value = "/content",
      produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
  public List<User> getAllUsers() {
    User user = User.builder().name("Aniket").age(1).role("ADMIN").build();
    User user1 = User.builder().name("Mitthu").age(2).role("Viewer").build();

    return Arrays.asList(user1, user);
  }
}
