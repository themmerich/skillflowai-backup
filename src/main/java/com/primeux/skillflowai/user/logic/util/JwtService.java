package com.primeux.skillflowai.user.logic.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;

@Component
public class JwtService {
    @Value("${application.security.jwt.expiration-access}")
    private long expirationAccess;

    @Value("${application.security.jwt.expiration-refresh}")
    private long expirationRefresh;

    private static final String SECRET_KEY = "k84dG4tD4k3N97XpBv9G+T8Bq1L9q5JxzV9V9yL7SkA=";
    private static final Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(SECRET_KEY));

    public String generateAccessToken(UserDetails user) {
        Date expirationDate = new Date(System.currentTimeMillis() + expirationAccess);
        String name = user.getUsername();
        // TODO: add claims?
        return createToken(name, expirationDate);
    }

    public String generateRefreshToken(UserDetails user) {
        Date expirationDate = new Date(System.currentTimeMillis() + expirationRefresh);
        return createToken(user.getUsername(), expirationDate);
    }

    private String createToken(String username, Date expirationDate) {
        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(expirationDate)
                .signWith(key)
                .compact();
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        Date expirationDate = extractExpiration(token);
        if (expirationDate.before(new Date())) {
            return false;
        }

        String username = extractUsername(token);
        return userDetails.getUsername().equals(username);
    }

    public String extractUsername(String token) {
        return Jwts.parser()
                .verifyWith((SecretKey) key)
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }

    public Date extractExpiration(String token) {
        return Jwts.parser()
                .verifyWith((SecretKey) key)
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getExpiration();
    }
}
