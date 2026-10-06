package io.github.devjoaopr.hexagonal_api.infra;

import io.github.devjoaopr.hexagonal_api.core.Port.UserServicePort;
import io.github.devjoaopr.hexagonal_api.core.usecase.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public UserServicePort userServicePortImpl() {
        return new UserService();
    }
}
