package io.github.devjoaopr.hexagonal_api.adapter.dtos.Resident;

import java.util.UUID;

public record ResidentResponseDTO(
         UUID id,
         String cpf,
         String address,
         String phone,
         UUID idPerson
) {
}
