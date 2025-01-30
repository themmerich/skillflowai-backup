package com.primeux.skillflowai.user.logic.mapper;

import com.primeux.skillflowai.user.data.entity.UserEntity;
import com.primeux.skillflowai.user.logic.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserEntity entity);
}
