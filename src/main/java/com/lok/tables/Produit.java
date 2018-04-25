package com.lok.tables;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produit {
    private int idProduit;
    private int idCategorie;
    private String description;
    private String prix;
    private int quantité;
    private int selectionne;
    private String état;

    @Id
    @Column(name = "idProduit", nullable = false)
    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    @Basic
    @Column(name = "idCategorie", nullable = false)
    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 40)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "prix", nullable = false, length = 20)
    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    @Basic
    @Column(name = "quantité", nullable = false)
    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    @Basic
    @Column(name = "selectionne", nullable = false)
    public int getSelectionne() {
        return selectionne;
    }

    public void setSelectionne(int selectionne) {
        this.selectionne = selectionne;
    }

    @Basic
    @Column(name = "état", nullable = false, length = 20)
    public String getÉtat() {
        return état;
    }

    public void setÉtat(String état) {
        this.état = état;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produit produit = (Produit) o;

        if (idProduit != produit.idProduit) return false;
        if (idCategorie != produit.idCategorie) return false;
        if (quantité != produit.quantité) return false;
        if (selectionne != produit.selectionne) return false;
        if (description != null ? !description.equals(produit.description) : produit.description != null) return false;
        if (prix != null ? !prix.equals(produit.prix) : produit.prix != null) return false;
        if (état != null ? !état.equals(produit.état) : produit.état != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProduit;
        result = 31 * result + idCategorie;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (prix != null ? prix.hashCode() : 0);
        result = 31 * result + quantité;
        result = 31 * result + selectionne;
        result = 31 * result + (état != null ? état.hashCode() : 0);
        return result;
    }
}
