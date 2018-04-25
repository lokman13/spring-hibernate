package com.lok.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class LoginBean {
    @NotEmpty
    @Size(min = 1, max = 50)
    private String userName;
    @NotEmpty
    @Size(min = 1, max = 20)
    private String password;
    public LoginBean(String username, String password) {
    }

    public LoginBean() {

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


