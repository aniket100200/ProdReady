package ProdReady.Aniket.Service.Impl;

import ProdReady.Aniket.Service.JwtService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class JwtServiceImp implements JwtService {
  @Override
  public String generateToken(String username) {

    return Jwts.builder()
        .setSubject(username)
        .setIssuedAt(new Date())
        .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24)) // for 24 hrs
        .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()), SignatureAlgorithm.HS512)
        .compact();
  }

  @Override
  public String extractUsername(String token) {
    return Jwts.parserBuilder()
        .setSigningKey(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()))
        .build()
        .parseClaimsJwt(token)
        .getBody()
        .getSubject();
  }
}
