package com.example.applicationcdev;

import android.app.Person;

import java.io.Serializable;

public class Plat implements Serializable {

    private String nom;
    private Double prix;
    private String image;
    private String description;



    public Plat(){

    }

    public Plat(String nom, Double prix, String image, String description) {
        this.nom = nom;
        this.prix = prix;
        this.image = image;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
