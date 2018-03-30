package com.lok.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "users")
@SuppressWarnings("serial")
public class Users implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id", length = 11 )
    private Long id;

    @Column(name = "user_name")
    String userName;

    @Column(name = "user_password")
    String userPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
