drop table biglietti;
create table if not exists biglietti(
	id int auto_increment primary key,
    tipo_pagamento char(50) not null,
    qt_richiesta int not null,
    cliente_id int not null,
    volo_id int not null
);

insert into biglietti(tipo_pagamento, qt_richiesta, cliente_id, volo_id)
values ("satispay",10,1,2),
("postepay",15,3,2),
("bitcoin",20,1,1),
("carta di credito",10,2,3);

drop table voli;
create table if not exists voli(
	id int auto_increment primary key,
    nome_volo varchar(50) not null,
    partenza varchar(50) not null,
    destinazione varchar (50) not null,
    data_volo date not null,
    ora_partenza char(5) not null,
    capienza int not null
);

insert into voli(nome_volo,partenza,destinazione,data_volo,ora_partenza,capienza)
values ("milbar","milano","barcellona","2023-06-23","20:00",200),
("torolb","torino","olbia","2023-07-21","21:00",300),
("romlax","roma","los angeles","2024-01-30","15:00",400),
("romams","roma","amsterdam","2024-05-15","10:00",250);

drop table clienti;
create table if not exists clienti(
	id int auto_increment primary key,
    nome varchar(50) not null,
    cognome varchar (50) not null
);

insert into clienti(nome, cognome)
values ("pippo","franco"),
("paolino","paperino"),
("laura","bianchi"),
("maria","rosa")

