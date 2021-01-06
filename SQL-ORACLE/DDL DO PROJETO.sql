CREATE TABLE USUARIO(
ID_USUARIO NUMBER  NOT NULL,
CPF_CLIENTE VARCHAR2(14) NULL,
NOME VARCHAR2(120) NOT NULL,
SENHA VARCHAR2(120)NOT NULL,

CONSTRAINT PK_USUARIO PRIMARY KEY(ID_USUARIO) ENABLE 
);

CREATE TABLE CLIENTE(
ID_CONTATO NUMBER NULL,
NOME VARCHAR2(120) NULL,
CPF VARCHAR2(14) NULL,
IDADE NUMBER NULL,
SEXO VARCHAR2(9),
INTERESSES VARCHAR2(4000) NULL,
LISTACONTATO VARCHAR2(4000) NULL,

CONSTRAINT PK_CLIENTE PRIMARY KEY(CPF) ENABLE
);

CREATE TABLE CONTATO(
EMAIL VARCHAR2(120) NULL,
TELEFONE NUMBER NULL,
ID_CONTATO NUMBER NULL,

CONSTRAINT PK_CONTATO PRIMARY KEY(ID_CONTATO) ENABLE
);

ALTER TABLE USUARIO ALTER COLUMN ID_CLIENTE INT NULL;
ALTER TABLE USUARIO ADD CONSTRAINT FK_ID_CLIENTE FOREIGN KEY(CPF_CLIENTE) REFERENCES CLIENTE(CPF);
ALTER TABLE CLIENTE ADD CONSTRAINT FK_ID_CONTATO FOREIGN KEY(ID_CONTATO) REFERENCES CONTATO(ID_CONTATO);

CREATE SEQUENCE S_USUARIO INCREMENT BY 1 START WITH 1 MINVALUE 1;
CREATE SEQUENCE S_CLIENTE INCREMENT BY 1 START WITH 1 MINVALUE 1;
CREATE SEQUENCE S_CONTATO INCREMENT BY 1 START WITH 1 MINVALUE 1;

delete form USUARIO;