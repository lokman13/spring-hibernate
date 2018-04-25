package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lignedestock {
    private int idLigneDeStock;
    private int idProduit;
    private int idStock;
    private int quantité;

    @Id
    @Column(name = "id_ligne_de_stock", nullable = false)
    public int getIdLigneDeStock() {
        return idLigneDeStock;
    }

    public void setIdLigneDeStock(int idLigneDeStock) {
        this.idLigneDeStock = idLigneDeStock;
    }

    @Basic
    @Column(name = "idProduit", nullable = false)
    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    @Basic
    @Column(name = "idStock", nullable = false)
    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    @Basic
    @Column(name = "quantité", nullable = false)
    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lignedestock that = (Lignedestock) o;

        if (idLigneDeStock != that.idLigneDeStock) return false;
        if (idProduit != that.idProduit) return false;
        if (idStock != that.idStock) return false;
        if (quantité != that.quantité) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLigneDeStock;
        result = 31 * result + idProduit;
        result = 31 * result + idStock;
        result = 31 * result + quantité;
        return result;
    }
}
