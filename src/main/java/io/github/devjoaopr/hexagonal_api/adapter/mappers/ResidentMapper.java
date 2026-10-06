package io.github.devjoaopr.hexagonal_api.adapter.mappers;

import io.github.devjoaopr.hexagonal_api.adapter.dtos.Resident.ResidentRequestDTO;
import io.github.devjoaopr.hexagonal_api.adapter.dtos.Resident.ResidentUpdateRequestDTO;
import io.github.devjoaopr.hexagonal_api.core.domain.Resident;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ResidentMapper {
    Resident toDomain(ResidentRequestDTO residentRequestDTO);

    void updateDomain(ResidentUpdateRequestDTO residentUpdateRequestDTO, @MappingTarget Resident resident);

    ResidentRequestDTO toResponse(Resident resident);

}
