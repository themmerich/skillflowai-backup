package com.primeux.skillflowai.user.data.repository;

import com.primeux.skillflowai.user.data.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    RoleEntity findByName(String name);
}
