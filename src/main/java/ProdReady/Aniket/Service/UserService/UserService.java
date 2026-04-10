package ProdReady.Aniket.Service.UserService;

import ProdReady.Aniket.dtos.reqDtos.UserRequestDto;
import ProdReady.Aniket.dtos.respDtos.UserResponseDto;
import ProdReady.Aniket.models.User;

public interface UserService {
  UserResponseDto create(UserRequestDto requestDto);

  UserResponseDto findByUsername(String username);

  UserResponseDto findByEmail(String email);

  UserResponseDto updateUser(UserRequestDto requestDto);

  String getUserName(int id);

  User findById(int id);

  UserResponseDto deleteById(int id);

  User saveOrUpdate(User user);
}
