package com.javachallengers.encapsulation.realworldchallenger.services;

import com.javachallengers.encapsulation.realworldchallenger.dao.CustomerDao;
import com.javachallengers.encapsulation.realworldchallenger.model.Customer;

public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Customer findById(long customerId) {
        return isCustomerIdValid(customerId) ? customerDao.findById(customerId) : new Customer();
    }

    private boolean isCustomerIdValid(long customerId) {
       return customerId > 0;
    }
}
