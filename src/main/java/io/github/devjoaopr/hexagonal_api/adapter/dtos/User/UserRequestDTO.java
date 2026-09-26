package io.github.devjoaopr.hexagonal_api.adapter.dtos.User;

import java.util.UUID;

public record UserRequestDTO(
        String name,
        String email,
        String password,
        Boolean admin
) {
}
