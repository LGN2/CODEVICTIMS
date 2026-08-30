package com.CodeVictims.App.controllers;

import com.CodeVictims.App.services.CustomerServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final CustomerServices customerServices;

    public CustomerController(CustomerServices customerServices){
        this.customerServices = customerServices;
    }
}
