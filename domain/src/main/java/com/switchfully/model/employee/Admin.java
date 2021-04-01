package com.switchfully.model.employee;

import com.switchfully.util.EmailValidator;

import java.util.Objects;
import java.util.UUID;

public class Admin {

    private final UUID id;
    private final String email;

    public Admin(String email) {
        id = UUID.randomUUID();
        this.email = validEmail(email);
    }

    public Admin(UUID id, String email) {
        this.id = id;
        this.email = email;
    }

    private String validEmail(String email){
        if (email == null || !EmailValidator.isValidEmail(email)) throw new IllegalArgumentException("email is not valid");

        return email;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(id, admin.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
