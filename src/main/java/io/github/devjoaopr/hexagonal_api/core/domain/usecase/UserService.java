package io.github.devjoaopr.hexagonal_api.core.domain.usecase;

import io.github.devjoaopr.hexagonal_api.core.domain.Port.UserServicePort;
import io.github.devjoaopr.hexagonal_api.core.domain.User;

public class UserService implements UserServicePort {

    @Override
    public User createUser(User user) {
        return null;
    }


}
