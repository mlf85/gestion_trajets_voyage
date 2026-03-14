package com.example.gestion_trajets.entities;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "etapes")
public class Etape {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Ce champ ne doit pas être null ")
    @Size(min = 3, max = 6, message = "Min 3 et Max 6")
    private String nomEtape;
    private String ville;
    private String pays;
    private LocalDateTime heureDepartEtape;
    private LocalDateTime heureArriveEtape;
    private Integer dureeArret;
    private Enum typeEtape;
    private Integer ordre;
    private String description;
    @Temporal(TemporalType.DATE)
    private LocalDateTime dateCreation;
    @Temporal(TemporalType.DATE)
    private LocalDateTime dateModification;
    @ManyToOne
    private Trajet trajet;


    public Etape(Integer id, String nomEtape, String ville, String pays, LocalDateTime heureDepartEtape, LocalDateTime heureArriveEtape, Integer dureeArret, Enum typeEtape, Integer ordre, String description, LocalDateTime dateCreation) {
        this.id = id;
        this.nomEtape = nomEtape;
        this.ville = ville;
        this.pays = pays;
        this.heureDepartEtape = heureDepartEtape;
        this.heureArriveEtape = heureArriveEtape;
        this.dureeArret = dureeArret;
        this.typeEtape = typeEtape;
        this.ordre = ordre;
        this.description = description;
        this.dateCreation = dateCreation;
    }

    public Etape() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public LocalDateTime getHeureDepartEtape() {
        return heureDepartEtape;
    }

    public void setHeureDepartEtape(LocalDateTime heureDepartEtape) {
        this.heureDepartEtape = heureDepartEtape;
    }

    public LocalDateTime getHeureArriveEtape() {
        return heureArriveEtape;
    }

    public void setHeureArriveEtape(LocalDateTime heureArriveEtape) {
        this.heureArriveEtape = heureArriveEtape;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }
}
