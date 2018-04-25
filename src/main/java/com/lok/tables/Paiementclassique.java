package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Paiementclassique {
    private int idPaiementClassique;
    private String adressLivraison;
    private Date dateLivraison;
    private int idPaiement;
    private Date datePaiement;

    @Id
    @Column(name = "id_paiement_classique", nullable = false)
    public int getIdPaiementClassique() {
        return idPaiementClassique;
    }

    public void setIdPaiementClassique(int idPaiementClassique) {
        this.idPaiementClassique = idPaiementClassique;
    }

    @Basic
    @Column(name = "adressLivraison", nullable = false, length = 20)
    public String getAdressLivraison() {
        return adressLivraison;
    }

    public void setAdressLivraison(String adressLivraison) {
        this.adressLivraison = adressLivraison;
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
    @Column(name = "idPaiement", nullable = false)
    public int getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(int idPaiement) {
        this.idPaiement = idPaiement;
    }

    @Basic
    @Column(name = "datePaiement", nullable = false)
    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paiementclassique that = (Paiementclassique) o;

        if (idPaiementClassique != that.idPaiementClassique) return false;
        if (idPaiement != that.idPaiement) return false;
        if (adressLivraison != null ? !adressLivraison.equals(that.adressLivraison) : that.adressLivraison != null)
            return false;
        if (dateLivraison != null ? !dateLivraison.equals(that.dateLivraison) : that.dateLivraison != null)
            return false;
        if (datePaiement != null ? !datePaiement.equals(that.datePaiement) : that.datePaiement != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPaiementClassique;
        result = 31 * result + (adressLivraison != null ? adressLivraison.hashCode() : 0);
        result = 31 * result + (dateLivraison != null ? dateLivraison.hashCode() : 0);
        result = 31 * result + idPaiement;
        result = 31 * result + (datePaiement != null ? datePaiement.hashCode() : 0);
        return result;
    }
}
