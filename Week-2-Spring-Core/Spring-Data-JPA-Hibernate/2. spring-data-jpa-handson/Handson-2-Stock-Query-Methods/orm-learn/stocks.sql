CREATE DATABASE IF NOT EXISTS ormlearn;

USE ormlearn;

DROP TABLE IF EXISTS stock;

CREATE TABLE stock(
    st_code VARCHAR(10) PRIMARY KEY,
    st_name VARCHAR(100)
);

INSERT INTO stock VALUES ('AAPL','Apple Inc');
INSERT INTO stock VALUES ('MSFT','Microsoft');
INSERT INTO stock VALUES ('GOOG','Google');
INSERT INTO stock VALUES ('AMZN','Amazon');
INSERT INTO stock VALUES ('TSLA','Tesla');
INSERT INTO stock VALUES ('META','Meta');
INSERT INTO stock VALUES ('NFLX','Netflix');
INSERT INTO stock VALUES ('ORCL','Oracle');
INSERT INTO stock VALUES ('IBM','IBM');
INSERT INTO stock VALUES ('INTC','Intel');

SELECT * FROM stock;