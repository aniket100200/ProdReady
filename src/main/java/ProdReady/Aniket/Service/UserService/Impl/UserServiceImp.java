package ProdReady.Aniket.Service.UserService.Impl;

import ProdReady.Aniket.Repository.UserRepository;
import ProdReady.Aniket.Service.UserService.UserService;
import ProdReady.Aniket.models.Users;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserServiceImp(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public String getUserName() {
    return "Aniket";
  }

  @Override
  public Users findById(int id) {

    Optional<Users> byId = userRepository.findById(id);
    return byId.orElse(null);
  }
}
