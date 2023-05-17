DROP TABLE IF EXISTS Aereo;
CREATE TABLE Aereo (
   idAereo char(4) NOT NULL
  ,modello varchar(20)  NOT NULL
  ,capienza smallint  NOT NULL
  ,dataAcquisto date  NOT NULL
  ,PRIMARY KEY (idAereo)
 )
 ; 


DROP TABLE IF EXISTS Aereoporto;
CREATE TABLE Aereoporto (
   idAereoporto char(6) NOT NULL
  ,nome varchar(20)  NOT NULL
  ,citta varchar(20)  NOT NULL
  ,PRIMARY KEY (idAereoporto)
 )
 ; 

DROP TABLE IF EXISTS Volo;
CREATE TABLE Volo (
   idVolo char(7) NOT NULL
  ,oraPartenza char(4)  NOT NULL
  ,oraArrivo char(4)  NOT NULL
  ,luogoPartenza varchar(10)  NOT NULL
  ,luogoArrivo varchar(10)  NOT NULL
  ,PRIMARY KEY (idVolo)
 )
 ; 


DROP TABLE IF EXISTS Compagnia;
CREATE TABLE Compagnia (
    idCompagnia char(5) NOT NULL
   ,nome varchar(20) NOT NULL
   ,nazione varchar(20) NOT NULL
   ,hub char(10) NOT NULL
   ,PRIMARY KEY (idCompagnia)
 )
 ; 

DROP TABLE IF EXISTS Dipendente;
CREATE TABLE Dipendente (
    matricola char(5) NOT NULL
   ,nome varchar(30) NOT NULL
   ,cognome varchar(30) NOT NULL
   ,mansione smallint NOT NULL
   ,PRIMARY KEY (matricola)
 )
 ; 



DROP TABLE IF EXISTS Ticket;
CREATE TABLE Ticket (
    idTicket char(8) NOT NULL
   ,idCliente char(5) NOT NULL
   ,idCompagnia char(5) NOT NULL
   ,idVolo char(7) NOT NULL
   ,dtEmissione date NOT NULL
   ,prezzo smallint NOT NULL
  ,PRIMARY KEY (idTicket,idCliente)
 )
 ; 


DROP TABLE IF EXISTS Abilitazione;
CREATE TABLE Abilitazione (
   idAbil char(2) NOT NULL
  ,idAereo char(4) NOT NULL
  ,PRIMARY KEY (idAbil)
 )
 ; 


DROP TABLE IF EXISTS Cliente;
CREATE TABLE Cliente (
   idCliente char(5) NOT NULL
  ,nome varchar(20) NOT NULL
  ,cognome varchar(20) NOT NULL
  ,eta smallint NOT NULL
  ,email varchar(30)
  ,PRIMARY KEY (idCliente)
 )
 ; 


DROP TABLE IF EXISTS AereoEffettuaVolo;
CREATE TABLE AereoEffettuaVolo (
   idAereo char(4) NOT NULL
  ,idVolo char(7) NOT NULL
  ,oraPartenza char(2) NOT NULL
  ,PRIMARY KEY (idAereo, idVolo)
 )
 ; 


DROP TABLE IF EXISTS AereoportoVolo;
CREATE TABLE AereoportoVolo (
   idAereoporto char(6) NOT NULL
  ,idVolo char(7) NOT NULL
  ,parteOarriva char(1) NOT NULL
  ,PRIMARY KEY (idAereoporto, idVolo)
 )
 ; 

DROP TABLE IF EXISTS CompagniaPossiedeAereo;
CREATE TABLE CompagniaPossiedeAereo (
   idCompagnia char(5) NOT NULL
  ,idAereo char(4) NOT NULL
  ,dataAcquisto date NOT NULL
  ,prezzo smallint NOT NULL
  ,PRIMARY KEY (idCompagnia, idAereo)
 )
 ; 



DROP TABLE IF EXISTS DipPossiedeAbil;
CREATE TABLE DipPossiedeAbil (
   idDipendente char(5) NOT NULL
  ,idAbilitazione char(2) NOT NULL
  ,dataAbilitazione date NOT NULL
  ,rate smallint NOT NULL
  ,PRIMARY KEY (idDipendente, idAbilitazione)
 );
 
INSERT INTO dippossiedeabil (idDipendente, idAbilitazione, dataAbilitazione, rate) 
VALUES('DP001', 'A1', '2022-01-01', '8'),
('DP002', 'A4', '2020-01-01', '9'),
('DP003', 'A3', '2020-01-01', '9'),
('DP004', 'A2', '2021-01-01', '10'),
('DP005', 'A3', '2021-01-01', '6');

