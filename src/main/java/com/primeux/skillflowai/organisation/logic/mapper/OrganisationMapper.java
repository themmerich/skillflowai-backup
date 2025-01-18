package com.primeux.skillflowai.organisation.logic.mapper;

import com.primeux.skillflowai.organisation.data.entity.OrganisationEntity;
import com.primeux.skillflowai.organisation.logic.model.Organisation;
import com.primeux.skillflowai.user.data.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface OrganisationMapper {
    @Mapping(target = "createdBy", expression = "java(getUsername(entity.getCreatedBy()))")
    @Mapping(target = "createdDate", expression = "java(entity.getCreatedDate().orElse(null))")
    @Mapping(target = "lastModifiedBy", expression = "java(getUsername(entity.getLastModifiedBy()))")
    @Mapping(target = "lastModifiedDate", expression = "java(entity.getLastModifiedDate().orElse(null))")
    Organisation toOrganisation(OrganisationEntity entity);

    default String getUsername(Optional<UserEntity> userEntity) {
        return userEntity.map(UserEntity::getUsername).orElse(null);
    }
}
