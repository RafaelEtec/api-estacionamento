package com.goulart.api_estacionamento.controller.dto;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.Objects;

public class CarDTO {
    private Long id;
    private String brand;
    private String model;
    private String parkingSpace;
    private OffsetDateTime dateHourArrival;

    public CarDTO() {}


}