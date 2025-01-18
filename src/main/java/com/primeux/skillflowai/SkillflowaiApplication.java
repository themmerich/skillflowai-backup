package com.primeux.skillflowai;

import com.primeux.skillflowai.user.data.UserEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Optional;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
@EnableTransactionManagement
public class SkillflowaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillflowaiApplication.class, args);
	}

	@Bean
	public AuditorAware<UserEntity> auditorProvider() {
		// Replace with logic to fetch the authenticated user, e.g., from Spring Security
		return () -> Optional.of(new UserEntity(1L, "defaultUser"));
	}
}
