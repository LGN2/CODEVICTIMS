package com.CodeVictims.App.responseobjects;

import com.CodeVictims.App.entities.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CustomerResponse {
    private String customerId;
    private String fullName;
    private String phoneNumber;
    private String email;

    public static CustomerResponse convert(Customer customer){
        CustomerResponse response = new CustomerResponse();

        response.setCustomerId(customer.getId().toString());
        response.setFullName(customer.getFirstName()+" "+customer.getLastName());
        response.setPhoneNumber(customer.getPhoneNumber());
        response.setEmail(customer.getEmail());

        return response;
    }

    public static List<CustomerResponse>
    convert(List<Customer> customerList){
        List<CustomerResponse> responseList = new ArrayList<>();
        for (Customer c : customerList){
            responseList.add(convert(c));
        }
        return responseList;
    }
}
