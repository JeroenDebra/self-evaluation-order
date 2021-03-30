package com.switchfully.model.customer;

public class Adress {

    private final String streetname;
    private final String streetnumber;
    private final String city;
    private final String postcode;

    public Adress(String streetname, String streetNumber, String city, String postcode) {
        this.streetname = streetname;
        this.streetnumber = streetNumber;
        this.city = city;
        this.postcode = postcode;
    }

    public String getStreetname() {
        return streetname;
    }

    public String getStreetNumber() {
        return streetnumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}
