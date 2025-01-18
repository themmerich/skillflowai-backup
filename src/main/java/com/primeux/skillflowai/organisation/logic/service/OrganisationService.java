package com.primeux.skillflowai.organisation.logic.service;

import com.primeux.skillflowai.organisation.logic.model.Organisation;

import java.util.List;

public interface OrganisationService {

    /**
     * Retrieves a list of all organisations.
     *
     * @return a list of Organisation objects representing all available organisations
     */
    List<Organisation> findAllOrganisations();
}
