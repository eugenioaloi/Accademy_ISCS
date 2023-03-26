1- aule

create table aule (
 id int auto_increment,
 nome varchar(50) not null,
 edificio varchar(50) not null,
 piano varchar(50),
 capienza tinyint unsigned,
 pc_docente enum('si','no'),
 microfono_docente enum('si','no'),
 primary key(id)
);

2- libro

create table libro (
 id int auto_increment,
 titolo varchar(100) not null,
 prezzo decimal not null,
 pagine smallint,
 primary key(id)
);