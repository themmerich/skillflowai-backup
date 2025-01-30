package com.primeux.skillflowai.organization.logic.model;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record Organization(Long id, String createdBy, LocalDateTime createdDate, String lastModifiedBy, LocalDateTime lastModifiedDate,
                           @NotBlank String name, String description) {
}
