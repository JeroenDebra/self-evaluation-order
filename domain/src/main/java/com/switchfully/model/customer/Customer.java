package com.switchfully.model.customer;

import com.switchfully.util.EmailValidator;
import com.switchfully.util.PhoneValidator;

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
        this.email = validEmail(email);
        this.adress = adress;
        this.phonenumber = validPhonenumber(phonenumber);
    }

    private String validEmail(String email){
        if (email == null || !EmailValidator.isValidEmail(email)) throw new IllegalArgumentException("email is not valid");

        return email;
    }

    private String validPhonenumber(String phonenumber){
        if (phonenumber == null || !PhoneValidator.isValidPhoneNumber(phonenumber)) throw new IllegalArgumentException("phonenumber is not valid");

        return phonenumber;
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
