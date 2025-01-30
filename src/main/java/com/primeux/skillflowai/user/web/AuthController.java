package com.primeux.skillflowai.user.web;

import com.primeux.skillflowai.user.data.entity.UserEntity;
import com.primeux.skillflowai.user.logic.model.User;
import com.primeux.skillflowai.user.logic.service.UserService;
import com.primeux.skillflowai.user.logic.util.JwtUtil;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService userService;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserService userService, JwtUtil jwtUtil, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.username());
        userEntity.setPassword(passwordEncoder.encode(user.password())); // Encrypt password
        userService.saveUser(userEntity);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody User user) {
        UserDetails foundUser = userService.loadUserByUsername(user.username());

        if (!passwordEncoder.matches(user.password(), foundUser.getPassword())) {
            // TODO: this here
            //return ResponseEntity.badRequest().body("Invalid password");
            return null;
        }

        // wrap token in JSON
        String token = jwtUtil.generateToken(user.username());
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Map.of("token", token));
    }
}
