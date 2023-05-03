package br.com.springboot.mongodb.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.mongodb.persistence.entity.Bike;

@Repository
public interface BikeRepository extends MongoRepository<Bike, String> {


    
}
