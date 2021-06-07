CREATE SCHEMA IF NOT EXISTS ims;

USE ims;

CREATE TABLE customer (
    id INT(11) NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(40) DEFAULT NULL,
    surname VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);