package io.github.devjoaopr.hexagonal_api.core.domain;

import java.util.UUID;

public class Visitor {
    private UUID id;
    private String rg;
    private UUID idPerson;

    public Visitor() {
    }

    public Visitor(UUID id, String rg, UUID idPerson) {
        this.id = id;
        this.rg = rg;
        this.idPerson = idPerson;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public UUID getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(UUID idPerson) {
        this.idPerson = idPerson;
    }
}
