package com.CodeVictims.App.services;

import com.CodeVictims.App.entities.Customer;
import com.CodeVictims.App.requestobjects.CustomerRequest;
import com.CodeVictims.App.responseobjects.CustomerResponse;
import com.CodeVictims.App.utils.HelperUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServices {

    private static final List<Customer> customerList = new ArrayList<>();

    public CustomerResponse createCustomer(CustomerRequest request) {

    }
    public List<CustomerResponse> getAllCustomers() {

    }

    public CustomerResponse getCustomerById(UUID id) {

    }

    public CustomerResponse updateCustomer(UUID id, CustomerRequest request) {

    }

    public boolean deleteCustomer(UUID id) {

    }
}
