package com.example.mapstructlearn.mapper;

import com.example.mapstructlearn.dto.UserCreateDto;
import com.example.mapstructlearn.dto.UserDto;
import com.example.mapstructlearn.entity.User;
import com.example.mapstructlearn.util.UserMapperUtil;
import lombok.Builder;
import org.mapstruct.*;

import java.util.List;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.FIELD, uses = UserMapperUtil.class
)
public interface UserMapper {

    UserDto toDto(User user);

    List<UserDto> toDtoList(List<User> users);

    User toEntity(UserDto userDto);

    List<User> toEntityList(List<UserDto> userDtoList);

    @Mapping(target = "password", qualifiedByName = "getPasswordFromUsername", source = "password")
    User userCreateToEntity(UserCreateDto createDto);


}
