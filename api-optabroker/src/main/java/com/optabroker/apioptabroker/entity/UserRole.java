package com.optabroker.apioptabroker.entity;

public enum UserRole {

    ADMIN("admin"),

    USER("user");

    private String role;

    UserRole(String role){   //Contrutor
        this.role=role;
    }

    public String getRole(){
        return role;
    }
}
