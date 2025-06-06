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
);
CREATE TABLE contribuicoes (
  id int NOT NULL AUTO_INCREMENT,
  nome_completo varchar(200) DEFAULT NULL,
  telefone varchar(50) DEFAULT NULL,
  email varchar(100) DEFAULT NULL,
  cidade varchar(100) DEFAULT NULL,
  estado varchar(2) DEFAULT NULL,
  endereco varchar(200) DEFAULT NULL,
  valor int DEFAULT NULL,
  forma_pagamento varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE doacoes (
  id int NOT NULL AUTO_INCREMENT,
  nome_completo varchar(200) DEFAULT NULL,
  telefone varchar(50) DEFAULT NULL,
  email varchar(100) DEFAULT NULL,
  cidade varchar(100) DEFAULT NULL,
  estado varchar(2) DEFAULT NULL,
  endereco varchar(200) DEFAULT NULL,
  condicao varchar(100) DEFAULT NULL,
  forma_entrega varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE itens_doados (
  id int NOT NULL AUTO_INCREMENT,
  doacao_id int DEFAULT NULL,
  tipo_doacao varchar(50) DEFAULT NULL,
  quantidade int DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (doacao_id) references doacoes(id)
);
