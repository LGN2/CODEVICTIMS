package com.CodeVictims.App.responseobjects;

import com.CodeVictims.App.entities.Customer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {
    String customerId;
    String fullName;
    String phoneNumber;
    String email;

    public static CustomerResponse convert(Customer customer){
        CustomerResponse response = new CustomerResponse();

        response.setCustomerId(customer.getId().toString());
        response.setFullName(customer.getName());
        response.setPhoneNumber(customer.getPhoneNumber());
        response.setEmail(customer.getEmail());

        return response;
    }
}
