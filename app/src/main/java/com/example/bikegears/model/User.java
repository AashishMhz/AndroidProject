package com.example.bikegears.model;

public class User {
    private String register_firstname, register_lastname, register_username, register_password;

    public User() {
    }

    public User(String register_firstname, String register_lastname, String register_username, String register_password) {
        this.register_firstname = register_firstname;
        this.register_lastname = register_lastname;
        this.register_username = register_username;
        this.register_password = register_password;
    }

    public String getRegister_firstname() {
        return register_firstname;
    }

    public void setRegister_firstname(String register_firstname) {
        this.register_firstname = register_firstname;
    }

    public String getRegister_lastname() {
        return register_lastname;
    }

    public void setRegister_lastname(String register_lastname) {
        this.register_lastname = register_lastname;
    }

    public String getRegister_username() {
        return register_username;
    }

    public void setRegister_username(String register_username) {
        this.register_username = register_username;
    }

    public String getRegister_password() {
        return register_password;
    }

    public void setRegister_password(String register_password) {
        this.register_password = register_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "register_firstname='" + register_firstname + '\'' +
                ", register_lastname='" + register_lastname + '\'' +
                ", register_username='" + register_username + '\'' +
                ", register_password='" + register_password + '\'' +
                '}';
    }
}
