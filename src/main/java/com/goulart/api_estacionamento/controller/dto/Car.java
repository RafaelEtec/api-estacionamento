package com.goulart.api_estacionamento.controller.dto;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.Objects;

@Entity
@Table(name = "tb_CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String plateNumber;
    private String parkingSpace;
    private OffsetDateTime dateHourArrival;
    private OffsetDateTime dateHourEstimatedLeave;

    public Car() {}

    public Car(Long id, String brand, String model, String plateNumber, String parkingSpace, OffsetDateTime dateHourArrival, OffsetDateTime dateHourEstimatedLeave) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.parkingSpace = parkingSpace;
        this.dateHourArrival = dateHourArrival;
        this.dateHourEstimatedLeave = dateHourEstimatedLeave;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(String parkingSpace) {
        this.parkingSpace = parkingSpace;
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

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}