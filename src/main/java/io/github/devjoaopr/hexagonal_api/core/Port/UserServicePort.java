package io.github.devjoaopr.hexagonal_api.core.Port;

import io.github.devjoaopr.hexagonal_api.core.domain.User;

public interface UserServicePort {
    User createUser(User user);
}
