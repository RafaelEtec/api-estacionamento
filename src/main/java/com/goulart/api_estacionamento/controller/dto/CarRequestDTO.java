package com.goulart.api_estacionamento.controller.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.OffsetDateTime;

@Entity
public class CarRequestDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String plateNumber;
    private OffsetDateTime dateHourArrival;
    private OffsetDateTime dateHourEstimatedLeave;

    public CarRequestDTO() {}

    public CarRequestDTO(String brand, String model, String plateNumber, OffsetDateTime dateHourArrival, OffsetDateTime dateHourEstimatedLeave) {
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.dateHourArrival = dateHourArrival;
        this.dateHourEstimatedLeave = dateHourEstimatedLeave;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public OffsetDateTime getDateHourArrival() {
        return dateHourArrival;
    }

    public void setDateHourArrival(OffsetDateTime dateHourArrival) {
        this.dateHourArrival = dateHourArrival;
    }

    public OffsetDateTime getDateHourEstimatedLeave() {
        return dateHourEstimatedLeave;
    }

    public void setDateHourEstimatedLeave(OffsetDateTime dateHourEstimatedLeave) {
        this.dateHourEstimatedLeave = dateHourEstimatedLeave;
    }
}