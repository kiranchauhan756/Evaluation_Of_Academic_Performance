package com.example.model;


public class JwtModel {
    private String username;
    private String password;

    public String getUsername() {
        return this.username;
    }

    @Override
    public String toString() {
        return "JwtModel  {" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public JwtModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
