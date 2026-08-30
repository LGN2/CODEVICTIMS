package com.CodeVictims.App.controllers;

import com.CodeVictims.App.requestobjects.CustomerRequest;
import com.CodeVictims.App.responseobjects.CustomerResponse;
import com.CodeVictims.App.services.CustomerServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final CustomerServices customerServices;

    public CustomerController(CustomerServices customerServices){
        this.customerServices = customerServices;
    }
    @PostMapping
    public CustomerResponse createCustomer(@RequestBody CustomerRequest request) {
        return customerServices.createCustomer(request);
    }
}
