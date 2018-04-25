package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Commande {
    private int idCommande;
    private int idLivraison;
    private int idProduit;
    private Date dateCommande;
    private Date datelivraison;

    @Id
    @Column(name = "idCommande", nullable = false)
    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    @Basic
    @Column(name = "idLivraison", nullable = false)
    public int getIdLivraison() {
        return idLivraison;
    }

    public void setIdLivraison(int idLivraison) {
        this.idLivraison = idLivraison;
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
    @Column(name = "dateCommande", nullable = false)
    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Basic
    @Column(name = "datelivraison", nullable = false)
    public Date getDatelivraison() {
        return datelivraison;
    }

    public void setDatelivraison(Date datelivraison) {
        this.datelivraison = datelivraison;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commande commande = (Commande) o;

        if (idCommande != commande.idCommande) return false;
        if (idLivraison != commande.idLivraison) return false;
        if (idProduit != commande.idProduit) return false;
        if (dateCommande != null ? !dateCommande.equals(commande.dateCommande) : commande.dateCommande != null)
            return false;
        if (datelivraison != null ? !datelivraison.equals(commande.datelivraison) : commande.datelivraison != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCommande;
        result = 31 * result + idLivraison;
        result = 31 * result + idProduit;
        result = 31 * result + (dateCommande != null ? dateCommande.hashCode() : 0);
        result = 31 * result + (datelivraison != null ? datelivraison.hashCode() : 0);
        return result;
    }
}
