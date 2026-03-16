package com.example.gestion_trajets.DTO;

import jakarta.validation.constraints.NotEmpty;

import java.util.Date;

public class TrajetReq {
    @NotEmpty(message = "name is required")
    private String nom;
    @NotEmpty(message = "name is required")
    private String villeDepart;
    @NotEmpty(message = "name is required")
    private String villeArrivee;
    @NotEmpty(message = "name is required")
    private String paysDepart;
    @NotEmpty(message = "name is required")
    private String paysArrivee;
    private Integer duree;
    private double distance;
    @NotEmpty(message = "name is required")
    private Enum typeTransport;
    private String numVol_bus;
    @NotEmpty(message = "name is required")
    private String nomCompagnie;
    private Integer ordreTrajet;

    public TrajetReq(String nom, String villeDepart, String villeArrivee, String paysDepart, String paysArrivee, Integer duree, double distance, Enum typeTransport, String numVol_bus, String nomCompagnie, Integer ordreTrajet, Date dateCreation, Date dateModification) {
        this.nom = nom;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.paysDepart = paysDepart;
        this.paysArrivee = paysArrivee;
        this.duree = duree;
        this.distance = distance;
        this.typeTransport = typeTransport;
        this.numVol_bus = numVol_bus;
        this.nomCompagnie = nomCompagnie;
        this.ordreTrajet = ordreTrajet;
}

    public TrajetReq() {
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public String getPaysDepart() {
        return paysDepart;
    }

    public void setPaysDepart(String paysDepart) {
        this.paysDepart = paysDepart;
    }

    public String getPaysArrivee() {
        return paysArrivee;
    }

    public void setPaysArrivee(String paysArrivee) {
        this.paysArrivee = paysArrivee;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Enum getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(Enum typeTransport) {
        this.typeTransport = typeTransport;
    }

    public String getNumVol_bus() {
        return numVol_bus;
    }

    public void setNumVol_bus(String numVol_bus) {
        this.numVol_bus = numVol_bus;
    }

    public String getNomCompagnie() {
        return nomCompagnie;
    }

    public void setNomCompagnie(String nomCompagnie) {
        this.nomCompagnie = nomCompagnie;
    }

    public Integer getOrdreTrajet() {
        return ordreTrajet;
    }

    public void setOrdreTrajet(Integer ordreTrajet) {
        this.ordreTrajet = ordreTrajet;
    }

    public void setIdTrajet(Integer IdTrajet) {
    }

    public void setDateCreation(Date date) {
    }

    public void setDateModification(Date date) {
    }

    public String getNom() {
        return nom;
    }
}
