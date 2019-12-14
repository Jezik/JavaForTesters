package com.tech.dmitry_baev.model;

public class ContactData {
    private final String name;
    private final String lastName;
    private final String phoneNumber;
    private final String email;

    public ContactData(String name, String lastName, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
