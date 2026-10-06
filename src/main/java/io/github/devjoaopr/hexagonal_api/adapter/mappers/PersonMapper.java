package io.github.devjoaopr.hexagonal_api.adapter.mappers;

import io.github.devjoaopr.hexagonal_api.adapter.dtos.Person.PersonRequestDTO;
import io.github.devjoaopr.hexagonal_api.adapter.dtos.Person.PersonUpdateRequestDTO;
import io.github.devjoaopr.hexagonal_api.core.domain.Person;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    Person toDomain(PersonRequestDTO personRequestDTO);

    void updateDomain(PersonUpdateRequestDTO personUpdateRequestDTO, @MappingTarget Person person);

    PersonRequestDTO toResponse(Person person);

}
