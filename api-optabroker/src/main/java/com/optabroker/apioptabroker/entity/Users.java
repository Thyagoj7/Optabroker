package com.optabroker.apioptabroker.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity(name = "users")
@Table(name = "users")
public class Users implements UserDetails {

    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUser;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private UserRole role;

    public Users (){

    }

    public Users(long idUser, String name, String phone, String email, String login,String password,UserRole role){
        this.idUser = idUser;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.role = role;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.role == UserRole.ADMIN) return List.of(new SimpleGrantedAuthority("HOLE_ADMIN"), new SimpleGrantedAuthority("HOLE_USER"));
        else return List.of(new SimpleGrantedAuthority("HOLE_USER"));
        /*** este metodo deve retornar uma lista de roles o security ja tem uma lista de roles com suas herarquias mas aqui vamos usar uma lista com os valores enuns
         * O simpleGrante é uma metodo do security para roles hierarquias e tals
         */
    }


    @Override
    public String getUsername() {
        return name;
    }

    @Override  //Para ver se a conta nao esta expirada
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override   //Para ver se a conta não esta bloqueada
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override  //Para ver se as credenciais não estão expiradas
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override //Para ver se o usuario esta ativo
    public boolean isEnabled() {
        return true;
    }


}
