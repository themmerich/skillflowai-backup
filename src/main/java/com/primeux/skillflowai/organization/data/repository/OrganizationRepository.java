package com.primeux.skillflowai.organization.data.repository;

import com.primeux.skillflowai.organization.data.entity.OrganizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganizationRepository extends JpaRepository<OrganizationEntity, Long> {
    List<OrganizationEntity> findAll();
}
