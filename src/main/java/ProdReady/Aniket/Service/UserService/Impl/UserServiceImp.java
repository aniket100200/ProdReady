package ProdReady.Aniket.Service.UserService.Impl;

import ProdReady.Aniket.Repository.UserRepository;
import ProdReady.Aniket.Service.UserService.UserService;
import ProdReady.Aniket.dtos.reqDtos.UserRequestDto;
import ProdReady.Aniket.dtos.respDtos.UserResponseDto;
import ProdReady.Aniket.exceptions.UserNotFoundException;
import ProdReady.Aniket.models.User;
import ProdReady.Aniket.transformers.UserTransformer;
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
  public UserResponseDto create(UserRequestDto requestDto) {
    User user = UserTransformer.userFromUserRequestDto(requestDto);
    user = saveOrUpdate(user);
    return UserTransformer.userResponseDtoFromUser(user);
  }

  @Override
  public UserResponseDto findByUsername(String username) {
    Optional<User> optionalUser = userRepository.findByUsername(username);
    if (optionalUser.isEmpty()) throw new UserNotFoundException();
    User user = optionalUser.get();
    return UserTransformer.userResponseDtoFromUser(user);
  }

  @Override
  public UserResponseDto findByEmail(String email) {
    Optional<User> optionalUser = userRepository.findByEmail(email);
    if (optionalUser.isEmpty()) throw new UserNotFoundException();
    User user = optionalUser.get();
    return UserTransformer.userResponseDtoFromUser(user);
  }

  @Override
  public UserResponseDto updateUser(UserRequestDto requestDto) {

    return null;
  }

  @Override
  public String getUserName(int id) {

    return "Aniket";
  }

  @Override
  public User findById(int id) {

    Optional<User> byId = userRepository.findById(id);
    return byId.orElse(null);
  }

  @Override
  public UserResponseDto deleteById(int id) {
    User user = userRepository.findById(id).orElseGet(null);
    if (user == null) throw new UserNotFoundException();
    userRepository.delete(user);
    return UserTransformer.userResponseDtoFromUser(user);
  }

  @Override
  public User saveOrUpdate(User user) {
    return userRepository.save(user);
  }
}
