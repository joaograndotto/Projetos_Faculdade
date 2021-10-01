-- DESCRIÇÃO:
 
--		Este projeto tem como base um banco bibliotecário, voltado
-- para a organização, catálogo e locação de livros com a manipulção 
-- feita pelas tabelas: Autor; Publicacao; Categoria; Edicao; Locacao 
-- e atLog.
--		Para que não houvesse resíduos de dados será utilizado um before trigger
-- com um método capaz de limpar os dados que estiverem armazenados na tabela atLog
-- antes da inserção.
--		Já nosso after trigger terá como função alocar os dados do cliente na tabela
-- atLog após a inserção dos dados. 								
								
								
								
-- CÓDIGO 
								
CREATE TABLE Autor(
	codautor INT NOT NULL,
	nome VARCHAR(40),
	codDepartamento INT,
	pais VARCHAR(40),	
	PRIMARY KEY (codautor)
);

CREATE TABLE Publicacao(
	Codpub INT NOT NULL,
	Titulo VARCHAR(40),
	ano INT NOT NULL,
	idiomas VARCHAR(40),	
	PRIMARY KEY (codpub)
);

CREATE TABLE Categoria(
	codAutor INT,
	titulo VARCHAR(40),
	codDepartamento INT,
	categoria VARCHAR(40),
	PRIMARY KEY(codAutor),
	FOREIGN KEY (codAutor) REFERENCES Autor (codAutor) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Edicao(
	isbn INT,
	numEdicao INT,
	classeEdicao VARCHAR(40),
	ano DATE,
	PRIMARY KEY (isbn)
);

CREATE TABLE Locacao(
	nomeCliente VARCHAR(40),
	endereco VARCHAR(40),
	cpf BIGINT,
	telefone VARCHAR(40),
	isbn INT,
	datadeLocacao DATE,
	PRIMARY KEY (cpf),
	FOREIGN KEY (isbn) REFERENCES edicao (isbn)	ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE atLog(
	nomeCliente VARCHAR(40),
	cpf BIGINT,
	isbn INT,
	PRIMARY KEY(cpf)
);

create or replace function atualizar_log()
returns trigger as
$$
	begin
		INSERT INTO atLog
		VALUES(new.nomeCliente, new.cpf, new.isbn);
	
		RETURN new;
	end;
$$
language plpgsql;

create trigger "atualizarlog"
after insert on locacao
for each row
execute procedure atualizar_log();


create or replace function verificar_log()
returns trigger as
$$
	begin
		TRUNCATE TABLE atlog;
		RETURN new;
	end;
$$
language plpgsql;

create trigger "verificLog"
before insert or update on locacao
for each row
execute procedure verificar_log();

INSERT INTO edicao VALUES 
(2, 13, 'exclusiva', '21-09-1111');

INSERT INTO locacao VALUES 
('João', 'Centro', 123, '9911111111', 2);

 
