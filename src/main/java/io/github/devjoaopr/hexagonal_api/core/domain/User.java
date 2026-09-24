package io.github.devjoaopr.hexagonal_api.core.domain;

import java.util.UUID;

public class User {
   private UUID id;
   private String email;
   private String password;
   private Boolean admin;
   private UUID idPerson;

    public User() {
    }

    public User(UUID id, String email, String password, Boolean admin) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.admin = admin;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
