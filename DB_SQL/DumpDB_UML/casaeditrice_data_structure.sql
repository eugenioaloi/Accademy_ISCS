CREATE TABLE IF NOT EXISTS `autore` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `nazionalita` char(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 

INSERT INTO `autore` VALUES (1,'John Ronald Reuel','Tolkien','za'),(2,'Dan','Brown','us'),(3,'Paulo','Coelho','br'),(4,'J. D.','Salinger','us'),(5,'Agatha','Christie','en'),(6,'J. K.','Rowling','en'),(7,'Tsao','Chan','cn'),(8,'E. L.','James','en'),(9,'Antoine','de Saint-Exup?ry','fr'),(10,'Charles','Dickens','en'),(11,'Miguel','de Cervantes','es'),(12,'Clive Staples','Lewis','en'),(13,'Tse-tung','Mao','cn'),(14,'Michele','Rech, Zerocalcare','it'),(15,'Andrea','Camilleri','it'),(16,'Ken','Follett','en'),(17,'Kazuo','Ishiguro','jp'),(18,'Carlo','Fruttero','it'),(19,'Franco','Lucentini','it'),(20,'Italo','Calvino','it'),(21,'Stephen','King','us'),(22,'Isabel','Allende','cl');

CREATE TABLE IF NOT EXISTS `autore_libro` (
  `libro_id` int NOT NULL,
  `autore_id` int NOT NULL,
  PRIMARY KEY (`libro_id`,`autore_id`),
  KEY `fk_al_autore` (`autore_id`),
  CONSTRAINT `fk_al_autore` FOREIGN KEY (`autore_id`) REFERENCES `autore` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk_al_libro` FOREIGN KEY (`libro_id`) REFERENCES `libro` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
)

INSERT INTO `autore_libro` VALUES (11,1),(15,1),(6,2),(17,2),(1,3),(7,4),(3,5),(5,6),(12,7),(2,8),(10,9),(20,10),(4,11),(8,12),(9,13),(16,14),(19,15),(13,16),(18,17),(14,18),(14,19),(21,20),(22,21);

CREATE TABLE IF NOT EXISTS `editore` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 

INSERT INTO `editore` VALUES (1,'Mondadori','info-mondadori@gmail.com'),(3,'Einaudi','amm-einaudi@gmail.com'),(4,'Salani','salani-info@gmail.com'),(5,'Edizioni Clandestine','clandestine-info@gmail.com'),(6,'Bao Publishing','bao_editore@gmail.com'),(7,'Sellerio','amm-sellerio@gmail.com'),(8,'BUR','bur_editore@gmail.com'),(9,'Sperling & Kupfer','sperling-info@gmail.com'),(10,'Bompiani','contact-bompiani@gmail.com'),(11,'Adelphi','adelphi-info@gmail.com');

CREATE TABLE IF NOT EXISTS `libro` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titolo` varchar(100) DEFAULT NULL,
  `prezzo` decimal(6,2) DEFAULT NULL,
  `pagine` smallint DEFAULT NULL,
  `editore_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_libro_editore` (`editore_id`),
  CONSTRAINT `fk_libro_editore` FOREIGN KEY (`editore_id`) REFERENCES `editore` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `ck_pagine` CHECK ((`pagine` > 0)),
  CONSTRAINT `ck_prezzo` CHECK ((`prezzo` > 0))
) 

INSERT INTO `libro` VALUES (1,'Alchimista (L\')',12.00,10,1),(2,'Cinquanta sfumature di grigio',10.20,560,1),(3,'Dieci piccoli indiani',10.20,208,1),(4,'Don Chisciotte della Mancha',20.40,NULL,3),(5,'Harry Potter e la Pietra Filosofale',8.50,302,4),(6,'Il Codice da Vinci',11.00,512,1),(7,'Il giovane Holden',10.20,251,3),(8,'Il leone, la strega e l\'armadio',7.65,182,1),(9,'Il libretto rosso',7.22,160,5),(10,'Il Piccolo Principe',4.25,95,1),(11,'Il Signore degli Anelli: La compagnia dell\'anello. Le due torri. Il ritorno del re',25.00,1255,10),(12,'Il sogno della camera rossa. Romanzo cinese del XVIII secolo',15.30,721,3),(13,'La colonna di fuoco',27.00,912,1),(14,'La donna della domenica',12.00,434,1),(15,'Lo Hobbit',9.35,417,10),(16,'Macerie prime',14.45,192,6),(17,'Origin',21.25,564,1),(18,'Quel che resta del giorno',12.00,276,3),(19,'Un mese con Montalbano',12.75,512,7),(20,'Una storia tra due città',9.77,600,10),(21,'Marcovaldo',10.00,120,7),(22,'IT',25.00,550,9),(23,'gomorra',12.59,345,1);