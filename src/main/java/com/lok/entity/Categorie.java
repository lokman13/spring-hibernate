package com.lok.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Categorie implements Serializable {
@Id
    @GeneratedValue
    private long idCategorie;
@NotEmpty
    @Size(min=4,max =20)
    private String nomCategorie;
    private String description;
    private String nomphoto;
    @Lob
    private byte[] photo;
    @OneToMany(mappedBy ="categorie")
 private Collection<Produit> produits=new ArrayList<Produit>();

    public Categorie(String nomCategorie, String description, String nomphoto, byte[] photo, Collection<Produit> produits) {
        this.nomCategorie = nomCategorie;
        this.description = description;
        this.nomphoto = nomphoto;
        this.photo = photo;
        this.produits = produits;
    }

    public Categorie() {
    }

    public long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomphoto() {
        return nomphoto;
    }

    public void setNomphoto(String nomphoto) {
        this.nomphoto = nomphoto;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
}
