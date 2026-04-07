package ProdReady.Aniket.Service;

public interface JwtService {
  String SECRET_KEY = "_Aniket@123";

  String generateToken(String username);

  String extractUsername(String token);
}
