-----------------Exercício01-----------------
--1.
CREATE TABLE Disciplina(
	codigo INT,
	nome VARCHAR(60),
	PRIMARY KEY (codigo)
);

CREATE TABLE Curso(
	codigo int,
	nome VARCHAR(60),
	PRIMARY KEY(codigo)
); 

CREATE TABLE Curriculo(
	curso_codigo INT,
	disciplina_codigo INT,
	FOREIGN KEY (curso_codigo) REFERENCES Curso (codigo) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (disciplina_codigo) REFERENCES Disciplina (codigo) ON DELETE CASCADE ON UPDATE CASCADE,
	PRIMARY KEY (curso_codigo, disciplina_codigo)
);

CREATE TABLE Sala(
	codigo INT,
	capacidade INT,
	PRIMARY KEY (codigo)
);

CREATE TABLE Turma(
	ano_sem VARCHAR (15),
	sala_codigo INT,
	disciplina_codigo INT,
	capacidade INT,
	PRIMARY KEY (ano_sem),
	FOREIGN KEY (sala_codigo) REFERENCES Sala (codigo) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (disciplina_codigo) REFERENCES Disciplina (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Laboratorio(
	equipamento VARCHAR(20),
	sala_codigo INT,
	PRIMARY KEY (equipamento),
	FOREIGN KEY (sala_codigo) REFERENCES Sala (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

--2.
ALTER TABLE Curso ADD COLUMN coordenador VARCHAR(60);

--3.
INSERT INTO Curso VALUES 
(11,'TADS','Milene'),
(22,'Medicina', 'Roberto'),
(33,'Engenharia Civil', 'Iasmini'),
(44,'Geologia', 'Gabriel'),
(55,'Matemática', 'Laredo'),
(66,'Física', 'Robson'),
(77,'Letras', 'Eliane'),
(88,'Relações Internacionais', 'Nilson'),
(99,'Odontologia', 'Diego'),
(12,'Biologia', 'Gabriele');

INSERT INTO Sala VALUES 
(123,25),
(234,25),
(345,10),
(456,10),
(567,25),
(678,10),
(789,15),
(891,15),
(910,20),
(111,20);

INSERT INTO Disciplina VALUES 
(01,'Banco de Dados'),
(02,'Fisiologia'),
(03,'Hidráulica '),
(04,'Geofísica'),
(05,'Calculo I'),
(06,'Mecânica Quântica'),
(07,'Semântica'),
(08,'Ciência Política'),
(09,'Ortodontia'),
(10,'Embriologia');

INSERT INTO Laboratorio VALUES 
('Informatica',123),
('Farmacia',234),
('Engenharia',345),
('Analise do Solo',456),
('Calculo',567),
('Fisíca',678),
('Sala de aula',789),
('Biblioteca',891),
('Anatomia',910),
('Biologia',111);

INSERT INTO Turma VALUES 
(2020,123,01,25),
(2010,234,02,25),
(2011,345,03,10),
(2013,456,04,10),
(2014,567,05,25),
(2015,678,06,10),
(2016,789,07,15),
(2018,891,08,15),
(2019,910,09,20),
(2021,111,10,20);

INSERT INTO Curriculo VALUES 
(11,01),
(22,02),
(33,03),
(44,04),
(55,05),
(66,06),
(77,07),
(88,08),
(99,09),
(12,010);

--4 a.
UPDATE  Sala 
SET capacidade = 49
WHERE codigo = 111;

--b.
UPDATE  Curso 
SET nome = 'Sistemas de Informação'
WHERE codigo = 1;

--5.
ALTER TABLE Turma DROP COLUMN capacidade;

--6.
DELETE FROM Disciplina CASCADE
WHERE nome = 'Banco de Dados';

--7.
TRUNCATE TABLE Turma, Sala, Laboratorio, Disciplina CASCADE;

--8.
DROP SCHEMA PUBLIC CASCADE;

--9.
CREATE DATABASE universidade;

