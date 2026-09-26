package io.github.devjoaopr.hexagonal_api.adapter.dtos.Visit;

import java.time.LocalDateTime;
import java.util.UUID;

public record VisitUpdateRequestDTO(
        UUID id,
        LocalDateTime dateTime,
        UUID idResident,
        UUID idVisitor
) {
}
