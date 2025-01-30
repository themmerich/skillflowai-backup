package com.primeux.skillflowai.organization.logic.service;

import com.primeux.skillflowai.organization.data.repository.OrganizationRepository;
import com.primeux.skillflowai.organization.logic.mapper.OrganizationMapper;
import com.primeux.skillflowai.organization.logic.model.Organization;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;
    private final OrganizationMapper organizationMapper;

    /**
     * Retrieves all organizations from the repository, maps them to the Organization model,
     * and returns a list of these organizations.
     *
     * @return a list of Organization objects representing all organizations available in the repository
     */
    public List<Organization> findAllOrganizations() {
        return organizationRepository.findAll().stream().map(organizationMapper::toOrganization).collect(Collectors.toCollection(ArrayList::new));
    }
}
