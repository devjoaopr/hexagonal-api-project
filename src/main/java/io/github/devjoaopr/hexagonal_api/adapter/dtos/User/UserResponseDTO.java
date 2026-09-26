package io.github.devjoaopr.hexagonal_api.adapter.dtos.User;

import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String name,
        String email,
        String password,
        Boolean admin
) {
}
