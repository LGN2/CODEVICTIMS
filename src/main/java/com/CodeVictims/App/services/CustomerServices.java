package com.CodeVictims.App.services;

import com.CodeVictims.App.entities.Customer;
import com.CodeVictims.App.requestobjects.CustomerRequest;
import com.CodeVictims.App.responseobjects.CustomerResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServices {

    private static final List<Customer> customerList = new ArrayList<>();

    public CustomerResponse createCustomer(CustomerRequest request) {

        if (!verifyCustomerNameAndEmail(request.getCustomerFirstName()))
    }
}
