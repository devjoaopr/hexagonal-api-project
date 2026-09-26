package io.github.devjoaopr.hexagonal_api.adapter.dtos.Person;

import java.util.UUID;

public record PersonResponseDTO(
         UUID id,
         String name
) {}
