create table if not exists voli(
	id_volo varchar(4) not null primary key,
    partenza varchar(50) not null,
    destinazione varchar(50)not null,
    data_volo date not null,
    orario_volo char(4) not null,
    posti_disp int not null,
    nome_volo varchar(50) not null
);

insert into voli (id_volo,partenza,destinazione, data_volo, orario_volo, posti_disp, nome_volo)
values ("VL01","milano","barcellona","2022-01-25","1500","200","mila-barc"),
("VL02","torino","cagliari","2022-12-25","1500","180","tor-cag"),
("VL03","roma","parigi","2023-04-25","1500","175","rom-par"),
("VL04","londra","torino","2020-06-21","1500","250","lon-tor");

create table if not exists clienti(
	cod_cliente varchar(4) primary key not null,
    nome varchar(50) not null,
    cognome varchar(50) not null
);

insert into clienti (cod_cliente,nome,cognome)
values ("CL01","Pippo","Franco"),
("CL02","Mario","Rossi"),
("CL03","Laura","Bianchi");

create table if not exists biglietti(
	cod_operazione int auto_increment primary key not null,
    cod_cliente varchar(4),
    tipo_pagamento varchar(20),
    qt_biglietti smallint,
    id_volo varchar(4)
);

insert into biglietti (cod_cliente,tipo_pagamento,qt_biglietti,id_volo)
values ("CL01","carta di credito",10,"VL01"),
("CL01","bancomat",30,"VL01"),
("CL02","bancomat",20,"VL02"),
("CL03","satispay",50,"VL03"),
("CL02","satispay",20,"VL02");

