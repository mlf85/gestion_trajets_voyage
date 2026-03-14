package com.example.gestion_trajets.repositories;

import com.example.gestion_trajets.entities.Etape;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EtapeRepo extends JpaRepository<Etape,Integer> {
    Optional<Etape> findByName(String nomEtape);
}
