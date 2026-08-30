package com.CodeVictims.App.utils;

public class HelperUtils {
    public static String getFullName(String customerFirstName, String customerLastName){
        if (customerFirstName == null && customerLastName == null){
            return "";
        }
        if (customerFirstName == null){
            return customerLastName.trim();
        }
        if (customerLastName == null){
            return customerFirstName.trim();
        }
        return customerFirstName.trim() +" "+ customerLastName.trim();
    }
}
