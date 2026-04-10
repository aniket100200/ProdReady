package ProdReady.Aniket.transformers;

import ProdReady.Aniket.dtos.reqDtos.UserRequestDto;
import ProdReady.Aniket.dtos.respDtos.UserResponseDto;
import ProdReady.Aniket.models.User;

public class UserTransformer {
  public static User userFromUserRequestDto(UserRequestDto requestDto) {
    return User.builder()
        .username(requestDto.username())
        .age(requestDto.age())
        .email(requestDto.email())
        .build();
  }

  public static UserResponseDto userResponseDtoFromUser(User user) {
    return new UserResponseDto(user.getId(), user.getUsername(), user.getEmail(), user.getAge());
  }
}
