package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
    private int idStock;
    private int idVendeur;
    private String nomDuStock;

    @Id
    @Column(name = "idStock", nullable = false)
    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    @Basic
    @Column(name = "idVendeur", nullable = false)
    public int getIdVendeur() {
        return idVendeur;
    }

    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }

    @Basic
    @Column(name = "nom_du_stock", nullable = false, length = 20)
    public String getNomDuStock() {
        return nomDuStock;
    }

    public void setNomDuStock(String nomDuStock) {
        this.nomDuStock = nomDuStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stock stock = (Stock) o;

        if (idStock != stock.idStock) return false;
        if (idVendeur != stock.idVendeur) return false;
        if (nomDuStock != null ? !nomDuStock.equals(stock.nomDuStock) : stock.nomDuStock != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStock;
        result = 31 * result + idVendeur;
        result = 31 * result + (nomDuStock != null ? nomDuStock.hashCode() : 0);
        return result;
    }
}
