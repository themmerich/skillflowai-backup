package com.primeux.skillflowai.organisation.data.repository;

import com.primeux.skillflowai.organisation.data.entity.OrganisationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganisationRepository extends JpaRepository<OrganisationEntity, Long> {
    List<OrganisationEntity> findAll();
}
