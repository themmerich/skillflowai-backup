package com.primeux.skillflowai.organisation.logic.model;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record Organisation(Long id, String createdBy, LocalDateTime createdDate, String lastModifiedBy, LocalDateTime lastModifiedDate,
                           @NotBlank String name, String description) {
}
