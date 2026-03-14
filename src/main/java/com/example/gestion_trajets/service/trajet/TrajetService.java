package com.example.gestion_trajets.service.trajet;

import com.example.gestion_trajets.entities.Trajet;

import java.util.List;

public interface TrajetService {
    void createTrajet(Trajet trajet);
    List<Trajet> getTrajets();
    Trajet getTrajetById(Integer idTrajet);
    void updateTrajet(Integer idTrajet, Trajet trajet);
    void deleteTrajet(Integer idTrajet);
}
