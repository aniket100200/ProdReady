package ProdReady.Aniket.config.jwt;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public abstract class JwtAuthenticationFilter extends OncePerRequestFilter {}
