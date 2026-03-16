package com.example.gestion_trajets.service.trajet;

import com.example.gestion_trajets.DTO.TrajetReq;
import com.example.gestion_trajets.entities.Trajet;
import com.example.gestion_trajets.exception.ResourceExistException;
import com.example.gestion_trajets.exception.ResourceNotFoundException;
import com.example.gestion_trajets.repositories.TrajetRepo;
import org.springframework.stereotype.Service;

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
    public void createTrajet(TrajetReq trajetReq) {
        Optional<Trajet> customerFound = this.trajetRepo.fetchTrajetByName(trajetReq.getNom());
        if(customerFound.isPresent())
            throw new ResourceExistException("Le client existe déjà !");


        Trajet trajet = new Trajet(trajetReq.getNom(), customerReqDTO.getLastName(), customerReqDTO.getEmail());
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






