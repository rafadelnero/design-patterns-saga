package com.javachallengers.encapsulation.realworldchallenger.model;

import java.util.Date;

public class Customer {

    private long id;
    private String name;
    private Date birthDate;
    private String address;
    private String email;
    private double salary;
    private String login;
    private String passwordToken;

    public static class Builder {

        private long id;
        private String name;
        private Date birthDate;
        private String address;
        private String email;
        private double salary;
        private String login;
        private String passwordToken;

        public Builder(long id, String name) {
            this.id = id;
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

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder passwordToken(String passwordToken) {
            this.passwordToken = passwordToken;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public Customer() {
        super();
    }

    private Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.birthDate = builder.birthDate;
        this.address = builder.address;
        this.email = builder.email;
        this.salary = builder.salary;
        this.login = builder.login;
        this.passwordToken = builder.passwordToken;
    }

    public long getId() {
        return id;
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

    public double getSalary() {
        return salary;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswordToken() {
        return passwordToken;
    }

}
