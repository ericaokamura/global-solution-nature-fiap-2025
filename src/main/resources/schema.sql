-- gb_db.reports definition
CREATE DATABASE gs_db;
USE gs_db;
CREATE TABLE reports (
  id int NOT NULL AUTO_INCREMENT,
  tipo varchar(50) DEFAULT NULL,
  descricao varchar(200) DEFAULT NULL,
  severidade int DEFAULT NULL,
  localizacao varchar(500) DEFAULT NULL,
  criado_em date DEFAULT NULL,
  PRIMARY KEY (id)
)