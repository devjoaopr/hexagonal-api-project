package io.github.devjoaopr.hexagonal_api.adapter.mappers;

import io.github.devjoaopr.hexagonal_api.adapter.dtos.User.UserRequestDTO;
import io.github.devjoaopr.hexagonal_api.adapter.dtos.User.UserRequestUpdateDTO;
import io.github.devjoaopr.hexagonal_api.adapter.dtos.User.UserResponseDTO;
import io.github.devjoaopr.hexagonal_api.core.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toDomain(UserRequestDTO userRequestDTO);

    void updateDomain(UserRequestUpdateDTO userRequestUpdateDTO, @MappingTarget User user);

    UserResponseDTO toResponse(User user);

}
