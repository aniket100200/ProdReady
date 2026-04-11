package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Service.UserService.UserService;
import ProdReady.Aniket.dtos.reqDtos.UserRequestDto;
import ProdReady.Aniket.dtos.respDtos.UserResponseDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/create")
  public ResponseEntity<UserResponseDto> createUser(@Valid @RequestBody UserRequestDto requestDto) {
    UserResponseDto userResponseDto = userService.create(requestDto);
    return ResponseEntity.ok(userResponseDto);
  }

  @GetMapping("/find")
  public ResponseEntity<UserResponseDto> findByUsername(@RequestParam("username") String username) {
    return ResponseEntity.ok(userService.findByUsername(username));
  }

//  @Autowired MessageProducer messageProducer;
//
//  @PostMapping("/message")
//  @Profile("kafka")
//  public ResponseEntity<String> addMessageToBroker() {
//    for (int i = 0; i < 1000; i++) {
//      messageProducer.send("Hello: " + i);
//    }
//    return ResponseEntity.ok("Uploaded to the Queue Successfully");
//  }
}
