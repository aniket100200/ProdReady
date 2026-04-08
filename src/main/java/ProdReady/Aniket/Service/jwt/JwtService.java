package ProdReady.Aniket.Service.jwt;

public interface JwtService {
  final String SECRET_KEY =
      "this_is_my_super_long_secret_key_for_day_41_of_my_spring_boot_challenge";

  String generateToken(String username);

  String extractUsername(String token);
}
