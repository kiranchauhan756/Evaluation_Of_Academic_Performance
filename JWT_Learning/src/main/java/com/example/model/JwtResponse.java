package com.example.model;

public class JwtResponse {
    private String response;

    public JwtResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
