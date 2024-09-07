package com.prakhar.splitwise.models;

public class User {
    String name;
    String emailId; // phone num or email 1 should be present, should be unique across
    String phoneNumber; //  1 should be present, should be unique across

    public User(){}

    public User(String name, String emailId, String phoneNumber){
        this.emailId = emailId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
