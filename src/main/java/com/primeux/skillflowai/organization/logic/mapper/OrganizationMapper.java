package com.primeux.skillflowai.organization.logic.mapper;

import com.primeux.skillflowai.organization.data.entity.OrganizationEntity;
import com.primeux.skillflowai.organization.logic.model.Organization;
import com.primeux.skillflowai.user.data.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface OrganizationMapper {
    @Mapping(target = "createdBy", expression = "java(getUsername(entity.getCreatedBy()))")
    @Mapping(target = "createdDate", expression = "java(entity.getCreatedDate().orElse(null))")
    @Mapping(target = "lastModifiedBy", expression = "java(getUsername(entity.getLastModifiedBy()))")
    @Mapping(target = "lastModifiedDate", expression = "java(entity.getLastModifiedDate().orElse(null))")
    Organization toOrganization(OrganizationEntity entity);

    default String getUsername(Optional<UserEntity> userEntity) {
        return userEntity.map(UserEntity::getUsername).orElse(null);
    }
}
