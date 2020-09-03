package com.example.applicationcdev;

public class Avis {
    private String id;
    private String title;
    private String mail;
    private String description;
    private Double nbStars;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getNbStars() {
        return nbStars;
    }

    public void setNbStars(Double nbStars) {
        this.nbStars = nbStars;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
