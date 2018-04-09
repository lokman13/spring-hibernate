package com.lok.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class LigneCommande implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name="idproduit")
    private Produit produit;
    private int quantite;
    private double prix;

    public LigneCommande(Produit produit, int quantite, double prix) {
        this.produit = produit;
        this.quantite = quantite;
        this.prix = prix;
    }

    public LigneCommande() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}