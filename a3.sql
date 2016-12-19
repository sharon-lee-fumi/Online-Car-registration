CREATE DATABASE store;

USE store;

CREATE TABLE cars(
	carId int NOT NULL,
    model varchar(50) NOT NULL,
    year int,
    color varchar(10),
    PRIMARY KEY(carId));
 