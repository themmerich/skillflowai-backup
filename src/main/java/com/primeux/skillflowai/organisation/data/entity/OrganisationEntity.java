package com.primeux.skillflowai.organisation.data.entity;

import com.primeux.skillflowai.user.data.UserEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "organisation")
public class OrganisationEntity extends AbstractAuditable<UserEntity, Long> {

    @NotBlank
    private String name;

    @Size(max = 255)
    private String description;
}
