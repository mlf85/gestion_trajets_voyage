package com.example.gestion_trajets.service.trajet;

import com.example.gestion_trajets.entities.Trajet;
import com.example.gestion_trajets.exception.ResourceNotFoundException;
import com.example.gestion_trajets.repositories.TrajetRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TrajetServiceImpl implements TrajetService{

    private final TrajetRepo trajetRepo;

    public TrajetServiceImpl (TrajetRepo trajetRepo){
        this.trajetRepo = trajetRepo;

    }


    @Override
    public void createTrajet(Trajet trajet) {
        trajet.setIdTrajet(null);
        trajet.setDateCreation(new Date());
        trajet.setDateModification(new Date());
       this.trajetRepo.save(trajet);
    }

    @Override
    public List<Trajet> getTrajets() {
        return this.trajetRepo.findAll();
    }

    @Override
    public Trajet getTrajetById(Integer idTrajet) {
        Optional<Trajet> trajetOptional = this.trajetRepo.findById(idTrajet);
        if (trajetOptional.isEmpty())
            throw new ResourceNotFoundException("Le trajet n'existe pas !");
      return trajetOptional.get();
    }

    @Override
    public void updateTrajet(Integer idTrajet, Trajet trajet) {
        Trajet trajetToUpdate = this.trajetRepo.findById(idTrajet).orElseThrow(
                () ->new ResourceNotFoundException("Le trajet n'existe pas !")
        );

        trajetToUpdate.setStatut(trajet.getStatut());
        trajetToUpdate.setDateModification(new Date());
        this.trajetRepo.saveAndFlush(trajetToUpdate);
    }

    @Override
    public void deleteTrajet(Integer idTrajet) {
        this.trajetRepo.deleteById(idTrajet);
    }
}






