package com.example.gestion_trajets.DTO;

import jakarta.validation.constraints.NotEmpty;

import java.util.Date;

public class EtapeReq {
    @NotEmpty(message = "name is required")
    private String nomEtape;
    private String ville;
    @NotEmpty(message = "name is required")
    private String pays;
    private Integer dureeArret;
    @NotEmpty(message = "name is required")
    private Enum typeEtape;
    private Integer ordre;

    public EtapeReq(Enum typeEtape, Integer dureeArret, String pays, String ville, String nomEtape, Integer ordre, Date dateCreation, Date dateModification) {
        this.typeEtape = typeEtape;
        this.dureeArret = dureeArret;
        this.pays = pays;
        this.ville = ville;
        this.nomEtape = nomEtape;
        this.ordre = ordre;
    }

    public EtapeReq() {}

    public String getNomEtape() {
        return nomEtape;
    }

    public void setNomEtape(String nomEtape) {
        this.nomEtape = nomEtape;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Integer getDureeArret() {
        return dureeArret;
    }

    public void setDureeArret(Integer dureeArret) {
        this.dureeArret = dureeArret;
    }

    public Enum getTypeEtape() {
        return typeEtape;
    }

    public void setTypeEtape(Enum typeEtape) {
        this.typeEtape = typeEtape;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }
}
