package io.github.devjoaopr.hexagonal_api.adapter.controller;


import io.github.devjoaopr.hexagonal_api.adapter.dtos.User.UserRequestDTO;
import io.github.devjoaopr.hexagonal_api.adapter.dtos.User.UserResponseDTO;
import io.github.devjoaopr.hexagonal_api.adapter.mappers.UserMapper;
import io.github.devjoaopr.hexagonal_api.core.domain.Port.UserServicePort;
import io.github.devjoaopr.hexagonal_api.core.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServicePort userServicePort;
    private final UserMapper userMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO createUser(@RequestBody UserRequestDTO requestDTO) {
        User newUser = userServicePort.createUser(userMapper.toDomain(requestDTO));
        return userMapper.toResponse(newUser);
    }
}
