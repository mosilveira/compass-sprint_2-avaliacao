# Compass.Uol - Sprint 2 - Avaliação

Avaliação Sprint 2 – Programa de Bolsas SpringBoot
- Banco de dados: MySql
- Dependências:
  - C3P0 <!-- https://mvnrepository.com/artifact/com.mchange/c3p0 -->
  - MySQL Connector/J <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->


## Complementos
### Questão - 1

Comando SQL para criação do banco de dados:

    CREATE DATABASE loja;
    
    USE loja;
    
    CREATE TABLE produtos (
        id INT AUTO_INCREMENT,
        nome VARCHAR(50),
        descricao VARCHAR(255),
        quantidade INT,
        preco double,
        PRIMARY KEY (id)
    );

### Questão - 2

Comando SQL para criação do banco de dados:

    CREATE DATABASE filmes;
    
    USE filmes;
    
    CREATE TABLE filmes (
        id INT AUTO_INCREMENT,
        nome VARCHAR(50),
        descricao VARCHAR(255),
        ano INT,
        PRIMARY KEY (id)
    );