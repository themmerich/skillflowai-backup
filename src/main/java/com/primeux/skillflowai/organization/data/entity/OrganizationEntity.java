package com.primeux.skillflowai.organization.data.entity;

import com.primeux.skillflowai.user.data.entity.UserEntity;
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
@Table(name = "organization")
public class OrganizationEntity extends AbstractAuditable<UserEntity, Long> {

    @NotBlank
    private String name;

    @Size(max = 255)
    private String description;
}
