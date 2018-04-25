package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lignedecommande {
    private int idLigneDeCommande;
    private int idPanier;
    private int idCommande;
    private int idProduit;
    private int quantitéCommande;
    private int prix;

    @Id
    @Column(name = "id_ligne_de_commande", nullable = false)
    public int getIdLigneDeCommande() {
        return idLigneDeCommande;
    }

    public void setIdLigneDeCommande(int idLigneDeCommande) {
        this.idLigneDeCommande = idLigneDeCommande;
    }

    @Basic
    @Column(name = "id_panier", nullable = false)
    public int getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(int idPanier) {
        this.idPanier = idPanier;
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
    @Column(name = "idProduit", nullable = false)
    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    @Basic
    @Column(name = "quantitéCommande", nullable = false)
    public int getQuantitéCommande() {
        return quantitéCommande;
    }

    public void setQuantitéCommande(int quantitéCommande) {
        this.quantitéCommande = quantitéCommande;
    }

    @Basic
    @Column(name = "prix", nullable = false)
    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lignedecommande that = (Lignedecommande) o;

        if (idLigneDeCommande != that.idLigneDeCommande) return false;
        if (idPanier != that.idPanier) return false;
        if (idCommande != that.idCommande) return false;
        if (idProduit != that.idProduit) return false;
        if (quantitéCommande != that.quantitéCommande) return false;
        if (prix != that.prix) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLigneDeCommande;
        result = 31 * result + idPanier;
        result = 31 * result + idCommande;
        result = 31 * result + idProduit;
        result = 31 * result + quantitéCommande;
        result = 31 * result + prix;
        return result;
    }
}
