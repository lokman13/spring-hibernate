package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categorie {
    private int idCategorie;
    private String nomCategorie;
    private String descCategorie;

    @Id
    @Column(name = "idCategorie", nullable = false)
    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Basic
    @Column(name = "nomCategorie", nullable = false, length = 20)
    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    @Basic
    @Column(name = "descCategorie", nullable = false, length = 20)
    public String getDescCategorie() {
        return descCategorie;
    }

    public void setDescCategorie(String descCategorie) {
        this.descCategorie = descCategorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categorie categorie = (Categorie) o;

        if (idCategorie != categorie.idCategorie) return false;
        if (nomCategorie != null ? !nomCategorie.equals(categorie.nomCategorie) : categorie.nomCategorie != null)
            return false;
        if (descCategorie != null ? !descCategorie.equals(categorie.descCategorie) : categorie.descCategorie != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategorie;
        result = 31 * result + (nomCategorie != null ? nomCategorie.hashCode() : 0);
        result = 31 * result + (descCategorie != null ? descCategorie.hashCode() : 0);
        return result;
    }
}
