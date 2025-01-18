package com.primeux.skillflowai.organisation.web;

import com.primeux.skillflowai.organisation.logic.model.Organisation;
import com.primeux.skillflowai.organisation.logic.service.OrganisationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/organisations")
public class OrganisationController {
    private final OrganisationService organisationService;

    public OrganisationController(OrganisationService organisationService) {
        this.organisationService = organisationService;
    }

    /**
     * Retrieves a list of all organisations.
     *
     * @return a list of Organisation objects representing all available organisations
     */
    @GetMapping
    public List<Organisation> findAllOrganisations() {
        return organisationService.findAllOrganisations();
    }
}
