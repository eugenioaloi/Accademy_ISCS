create database casaEditrice;

create table if not exists libro(
	id int auto_increment primary key,
    titolo varchar(100),
    prezzo decimal (6,2),
    pagine smallint,
    editore_id int
);

create table editore(
	id int auto_increment primary key,
    nome varchar(30),
    email varchar(100)
);

create table autore(
	id int auto_increment primary key,
    nome varchar(30),
    cognome varchar(50),
    nazionalita char(2)
);

create table autore_libro(
	libro_id int,
    autore_id int,
    primary key(libro_id, autore_id)
);

