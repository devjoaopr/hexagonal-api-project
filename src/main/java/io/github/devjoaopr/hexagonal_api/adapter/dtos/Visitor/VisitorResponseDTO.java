package io.github.devjoaopr.hexagonal_api.adapter.dtos.Visitor;

import java.util.UUID;

public record VisitorResponseDTO(
        UUID id,
        String rg,
        UUID idPerson
) {
}
