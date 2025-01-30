package com.primeux.skillflowai.user.logic.service;

import com.primeux.skillflowai.user.data.entity.UserEntity;
import com.primeux.skillflowai.user.data.repository.UserRepository;
import com.primeux.skillflowai.user.logic.mapper.UserMapper;
import com.primeux.skillflowai.user.logic.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).map(userMapper::toUser).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));

        return new org.springframework.security.core.userdetails.User(
                user.username(),
                user.password(),
                user.roles().stream().map(role -> new SimpleGrantedAuthority(role.name())).collect(Collectors.toSet())
        );
    }

    public void saveUser(UserEntity userEntity) {
        // TODO: implementation
        userRepository.save(userEntity);
    }
}
