CREATE DATABASE IF NOT EXISTS rdb;
USE rdb;

CREATE TABLE IF NOT EXISTS Pessoa
(
	id 				INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome 			VARCHAR(64) NOT NULL,
    email 			VARCHAR(32) NOT NULL,
    telefone 		VARCHAR(16) NOT NULL,
    senha 			VARCHAR(16) NOT NULL,
    administrador 	BOOLEAN NOT NULL DEFAULT FALSE, /* FALSE = Doador, TRUE = Administrador */
    /* ENDEREÇO */
    cep 			VARCHAR(9) NOT NULL,
    logradouro 		VARCHAR(64) NOT NULL,
    numero 			VARCHAR(8) NOT NULL DEFAULT 'S/N',
    complemento 	VARCHAR(16),
    bairro 			VARCHAR(32),
    cidade 			VARCHAR(32) NOT NULL,
    uf 				CHAR(2) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Evento
(
	id 			INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome 		VARCHAR(64) NOT NULL DEFAULT 'Novo Evento',
    dataInicio 	DATE,
    dataFim 	DATE,
    dataCriacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ativo 		BOOLEAN NOT NULL DEFAULT TRUE,
    descricao 	TEXT,
    id_autor 	INT UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_autorEvento FOREIGN KEY (id_autor) REFERENCES Pessoa(id)
);

CREATE TABLE IF NOT EXISTS CategoriaItem
(
	id 		INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome 	VARCHAR(32) NOT NULL,
    /* icone 	VARCHAR(128) // necessário? */
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ItemDoacao
(
	id 				INT UNSIGNED NOT NULL AUTO_INCREMENT,
    id_categoria 	INT UNSIGNED NOT NULL,
    nome 			VARCHAR(32) NOT NULL,
    valorReferencia	DECIMAL(5,2) NOT NULL DEFAULT 0.01,
    ativo 			BOOLEAN NOT NULL DEFAULT TRUE,
    dataCriacao 	TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    id_autor 		INT UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_categoriaItemDoacao FOREIGN KEY (id_categoria) REFERENCES CategoriaItem(id),
    CONSTRAINT fk_autorItemDoacao FOREIGN KEY (id_autor) REFERENCES Pessoa(id)
);

CREATE TABLE IF NOT EXISTS EventoItens
(
	id_evento 		INT UNSIGNED NOT NULL,
    id_item 		INT UNSIGNED NOT NULL,
    qtdNecessaria 	INT UNSIGNED NOT NULL DEFAULT 1,
    qtdObtida 		INT UNSIGNED DEFAULT 0,
    prioridade 		ENUM('Baixa', 'Média', 'Alta') NOT NULL DEFAULT 'Média',
    PRIMARY KEY (id_evento, id_item),
    CONSTRAINT fk_evento FOREIGN KEY (id_evento) REFERENCES Evento(id),
    CONSTRAINT fk_item FOREIGN KEY (id_item) REFERENCES ItemDoacao(id)
);

CREATE TABLE IF NOT EXISTS EventoDoadores
(
	id_evento 		INT UNSIGNED NOT NULL,
    id_doador 		INT UNSIGNED NOT NULL,
    id_itemDoado 	INT UNSIGNED NOT NULL,
    qtdDoada 		INT UNSIGNED NOT NULL DEFAULT 1,
    PRIMARY KEY (id_evento, id_doador, id_itemDoado),
    CONSTRAINT fk_evento_ FOREIGN KEY (id_evento) REFERENCES Evento(id),
    CONSTRAINT fk_doador FOREIGN KEY (id_doador) REFERENCES Pessoa(id),
    CONSTRAINT fk_itemDoado FOREIGN KEY (id_itemDoado) REFERENCES ItemDoacao(id)
);