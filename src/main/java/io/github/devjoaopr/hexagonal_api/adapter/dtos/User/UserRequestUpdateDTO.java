package io.github.devjoaopr.hexagonal_api.adapter.dtos.User;

public record UserRequestUpdateDTO(
        String name,
        String email,
        String password,
        Boolean admin
) {
}
