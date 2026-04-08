package ProdReady.Aniket.Service.UserService.Impl;

import static org.junit.jupiter.api.Assertions.*;

import ProdReady.Aniket.Service.UserService.UserService;
import ProdReady.Aniket.models.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceImpTest {
  @Autowired UserService userService;

  @Test
  void findUser() {
    Users user = userService.findById(1);
    assertNotNull(user);
  }
}
