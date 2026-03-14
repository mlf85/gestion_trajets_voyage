package com.example.gestion_trajets.service.etape;

import com.example.gestion_trajets.entities.Etape;
import com.example.gestion_trajets.entities.Trajet;

import java.util.List;

public interface EtapeService {
    void createEtape(Etape etape);
    List<Etape> getEtapes();
    Etape getEtapeById(Integer id);
    void updateEtape(Integer id, Etape etape);
    void deleteEtape(Etape etape);
}
