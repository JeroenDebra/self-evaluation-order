package com.switchfully.model.customer;


public class Adress {

    private final String streetname;
    private final String streetnumber;
    private final String city;
    private final String postcode;

    public Adress(String streetname, String streetnumber, String city, String postcode) {
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.city = city;
        this.postcode = postcode;
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

    @Override
    public String toString() {
        return "Adress{" + "streetname='" + streetname + '\'' + ", streetnumber='" + streetnumber + '\'' + ", city='" + city + '\'' + ", postcode='" + postcode + '\'' + '}';
    }
}
