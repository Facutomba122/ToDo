package com.Fp2023.ToDo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class Roles {

    @Id
    @GeneratedValue(generator = "uuid")
    private UUID id;
    private String name;

    public Roles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

}
