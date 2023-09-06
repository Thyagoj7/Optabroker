package com.optabroker.apioptabroker.dto;

public class LoginReponseDTO {

    private String token;

    public LoginReponseDTO() {
    }

    public LoginReponseDTO(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
