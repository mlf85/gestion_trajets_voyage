package com.example.gestion_trajets.controllers;

import jakarta.validation.Valid;
import com.example.gestion_trajets.entities.Trajet;
import com.example.gestion_trajets.service.trajet.TrajetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(path = "api/v1/trajets")
    public class TrajetController {
        private final TrajetService trajetService;

        public TrajetController(TrajetService trajetService) {
            this.trajetService = trajetService;
        }

        @PostMapping(path = "/create")
        public ResponseEntity<String> createTrajet(@RequestBody @Valid Trajet trajet){
            this.trajetService.createTrajet(trajet);
            return ResponseEntity.status(201).body("Trajet created !");
        }

        @GetMapping(path = "/get_all")
        public ResponseEntity<List<Trajet>> getAllTrajets(){
            return ResponseEntity.status(200).body(this.trajetService.getTrajets());
        }

        @GetMapping(path = "/get_by_id/{id}")
        public ResponseEntity<Trajet> getCategory(@PathVariable Integer id){
            return ResponseEntity.status(200).body(this.trajetService.getTrajetById(id));
        }

        @PutMapping(path = "/update/{id}")
        public ResponseEntity<String> updateTrajet(@RequestBody Trajet trajet, @PathVariable Integer idTrajet){
            this.trajetService.updateTrajet(idTrajet, trajet);
            return ResponseEntity.status(202).body("Updated successfully !");

        }

        @DeleteMapping(path = "/delete/{id}")
        public ResponseEntity<String> deletedSuccessfully(@PathVariable Integer idTrajet){
            this.trajetService.deleteTrajet(idTrajet);
            return ResponseEntity.status(202).body("Deleted successfully");
        }



}
