package com.javachallengers.encapsulation.realworldchallenger.dto;

import com.javachallengers.encapsulation.realworldchallenger.model.Customer;

import java.util.Date;

public class CustomerDTO {

    private String name;
    private Date birthDate;
    private String address;
    private String email;

    public static class Builder {

        private String name;
        private Date birthDate;
        private String address;
        private String email;

        public Builder(String name) {
            this.name = name;
        }

        public Builder essential(Date birthDate, String address) {
            this.birthDate = birthDate;
            this.address = address;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public CustomerDTO build() {
            return new CustomerDTO(this);
        }
    }

    private CustomerDTO(Builder builder) {
        this.name = builder.name;
        this.birthDate = builder.birthDate;
        this.address = builder.address;
        this.email = builder.email;
    }

    public static CustomerDTO toCustomerDTO(Customer customer) {
        return new Builder(customer.getName())
                .essential(customer.getBirthDate(), customer.getAddress())
                .email(customer.getEmail()).build();
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
