package io.github.devjoaopr.hexagonal_api.adapter.mappers;

import io.github.devjoaopr.hexagonal_api.adapter.dtos.Visitor.VisitorRequestDTO;
import io.github.devjoaopr.hexagonal_api.adapter.dtos.Visitor.VisitorResponseDTO;
import io.github.devjoaopr.hexagonal_api.adapter.dtos.Visitor.VisitorUpdateRequestDTO;
import io.github.devjoaopr.hexagonal_api.core.domain.Visitor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface VisitorMapper {
    Visitor toDomain(VisitorRequestDTO visitorRequestDTO);

    void updateDomain(VisitorUpdateRequestDTO visitorUpdateRequestDTO, @MappingTarget Visitor visitor);

    VisitorResponseDTO toResponseDTO(Visitor visitor);
}
