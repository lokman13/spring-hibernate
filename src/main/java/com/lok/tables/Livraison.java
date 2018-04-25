package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Livraison {
    private int idLivraison;
    private Date dateLivraison;
    private int fraisLivraison;

    @Id
    @Column(name = "idLivraison", nullable = false)
    public int getIdLivraison() {
        return idLivraison;
    }

    public void setIdLivraison(int idLivraison) {
        this.idLivraison = idLivraison;
    }

    @Basic
    @Column(name = "dateLivraison", nullable = false)
    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "fraisLivraison", nullable = false)
    public int getFraisLivraison() {
        return fraisLivraison;
    }

    public void setFraisLivraison(int fraisLivraison) {
        this.fraisLivraison = fraisLivraison;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livraison livraison = (Livraison) o;

        if (idLivraison != livraison.idLivraison) return false;
        if (fraisLivraison != livraison.fraisLivraison) return false;
        if (dateLivraison != null ? !dateLivraison.equals(livraison.dateLivraison) : livraison.dateLivraison != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLivraison;
        result = 31 * result + (dateLivraison != null ? dateLivraison.hashCode() : 0);
        result = 31 * result + fraisLivraison;
        return result;
    }
}
