package com.switchfully.model.employee;

import java.util.UUID;

public class Admin {

    private final UUID id;
    private final String email;

    public Admin(UUID id, String email) {
        this.id = id;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
