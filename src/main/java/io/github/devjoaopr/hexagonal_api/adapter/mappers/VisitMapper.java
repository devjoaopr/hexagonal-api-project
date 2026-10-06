package io.github.devjoaopr.hexagonal_api.adapter.mappers;

import io.github.devjoaopr.hexagonal_api.adapter.dtos.Visit.VisitRequestDTO;
import io.github.devjoaopr.hexagonal_api.adapter.dtos.Visit.VisitResponseDTO;
import io.github.devjoaopr.hexagonal_api.adapter.dtos.Visit.VisitUpdateRequestDTO;
import io.github.devjoaopr.hexagonal_api.core.domain.Visit;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface VisitMapper {
    Visit toDomain(VisitRequestDTO visitRequestDTO);
    void updateDomain(VisitUpdateRequestDTO visitUpdateRequestDTO, @MappingTarget Visit visit);
    VisitResponseDTO toResponseDTO(Visit visit);
}
