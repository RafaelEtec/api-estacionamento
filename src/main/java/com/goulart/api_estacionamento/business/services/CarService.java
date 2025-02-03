package com.goulart.api_estacionamento.business.services;

import com.goulart.api_estacionamento.controller.dto.Car;
import com.goulart.api_estacionamento.controller.dto.CarDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarService {

    private static final Logger log = LoggerFactory.getLogger(CarService.class);

    public void addCar(Car car) {
        String sql = "INSERT INTO tb_CAR () ";

        try {
            Connection con = createConnection();


        } catch (Exception ex) {

        }
    }

    public static Connection createConnection() throws SQLException {
        String url = "jdbc:h2:mem:testdb";
        String user = "sa";
        String password = "sa";

        return DriverManager.getConnection(url, user, password);
    }
}