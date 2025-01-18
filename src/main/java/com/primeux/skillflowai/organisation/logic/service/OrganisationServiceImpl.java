package com.primeux.skillflowai.organisation.logic.service;

import com.primeux.skillflowai.organisation.data.entity.OrganisationEntity;
import com.primeux.skillflowai.organisation.data.repository.OrganisationRepository;
import com.primeux.skillflowai.organisation.logic.mapper.OrganisationMapper;
import com.primeux.skillflowai.organisation.logic.model.Organisation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrganisationServiceImpl implements OrganisationService {

    private final OrganisationRepository organisationRepository;
    private final OrganisationMapper organisationMapper;

    /**
     * {@inheritDoc}
     */
    public List<Organisation> findAllOrganisations() {
        return organisationRepository.findAll().stream().map(organisationMapper::toOrganisation).collect(Collectors.toCollection(ArrayList::new));
    }
}
