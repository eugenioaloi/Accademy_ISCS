create database if not exists acquistionline;

create table if not exists magazzini(
	id int auto_increment not null primary key,
    id_magazzino char(4) not null,
    qt_disponibile smallint not null,
    cod_articolo char(4)not null,
    nome_articolo varchar(50) not null,
    prezzo_unitario decimal(6,2) not null,
    descrizione varchar(100) not null
);

create table if not exists clienti(
	id int auto_increment not null primary key, 
	cod_cliente varchar(4) not null,
    nome varchar(50) not null,
    cognome varchar(50) not null
);

create table if not exists carrelli(
	id int auto_increment primary key not null,
    cod_cliente varchar(4),
    tipo_pagamento varchar(50),
    qt_articoli smallint,
    cod_articolo varchar(4)
);
