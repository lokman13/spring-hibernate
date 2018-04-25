package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendeur {
    private int idVendeur;
    private int idVent;
    private String nomVendeur;
    private int idUser;
    private String username;
    private String password;

    @Id
    @Column(name = "idVendeur", nullable = false)
    public int getIdVendeur() {
        return idVendeur;
    }

    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }

    @Basic
    @Column(name = "id_vent", nullable = false)
    public int getIdVent() {
        return idVent;
    }

    public void setIdVent(int idVent) {
        this.idVent = idVent;
    }

    @Basic
    @Column(name = "nomVendeur", nullable = false, length = 20)
    public String getNomVendeur() {
        return nomVendeur;
    }

    public void setNomVendeur(String nomVendeur) {
        this.nomVendeur = nomVendeur;
    }

    @Basic
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vendeur vendeur = (Vendeur) o;

        if (idVendeur != vendeur.idVendeur) return false;
        if (idVent != vendeur.idVent) return false;
        if (idUser != vendeur.idUser) return false;
        if (nomVendeur != null ? !nomVendeur.equals(vendeur.nomVendeur) : vendeur.nomVendeur != null) return false;
        if (username != null ? !username.equals(vendeur.username) : vendeur.username != null) return false;
        if (password != null ? !password.equals(vendeur.password) : vendeur.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVendeur;
        result = 31 * result + idVent;
        result = 31 * result + (nomVendeur != null ? nomVendeur.hashCode() : 0);
        result = 31 * result + idUser;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
