package com.switchfully.model.customer;

import java.util.Objects;
import java.util.UUID;

public class Customer {

    private final UUID id;
    private final String firstname;
    private final String lasname;
    private final String email;
    private final Adress adress;
    private final String phonenumber;

    public Customer(String firstname, String lasname, String email, Adress adress, String phonenumber) {
        this.id = UUID.randomUUID();
        this.firstname = firstname;
        this.lasname = lasname;
        this.email = email;
        this.adress = adress;
        this.phonenumber = phonenumber;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLasname() {
        return lasname;
    }

    public String getEmail() {
        return email;
    }

    public Adress getAdress() {
        return adress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
