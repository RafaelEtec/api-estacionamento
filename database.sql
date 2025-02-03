DROP TABLE IF EXISTS tb_CAR;

CREATE TABLE tb_CAR (
car_id BIGINT PRIMARY KEY AUTO_INCREMENT,
car_brand varchar NOT NULL,
car_model varchar NOT NULL,
car_platenumber varchar NOT NULL,
car_datehourarrival datetime NOT NULL,
car_datehourestimatedleave datetime NOT NULL
);