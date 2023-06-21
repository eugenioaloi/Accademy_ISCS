create database if not exists biglietteriaaerea;

drop table voli;
create table if not exists voli(
	id int auto_increment primary key,
    partenza varchar (50) not null,
    destinazione varchar (50) not null,
    datavolo date not null,
    orariovolo char(5) not null,
    postidisponibili int not null,
    nomevolo varchar (50) not null
);

insert into voli (partenza, destinazione, datavolo, orariovolo, postidisponibili, nomevolo)
values ("milano","barcellona","2023-01-01","10:00",200,"milbarc"),
("torino","olbia","2023-07-21","20:00",350,"torolb"),
("roma","new york","2023-11-30","15:00",200,"romnyw"),
("bergamo","napoli","2023-08-01","22:00",400,"begnap");

drop table clienti;
create table if not exists clienti(
	id int auto_increment primary key,
    codcliente char (5) not null,
    nome varchar (50) not null,
    cognome varchar (50) not null
);

insert into clienti (codcliente,nome,cognome)
values ("CL001","Pippo","Franco"),
("CL002","Laura","Bianchi"),
("CL003","Mario","Rossi"),
("CL004","Maria","Verdi");

drop table biglietti;
create table if not exists biglietti(
	id int auto_increment primary key,
    codcliente char (5) not null,
    tipopagamento varchar (50) not null,
    qtbiglietti int not null,
    id_volo int not null
);

insert into biglietti (codcliente,tipopagamento,qtbiglietti,id_volo)
values ("CL002","bancomat",10,1),
("CL003","satispay",20,3),
("CL003","carta credito",10,4),
("CL001","satispay",40,3),
("CL004","punti volo",5,1);

