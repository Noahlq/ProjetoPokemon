DROP DATABASE IF EXISTS ProjetoPokemon;
CREATE DATABASE ProjetoPokemon;

USE ProjetoPokemon;

CREATE TABLE Pokemon(

	id_p int auto_increment,
	nome_p varchar(50),
    nivel_p int(2),
    vida_p int(3),
    ataque_p int(3),
    defesa_p int(3),
    velocidade_p int(3),
    peso_p float,
    tamanho_p float,
    tipo_p varchar(10),
    tipo2_p varchar(10),
    PRIMARY KEY (id_p)
);

CREATE TABLE Jogador(

	id_j int auto_increment,
	usuario varchar(50),
    senha varchar(50),
    ovos int,
    dinheiro decimal,
    pokemon_id int,
    PRIMARY KEY (id_j),
    FOREIGN KEY (pokemon_id) REFERENCES Pokemon(id_p)
);

INSERT INTO Pokemon VALUES (null, 'Pikachu', 5, 35, 55, 30, 90, 0.4, 6.0, 'Eletrico', null);

SELECT * FROM pokemon