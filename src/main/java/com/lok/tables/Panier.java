package com.lok.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Panier {
    private int idPanier;

    @Id
    @Column(name = "id_panier", nullable = false)
    public int getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(int idPanier) {
        this.idPanier = idPanier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Panier panier = (Panier) o;

        if (idPanier != panier.idPanier) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idPanier;
    }
}
