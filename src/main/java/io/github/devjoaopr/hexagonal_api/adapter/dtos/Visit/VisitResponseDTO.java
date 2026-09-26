package io.github.devjoaopr.hexagonal_api.adapter.dtos.Visit;

import java.time.LocalDateTime;
import java.util.UUID;

public record VisitResponseDTO(
        UUID id,
        LocalDateTime dateTime,
        UUID idResident,
        UUID idVisitor
) {
}
