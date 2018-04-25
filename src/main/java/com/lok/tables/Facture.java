package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Facture {
    private int idFacture;
    private int idCommande;
    private Date dateFacture;
    private int prixTotal;

    @Id
    @Column(name = "idFacture", nullable = false)
    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    @Basic
    @Column(name = "IdCommande", nullable = false)
    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    @Basic
    @Column(name = "dateFacture", nullable = false)
    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    @Basic
    @Column(name = "prixTotal", nullable = false)
    public int getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(int prixTotal) {
        this.prixTotal = prixTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Facture facture = (Facture) o;

        if (idFacture != facture.idFacture) return false;
        if (idCommande != facture.idCommande) return false;
        if (prixTotal != facture.prixTotal) return false;
        if (dateFacture != null ? !dateFacture.equals(facture.dateFacture) : facture.dateFacture != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFacture;
        result = 31 * result + idCommande;
        result = 31 * result + (dateFacture != null ? dateFacture.hashCode() : 0);
        result = 31 * result + prixTotal;
        return result;
    }
}
