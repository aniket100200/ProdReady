package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Service.jwt.JwtService;
import ProdReady.Aniket.dtos.reqDtos.AuthRequestDto;
import ProdReady.Aniket.dtos.respDtos.AuthResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

  JwtService jwtService;
  AuthenticationManager authenticationManager;

  @Autowired
  public void setJwtService(JwtService jwtService) {
    this.jwtService = jwtService;
  }

  @Autowired
  public void setAuthenticationManager(AuthenticationManager authenticationManager) {
    this.authenticationManager = authenticationManager;
  }

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody AuthRequestDto dto) {
    try {
      // 1. Attempt Authentication
      Authentication authentication =
          authenticationManager.authenticate(
              new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));

      // 2. If successful, generate and return token
      if (authentication.isAuthenticated()) {
        String token = jwtService.generateToken(dto.getUsername());
        return ResponseEntity.ok(new AuthResponseDto(token));
      }

    } catch (BadCredentialsException e) {
      // 🚩 Catch the wrong password/username error!
      return ResponseEntity.status(401).body("Error: Invalid username or password!");
    } catch (Exception e) {
      // Catch any other weird errors (like JSON mapping issues)
      return ResponseEntity.status(500).body("Error: " + e.getMessage());
    }

    return ResponseEntity.status(401).body("Invalid user request!");
  }

  @GetMapping("/getName")
  public String getName() {
    return "GET Name";
  }
}
