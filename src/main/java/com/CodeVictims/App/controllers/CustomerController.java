package com.CodeVictims.App.controllers;

import com.CodeVictims.App.requestobjects.CustomerRequest;
import com.CodeVictims.App.responseobjects.CustomerResponse;
import com.CodeVictims.App.services.CustomerServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    @GetMapping
    public List<CustomerResponse> getAllCustomers() {
        return customerServices.getAllCustomers();
    }
    @GetMapping("/{id}")
    public CustomerResponse getCustomerById(@PathVariable UUID id) {
        return customerServices.getCustomerById(id);
    }
    @PutMapping("/{id}")
    public CustomerResponse updateCustomer(
            @PathVariable UUID id,
            @RequestBody CustomerRequest request) {

        return customerServices.updateCustomer(id, request);
    }
}
