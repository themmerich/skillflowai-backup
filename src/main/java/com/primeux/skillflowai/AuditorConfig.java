package com.primeux.skillflowai;

import com.primeux.skillflowai.user.data.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditorConfig {

    private final UserRepository userRepository;

    public AuditorConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public AuditorAwareImpl auditorAware() {
        return new AuditorAwareImpl(userRepository);
    }
}
