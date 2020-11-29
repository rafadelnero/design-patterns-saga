package com.javachallengers.encapsulation.realworldchallenger.resources;

import com.javachallengers.encapsulation.realworldchallenger.dto.CustomerDTO;
import com.javachallengers.encapsulation.realworldchallenger.model.Customer;
import com.javachallengers.encapsulation.realworldchallenger.services.CustomerService;

public class CustomerResource {

    private CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerDTO findById(long customerId) {
        Customer customer = customerService.findById(customerId);
        return CustomerDTO.toCustomerDTO(customer);
    }
}
