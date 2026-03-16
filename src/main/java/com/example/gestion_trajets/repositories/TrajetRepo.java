package com.example.gestion_trajets.repositories;

import com.example.gestion_trajets.entities.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TrajetRepo extends JpaRepository<Trajet,Integer> {
    Optional<Trajet> findByName(String nom);
    @Query("Select c from Trajet c where c.trajet=:trajet")
    Optional<Trajet> fetchTrajetByName(@Param("nom") String nom);
}
