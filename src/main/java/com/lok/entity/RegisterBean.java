package com.lok.entity;

public class RegisterBean {

    private String fullName;
    private String email;
    private String userName;
    private String password;

    public RegisterBean(String fullname, String email, String username, String password) {
    }

    public RegisterBean() {

    }

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
