package br.com.springboot.mongodb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.mongodb.model.bikeRequest;
import br.com.springboot.mongodb.model.bikeResponse;
import br.com.springboot.mongodb.persistence.entity.Bike;
import br.com.springboot.mongodb.persistence.repository.BikeRepository;

@Service

public class BikeServiceImpl implements BikeService  {

    @Autowired
    private BikeRepository repository;
    
    @Override
    public bikeResponse create(bikeRequest request) {
        Bike bike = new Bike();
        bike.setBrand(request.getBrandName());
        bike.setModel(request.getModelName());
        bike.setDocument(request.getDocument());
        bike.setDate(request.getDate());
        
        repository.save(bike);

        return createResponse(bike);


    }



    @Override
    public List<bikeResponse> getAll() {
        List<bikeResponse> responses = new ArrayList<>();

        List<Bike> bikes = repository.findAll();
        if (!bikes.isEmpty()) {
            bikes.forEach(bike -> responses.add(createResponse(bike))); 

        }
        return responses;
        
            
     }


    
    private bikeResponse createResponse(Bike bike) {
        bikeResponse response = new bikeResponse();
        response.setId(bike.getId());
        response.setBrandName(bike.getBrand());
        response.setModelName(bike.getModel());
        response.setDocument(bike.getDocument());
        response.setDate(bike.getDate());
        return response;
    }
}
