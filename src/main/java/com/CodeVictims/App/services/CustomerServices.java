package com.CodeVictims.App.services;

import com.CodeVictims.App.entities.Customer;
import com.CodeVictims.App.requestobjects.CustomerRequest;
import com.CodeVictims.App.responseobjects.CustomerResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServices {

    private static final List<Customer> customerList = new ArrayList<>();

    public CustomerResponse createCustomer(CustomerRequest request) {
        if (request == null) {
            return null;
        }

        Customer customer = new Customer();
        customer.setId(UUID.randomUUID());
        customer.setFirstName(
                request.getCustomerFirstName()
        );
        customer.setLastName(
                request.getCustomerLastName()
        );
        customer.setPhoneNumber(
                request.getCustomerPhoneNumber()
        );
        customer.setEmail(
                request.getCustomerEmail()
        );
        customerList.add(customer);
        return CustomerResponse.convert(customer);
    }

    public List<CustomerResponse> getAllCustomers() {
        return CustomerResponse.convert(customerList);
    }

    public CustomerResponse getCustomerById(UUID id) {

    }

    public CustomerResponse updateCustomer(UUID id, CustomerRequest request) {

    }

    public boolean deleteCustomer(UUID id) {

    }
}
