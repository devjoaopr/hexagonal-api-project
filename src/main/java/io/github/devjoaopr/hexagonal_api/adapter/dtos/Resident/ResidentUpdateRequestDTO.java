package io.github.devjoaopr.hexagonal_api.adapter.dtos.Resident;

import java.util.UUID;

public record ResidentUpdateRequestDTO(
         String cpf,
         String address,
         String phone,
         UUID idPerson
) {
}