INSERT INTO compagniapossiedeaereo (idCompagnia, idAereo, dataAcquisto, prezzo) 
VALUES('CPN01', 'A001', '2023-05-01', 100),
('CPN02', 'A003', '2023-01-30', 200),
('CPN03', 'A004', '2021-08-01', 300),
('CPN04', 'A004', '2020-01-01', 100);

INSERT INTO aereoportovolo (idAereoporto, idVolo, parteOarriva) 
VALUES('AEP001', 'VL00001', 'P'),
('AEP002', 'VL00001', 'A'),
('AEP003', 'VL00004', 'P'),
('AEP005', 'VL00003', 'P');

INSERT INTO aereoeffettuavolo (idAereO, idVolo, oraPartenza) 
VALUES('A001', 'VL00001', '9'),
('A004', 'VL00002', '12'),
('A005', 'VL00002', '18'),
('A003', 'VL00003', '16'),
('A002', 'VL00005', '24');

INSERT INTO cliente (idCliente, nome, cognome, eta, email) 
VALUES('CL001', 'Simone', 'Di carlo', 25, 's.carlo@gmail.com'),
('CL002', 'Eugenio', 'Aloi', 30, 'e.aloi@gmail.com'),
('CL003', 'Facundo', 'Acosta', 28, 'f.acosta@gmail.com'),
('CL004', 'Josue', 'Condori', 26, 'j.condori@gmail.com'),
('CL005', 'Gabriele', 'Sucato', 21, 'g.sucato@gmail.com'),
('CL006', 'Samuele', 'Richetto', 31, 's.richetto@gmail.com'),
('CL007', 'Elisabetta', 'Penna', 31, 'e.penna@gmail.com'),
('CL008', 'Luca', 'Bodasca', 24, 'l.bodasca@gmail.com'),
('CL009', 'Antonio', 'Fiumano', 37, 'a.fiumano@gmail.com'),
('CL010', 'Chiara', 'Zaccone', 28, 'c.zaccone@gmail.com'),
('CL011', 'Roberto', 'Blasi', 29, 'r.blasi@gmail.com');

INSERT INTO abilitazione (idAbil, idAereo) 
VALUES('A1', 'A001'),
('A2', 'A002'),
('A3', 'A004'),
('A4', 'A003');

INSERT INTO ticket (idTicket, idCliente, idCompagnia, idVolo, dtEmissione, prezzo) 
VALUES('TCK00001', 'CL001', 'CPN01', 'VL00001', '2023-03-01', 100),
('TCK00002', 'CL002', 'CPN02', 'VL00001', '2023-06-01', 200),
('TCK00003', 'CL003', 'CPN03', 'VL00002', '2023-03-01',450),
('TCK00004', 'CL011', 'CPN05', 'VL00004', '2021-03-01', 300),
('TCK00005', 'CL010', 'CPN05', 'VL00003', '2023-05-01', 100),
('TCK00006', 'CL008', 'CPN03', 'VL00002', '2022-03-01', 900);

INSERT INTO dipendente (matricola, nome, cognome, mansione) 
VALUES('DP001', 'Mario', 'Rossi', 3),
('DP002', 'Michael', 'Schumacher', 1),
('DP003', 'Fernando', 'Alonso', 1),
('DP004', 'Michelle', 'Hunziker', 2),
('DP005', 'Miriam', 'Leone', 2),
('DP006', 'Diletta', 'Leotta', 2);

INSERT INTO compagnia (idCompagnia, nome, nazione, hub) 
VALUES('CPN01', 'Alitalia', 'it', 'HUB01'),
('CPN02', 'Emirates', 'uae', 'HUB02'),
('CPN03', 'British Airways', 'gb', 'HUB03'),
('CPN04', 'Wizz air', 'hu', 'HUB04');

INSERT INTO volo (idVolo, oraPartenza, oraArrivo, luogoPartenza, luogoArrivo) 
VALUES('VL00001', '15', '16', 'malpensa', 'cagliari'),
('VL00002', '16', '17', 'cagliari', 'torino'),
('VL00003', '18', '19', 'cagliari', 'malpensa'),
('VL00004', '12', '16', 'parigi', 'torino'),
('VL00005', '15', '19', 'linate', 'parigi');

INSERT INTO aereoporto (idAereoporto, nome, citta) 
VALUES('AEP001', 'linate', 'milano'),
('AEP002', 'malpensa', 'milano'),
('AEP003', 'elmas', 'cagliari'),
('AEP004', 'caselle', 'torino'),
('AEP005', 'charles de gaule', 'parigi');

INSERT INTO aereo (idAereo, modello, capienza, dataAcquisto)
 VALUES('A001', 'Boeing747', 180, '2009-01-01'),
 ('A002', 'Wings', 250, '2009-01-01'),
 ('A003', 'B298', 150, '2009-01-01'),
 ('A004', 'Boeing747', 300, '2009-01-01');



