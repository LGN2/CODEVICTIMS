package com.CodeVictims.App.utils;

public class HelperUtils {
    public static String getFullName(String firstName, String lastName){
        if (firstName == null && lastName == null){
            return "";
        }
        if (firstName == null){
            return lastName.trim();
        }
        if (lastName == null){
            return firstName.trim();
        }
        return firstName.trim() +" "+ lastName.trim();
    }
}
