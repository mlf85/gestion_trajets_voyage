package com.example.gestion_trajets.repositories;

import com.example.gestion_trajets.entities.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TrajetRepo extends JpaRepository<Trajet,Integer> {
    Optional<Trajet> findById(String trajetId);
}
