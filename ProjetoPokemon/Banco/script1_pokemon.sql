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
INSERT INTO Pokemon VALUES (null, 'Bulbasaur', 5, 45, 49, 49, 45, 0.7, 6.9, 'Grama', 'Veneno');
INSERT INTO Pokemon VALUES (null, 'Ivysaur', 5, 60, 62, 63, 60, 1.0, 13, 'Grama', 'Veneno');
INSERT INTO Pokemon VALUES (null, 'Venosaur', 5, 80, 82, 83, 80, 2.0, 100.0, 'Grama', 'Veneno');
INSERT INTO Pokemon VALUES (null, 'Charmander', 5, 39, 52, 43, 65, 0.6, 8.5, 'Fogo', null);
INSERT INTO Pokemon VALUES (null, 'Charmeleon', 5, 58, 64, 58, 80, 1.1, 19.0, 'Fogo', null);
INSERT INTO Pokemon VALUES (null, 'Charizard', 5, 78, 84, 78, 100, 1.7, 90.5, 'Fogo', 'Voador');
INSERT INTO Pokemon VALUES (null, 'Squirtle', 5, 44, 48, 65, 43, 0.5, 9.0, 'Água', null);
INSERT INTO Pokemon VALUES (null, 'Wartortle', 5, 59, 63, 80, 58, 1.0, 22.5, 'Água', null);
INSERT INTO Pokemon VALUES (null, 'Blastoise', 5, 79, 83, 100, 78, 1.6, 85.5, 'Água', null);
INSERT INTO Pokemon VALUES (null, 'Caterpie', 5, 45, 30, 35, 45, 0.3, 2.9, 'Inseto', null);
INSERT INTO Pokemon VALUES (null, 'Metapod', 5, 50, 20, 55, 30, 0.7, 9.9, 'Inseto', null);
INSERT INTO Pokemon VALUES (null, 'Butterfree', 5, 60, 45, 50, 70, 1.1, 32.0, 'Inseto', 'Voador');
INSERT INTO Pokemon VALUES (null, 'Articuno', 5, 90, 85, 100, 85, 1.7, 55.4, 'Gelo', 'Voador');
INSERT INTO Pokemon VALUES (null, 'Zapdos', 5, 90, 90, 85, 100, 1.6, 52.6, 'Eletrico', 'Voador');
INSERT INTO Pokemon VALUES (null, 'Moltres', 5, 90, 100, 90, 90, 2.0, 60.0, 'Fogo', 'Voador');
INSERT INTO Pokemon VALUES (null, 'Mewtwo', 5, 106, 110, 90, 130, 2.0, 122.0, 'Psiquico', null);
INSERT INTO Pokemon VALUES (null, 'Mew', 5, 100, 100, 100, 100, 0.4, 4.0, 'Psiquico', null);

SELECT * FROM pokemon;
SELECT * FROM Jogador