package com.javachallengers.encapsulation.realworldchallenger.dao;

import com.javachallengers.encapsulation.realworldchallenger.model.Customer;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class CustomerDao {


    public Customer findById(long customerId) {
        Date date = Date.from(LocalDate.of(1988, 9, 19)
                .atStartOfDay(ZoneId.systemDefault()).toInstant());

        return new Customer.Builder(customerId, "Challenger")
                .essential(date, "Calle del Paradiso")
                .email("challenger@javachallengers.com")
                .salary(9999999999999999999999.00)
                .login("challenger")
                .passwordToken("superSecret").build();
    }
}
