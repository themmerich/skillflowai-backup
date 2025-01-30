package com.primeux.skillflowai.organization.web;

import com.primeux.skillflowai.organization.logic.model.Organization;
import com.primeux.skillflowai.organization.logic.service.OrganizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    /**
     * Retrieves a list of all organizations.
     *
     * @return a list of Organization objects representing all available organizations
     */
    @GetMapping
    public List<Organization> findAllOrganizations() {
        return organizationService.findAllOrganizations();
    }
}
