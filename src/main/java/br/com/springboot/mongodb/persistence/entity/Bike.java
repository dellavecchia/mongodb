package br.com.springboot.mongodb.persistence.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bike {
    
    @Id
    private String id;
    private String modelName;
    private String brandName;
    private LocalDate date;
    private String document;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getModel() {
        return modelName;
    }
    public void setModel(String model) {
        this.modelName = model;
    }
    public String getBrand() {
        return brandName;
    }
    public void setBrand(String brand) {
        this.brandName = brand;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    
    



}
