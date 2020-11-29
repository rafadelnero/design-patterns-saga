package com.javachallengers.encapsulation.realworldchallenger.invoker;

import com.javachallengers.encapsulation.realworldchallenger.dao.CustomerDao;
import com.javachallengers.encapsulation.realworldchallenger.dto.CustomerDTO;
import com.javachallengers.encapsulation.realworldchallenger.resources.CustomerResource;
import com.javachallengers.encapsulation.realworldchallenger.services.CustomerService;

public class CustomerLogicInvoker {

    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        CustomerService customerService = new CustomerService(customerDao);
        CustomerResource customerResource = new CustomerResource(customerService);

        CustomerDTO emptyCustomerDTO = customerResource.findById(-1);
        if (emptyCustomerDTO.getName() == null) {
            System.out.println("Success! '" + emptyCustomerDTO.getName() + "'");
        }

        CustomerDTO filledCustomerDTO = customerResource.findById(1);
        if (filledCustomerDTO.getName().equals("Challenger")) {
            System.out.println("Success! " + filledCustomerDTO.getName());
        }
    }

}
