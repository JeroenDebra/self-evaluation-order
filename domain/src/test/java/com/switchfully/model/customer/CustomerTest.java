package com.switchfully.model.customer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void customerConstructor_ValidContructor_createsObjectWithParameters() {

        Customer customer = new Customer("john", "smith", "johnsmith@email.be", new Adress("street", "1", "city", "3000"), "0472531501");

        assertThat(customer.getEmail()).isEqualTo("johnsmith@email.be");
    }

    @Test
    void customerConstructor_WithInvalidEmail_ThrowsIllegalArgumentException() {

        assertThrows(IllegalArgumentException.class, () -> new Customer("john", "smith", "johnsmith@emailbe", new Adress("street", "1", "city", "3000"), "0412345678"));
    }

    @Test
    void customerConstructor_WithInvalidPhone_ThrowsIllegalArgumentException() {

        assertThrows(IllegalArgumentException.class, () -> new Customer("john", "smith", "johnsmith@email.be", new Adress("street", "1", "city", "3000"), "072531501"));
    }
}