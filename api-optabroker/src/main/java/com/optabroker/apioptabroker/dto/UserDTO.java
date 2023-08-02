package com.optabroker.apioptabroker.dto;

import com.optabroker.apioptabroker.entity.Users;

public class UserDTO {

    private long idUser;
    private String name;
    private String phone;
    private String email;
    private String password;
    //private int id_address;

    public UserDTO(){

    }

    public UserDTO(long idUSer,String name, String phone, String email, String password){
        this.idUser  = idUser;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        //this.id_address = id_address;

    }

    public UserDTO(Users users){
        idUser = users.getIdUser();
       name = users.getName();
       phone = users.getPhone();
       email = users.getEmail();
       password = users.getPassword();
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
