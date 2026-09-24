package io.github.devjoaopr.hexagonal_api.core.domain;

import java.util.UUID;

public class Resident {
    private UUID id;
    private String cpf;
    private String address;
    private String phone;
    private UUID idPerson;

    public Resident() {
    }

    public Resident(UUID id, String cpf, String address, String phone, UUID idPerson) {
        this.id = id;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
        this.idPerson = idPerson;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UUID getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(UUID idPerson) {
        this.idPerson = idPerson;
    }
}
