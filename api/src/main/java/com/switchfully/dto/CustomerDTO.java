package com.switchfully.dto;

public class CustomerDTO {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String streetname;
    private String streetnumber;
    private String city;
    private String postcode;

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getStreetname() {
        return streetname;
    }

    public String getStreetnumber() {
        return streetnumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public CustomerDTO setId(String id) {
        this.id = id;
        return this;
    }

    public CustomerDTO setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public CustomerDTO setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public CustomerDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerDTO setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public CustomerDTO setStreetname(String streetname) {
        this.streetname = streetname;
        return this;
    }

    public CustomerDTO setStreetnumber(String streetnumber) {
        this.streetnumber = streetnumber;
        return this;
    }

    public CustomerDTO setCity(String city) {
        this.city = city;
        return this;
    }

    public CustomerDTO setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }
}
