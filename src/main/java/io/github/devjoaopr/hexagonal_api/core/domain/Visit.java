package io.github.devjoaopr.hexagonal_api.core.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Visit {
    private UUID id;
    private LocalDateTime dateTime  ;
    private UUID idResident;
    private UUID idVisitor;

    public Visit() {
    }

    public Visit(UUID id, LocalDateTime dateTime, UUID idResident, UUID idVisitor) {
        this.id = id;
        this.dateTime = dateTime;
        this.idResident = idResident;
        this.idVisitor = idVisitor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public UUID getIdResident() {
        return idResident;
    }

    public void setIdResident(UUID idResident) {
        this.idResident = idResident;
    }

    public UUID getIdVisitor() {
        return idVisitor;
    }

    public void setIdVisitor(UUID idVisitor) {
        this.idVisitor = idVisitor;
    }
}
