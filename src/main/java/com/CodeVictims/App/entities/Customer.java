package com.CodeVictims.App.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Customer {
    private UUID id;
    private String name;
    private String phoneNumber;
    private String email;
}
