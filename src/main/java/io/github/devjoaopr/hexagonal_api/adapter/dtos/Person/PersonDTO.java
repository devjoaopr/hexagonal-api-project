package io.github.devjoaopr.hexagonal_api.adapter.dtos.Person;

import java.util.UUID;

public record PersonDTO(
         UUID id,
         String name
) {}
