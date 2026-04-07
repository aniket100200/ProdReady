package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Service.JwtService;
import ProdReady.Aniket.dtos.reqDtos.AuthRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

  JwtService jwtService;

  @Autowired
  public void setJwtService(JwtService jwtService) {
    this.jwtService = jwtService;
  }

  @PostMapping("/login")
  public ResponseEntity login(AuthRequestDto dto) {
    return ResponseEntity.ok("token");
  }
}
