package com.goulart.api_estacionamento.business.services;

import com.goulart.api_estacionamento.controller.dto.CarRequestDTO;
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

    String url = "";

    private static final Logger log = LoggerFactory.getLogger(CarService.class);

    public void addCar(CarRequestDTO car) {
        String sql = "INSERT INTO ";

        try {
            Connection con = createConnection();

        } catch (Exception ex) {

        }
    }

    public static Connection createConnection() throws SQLException {
        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "sa";

        return DriverManager.getConnection(url, user, password);
    }
}