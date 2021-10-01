--1.
CREATE TABLE Cliente(
	cpf BIGINT, --Não usei o INT pois dara  problema ao inserir os dados -> 'ERROR - Integer out of range'
	nome VARCHAR(60),
	dtNasc DATE	,
	PRIMARY KEY(cpf)
);

CREATE TABLE Modelo (
	codMod INT,	
	descricao VARCHAR(40),
	PRIMARY KEY(codMod)
);

CREATE TABLE Patio(
	num INT,
	enderc VARCHAR(40),
	capacidade INT,
	PRIMARY KEY(num)
);

CREATE TABLE Veiculo(
	placa VARCHAR(8),
	modelo_codMod INT,
	cliente_cpf BIGINT,
	cor VARCHAR(20),
	ano INT,
	PRIMARY KEY(placa),
	FOREIGN KEY (modelo_codMod) REFERENCES Modelo (codMod),
	FOREIGN KEY (cliente_cpf) REFERENCES Cliente (cpf)
);

CREATE TABLE Estaciona(
	cod INT,
	patio_num INT,
	veiculo_placa VARCHAR(8),
	dtEntrada VARCHAR(10),
	dtSaida VARCHAR(10),
	hsEntrada VARCHAR(10),
	hsSaida VARCHAR(10),
	PRIMARY KEY(cod),
	FOREIGN KEY (patio_num) REFERENCES patio (num),
	FOREIGN KEY (veiculo_placa) REFERENCES Veiculo (placa)
);

--2.
INSERT INTO Cliente VALUES 
(12312312312, 'Joao', '2002-06-21'),
(30938311101, 'Otavio', '2002-10-21'),
(34521180901, 'Luan', '2002-05-23'),
(45678901233, 'Iasmini', '2000-02-24'),
(19209830283, 'Cleide', '1980-12-19'),
(14719274083, 'Jucelino', '2001-06-24'),
(65780923484, 'Carol', '2004-04-18'),
(66614351235, 'Flavio', '2004-06-14');

INSERT INTO Modelo VALUES 
(1, 'Moderno'),
(2, 'Leve'),
(3, 'Futuristico'),
(4, 'Tesla'),
(5, 'Flutuante'),
(6, 'Submerso'),
(7, 'Interestelar'),
(8, 'Retro');

INSERT INTO Patio VALUES 
(100, 'California', 40),
(02, 'Setor Sul', 40),
(03, 'Formosinha', 40),
(04, 'Vila Verde', 40),
(05, 'Centro', 40),
(06, 'Setor Nordeste', 40),
(07, 'Bela Vista', 40),
(08, 'Parque Lago', 40);

INSERT INTO Veiculo VALUES 
('jjj-2020', 1, 12312312312, 'Branco', 2023),
('jct-2020', 2, 30938311101, 'Preto', 2020),
('jgh-2019', 3, 34521180901, 'Azul', 2019),
('adj-2016', 4, 45678901233, 'Cinza', 2016),
('gtj-2017', 5, 19209830283, 'Verde', 2017),
('jas-2018', 6, 14719274083, 'Amarelo', 2018),
('ads-2012', 7, 65780923484, 'Rosa', 2012),
('jds-1964', 8, 66614351235, 'Fuxia', 1964);

INSERT INTO Estaciona VALUES 
(202, 100,'jjj-2020', '21/08/2014', '22/08/2014', '09:00', '10:00'),
(123, 02, 'jct-2020', '12/04/2014', '12/07/2015', '10:00', '11:00'),
(003, 03, 'jgh-2019', '14/05/2014', '10/06/2016', '13:01', '15:01'),
(004, 04, 'adj-2016', '14/06/2014', '31/05/2017', '12:02', '16:08'),
(005, 05, 'gtj-2017', '20/07/2014', '16/04/2018', '14:01', '15:10'),
(006, 06, 'jas-2018', '10/08/2014', '19/02/2023', '12:03', '15:07'),
(007, 07, 'ads-2012', '19/10/2014', '10/10/2019', '15:05', '16:10'),
(008, 08, 'jds-1964', '19/09/2014', '11/11/2021', '16:08', '17:01');

--3.
ALTER TABLE Cliente ADD COLUMN endereco VARCHAR(80);

--4.
UPDATE  Patio 
SET capacidade = 45
WHERE num = 100

--5.
--a.
SELECT c.cpf, c.nome
FROM Cliente AS c, Veiculo AS v
WHERE c.cpf = v.cliente_cpf AND v.placa = (SELECT placa 
										   FROM veiculo
										   WHERE placa = 'jjj-2020');								

--b.
SELECT c.nome
FROM Cliente AS c INNER JOIN Veiculo AS v ON c.cpf = v.cliente_cpf INNER JOIN Estaciona AS e ON v.placa = e.veiculo_placa
WHERE e.cod = 202

--c. 
SELECT e.patio_num, COUNT(e.cod) as quantidade
FROM Veiculo as v INNER JOIN Estaciona AS e ON v.placa = e.veiculo_placa
GROUP BY e.patio_num

--d. Não á nenhum patio com mais de 10 carros estacionados 
SELECT e.patio_num, COUNT(e.cod) 
FROM Veiculo as v INNER JOIN Estaciona AS e ON v.placa = e.veiculo_placa
WHERE (SELECT COUNT(e.cod) 
	   FROM Veiculo as v 
	   INNER JOIN Estaciona AS e 
	   ON v.placa = e.veiculo_placa) > 10
GROUP BY e.patio_num

--e. Não a veículo não cadastrado :)
SELECT v.placa, v.ano, e.cod
FROM Veiculo AS v  LEFT OUTER JOIN Estaciona as e ON v.placa = e.veiculo_placa; 

--f. 
TRUNCATE TABLE Estaciona;

--g.
SELECT v.placa, v.ano, m.descricao
FROM Veiculo AS v INNER JOIN Modelo as m ON v.modelo_codMod  = m.codmod;
 
--h.
SELECT COUNT(e.cod) as q
FROM Veiculo AS v INNER JOIN Estaciona AS e 
ON v.placa = e.Veiculo_placa
WHERE v.cor = 'Verde';

--i.
SELECT m.descricao
FROM Modelo AS m INNER JOIN Veiculo AS v
ON m.codmod = v.Modelo_codmod INNER JOIN Estaciona AS e ON
v.placa = e.Veiculo_placa
WHERE e.cod = 123


										_______0000000000000_______000000000000________
										_____000000000000000000__00000000000000000______
										___00000000000000000000000000000_______0000_____
										__000000000000000000000000000000_________000____
										_000000000000000000000000000000000________000___
										_000000000000000000000000000000000000_____000____
										_00000000000000000000000000000000000000___0000____
										_000000000000000000000000000000000000000_00000____
										_000000000000000000000000000000000000000000000____
										_000000000000000000000000000000000000000000000____
										_0000000000000000000000000000000000000000000_____
										__00000000000000000000000000000000000000000______
										____00000000000000000000000000000000000000_______
										______0000000000000000000000000000000000________
										_________00000000000000000000000000000_________
										____________000000000000000000000000___________
										_______________000000000000000000_____________
										__________________00000000000000_____________
										____________________000000000________________
										______________________00000_________________
										_______________________00___________________
																					

																								
