package com.switchfully.dto;

public class CreateCustomerDTO {

    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String streetname;
    private String streetnumber;
    private String city;
    private String postcode;

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

    public CreateCustomerDTO setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public CreateCustomerDTO setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public CreateCustomerDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public CreateCustomerDTO setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public CreateCustomerDTO setStreetname(String streetname) {
        this.streetname = streetname;
        return this;
    }

    public CreateCustomerDTO setStreetnumber(String streetnumber) {
        this.streetnumber = streetnumber;
        return this;
    }

    public CreateCustomerDTO setCity(String city) {
        this.city = city;
        return this;
    }

    public CreateCustomerDTO setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }
}
