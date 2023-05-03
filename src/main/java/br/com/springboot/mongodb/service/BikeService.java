package br.com.springboot.mongodb.service;

import java.util.List;

import br.com.springboot.mongodb.model.bikeRequest;
import br.com.springboot.mongodb.model.bikeResponse;

public interface BikeService {
    
    bikeResponse create(bikeRequest request);

    List<bikeResponse> getAll();

}