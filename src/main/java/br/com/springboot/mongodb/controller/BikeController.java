package br.com.springboot.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.mongodb.model.bikeRequest;
import br.com.springboot.mongodb.model.bikeResponse;
import br.com.springboot.mongodb.service.BikeService;

@RestController
@RequestMapping("/v1")
public class BikeController {

    @Autowired
    private BikeService service;
    @PostMapping
    public ResponseEntity<bikeResponse> create(@RequestBody bikeRequest request){
        return ResponseEntity.ok(service.create(request));
    }
    @GetMapping
    public ResponseEntity<List<bikeResponse>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
    
}
