package ProdReady.Aniket.Repository;

import static org.junit.jupiter.api.Assertions.*;

import ProdReady.Aniket.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

@DataJpaTest
class UserRepositoryTest {
  @Autowired UserRepository userRepository;

  @Test
  void testSaveUser() {
    User user = new User();
    user.setEmail("aniketkhangar459@gmail.com");
    user.setUsername("khangar_aniket");

    User saved = userRepository.save(user);

    assertNotNull(saved);
  }
}
