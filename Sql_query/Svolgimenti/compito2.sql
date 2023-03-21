1- aule

create table aule (
 id int auto_increment,
 nome varchar(50) not null,
 edificio varchar(50) not null,
 piano varchar(50),
 capienza smallint unsigned,
 pc_docente enum('si','no'),
microfono_docente enum('si','no'),
 primary key(id)
);

2- libro

create table libro (
 id int auto_increment,
 titolo varchar(50) not null,
 prezzo int not null,
 pagine int,
 primary key(id)
);