CREATE TABLE IF NOT EXISTS `articolo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descrizione` varchar(100) DEFAULT NULL,
  `specifiche` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) 

INSERT INTO `articolo` VALUES (1,'tv samsung smart 32\"','{\"marca\": \"SAMSUNG\", \"pesoKg\": 5.5, \"uscite\": [\"HDMI\", \"USB\"], \"pollici\": 42, \"schermo\": \"OLED\"}'),(2,'TV PHILIPS SMART 55\"','{\"marca\": \"PHILIPS\", \"pesoKg\": 9.5, \"uscite\": [\"hdmi\", \"rca\", \"usb\", \"scart\"], \"pollici\": 55, \"schermo\": \"LED\"}'),(3,'TV SONY SMART 32\"','{\"marca\": \"SAMSUNG\", \"pesoKg\": 5.5, \"uscite\": \"HDMI\", \"pollici\": 42, \"schermo\": \"OLED\"}');

CREATE TABLE IF NOT EXISTS `aule` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `edificio` varchar(50) NOT NULL,
  `piano` varchar(50) DEFAULT NULL,
  `capienza` smallint DEFAULT NULL,
  `pc_docente` enum('si','no') DEFAULT NULL,
  `microfono_docente` enum('si','no') DEFAULT NULL,
  PRIMARY KEY (`id`)
) 

DROP TABLE IF EXISTS `contatti_studenti`;
/*!50001 DROP VIEW IF EXISTS `contatti_studenti`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `contatti_studenti` AS SELECT 
 1 AS `id`,
 1 AS `nome`,
 1 AS `cognome`,
 1 AS `email`*/;
SET character_set_client = @saved_cs_client;

CREATE TABLE IF NOT EXISTS `impiegato` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `cognome` varchar(30) DEFAULT NULL,
  `ruolo` varchar(30) DEFAULT NULL,
  `id_responsabile` int DEFAULT NULL,
  `stipendio` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sf_impiegato` (`id_responsabile`),
  CONSTRAINT `sf_impiegato` FOREIGN KEY (`id_responsabile`) REFERENCES `impiegato` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) 

INSERT INTO `impiegato` VALUES (1,'Mario','Rossi','tecnico',10,2500.00),(2,'Marco','Bianchi','amministrativo',7,1600.00),(3,'Paolo','Verdi','amministrativo',7,1600.00),(4,'Enrico','Marrone','venditore',8,1300.00),(5,'Nicola','Testa','venditore',8,1300.00),(6,'Franco','Barba','tecnico',1,1500.00),(7,'Elena','Totti','amministrativo',10,2600.00),(8,'Paola','Capra','venditore',10,2300.00),(9,'Mauro','Barba','venditore',8,1300.00),(10,'Oscar','Vecchio','tecnico',NULL,3000.00);

CREATE TABLE IF NOT EXISTS `studenti` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `genere` enum('m','f') DEFAULT NULL,
  `indirizzo` varchar(100) DEFAULT NULL,
  `citta` varchar(30) DEFAULT NULL,
  `provincia` char(2) DEFAULT 'to',
  `regione` varchar(30) DEFAULT 'piemonte',
  `email` varchar(100) NOT NULL,
  `data_nascita` date DEFAULT NULL,
  `ins` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  KEY `prov` (`provincia`),
  KEY `prov_cogn` (`provincia`,`cognome`),
  CONSTRAINT `ck_data_nascita` CHECK ((`data_nascita` < _utf8mb4'2005-03-29'))
) 

INSERT INTO `studenti` VALUES (1,'franco','rossi','m','via Tripoli 10','torino','TO','piemonte','franco.rossi@gmail.com','1978-10-01','2023-03-17 16:10:30'),(2,'mario','verdi','m','via Vicenza 17','asti','AT','piemonte','mario.verdi@gmail.com','1981-10-01','2023-03-17 16:10:30'),(3,'paolo','bianchi','m','via Volvera 47','asti','AT','piemonte','paolo.bianchi@gmail.com','1983-10-01','2023-03-17 16:10:30'),(4,'sara','rossi','f','corso Vigevano 301','cuneo','CN','piemonte','sara.rossi@gmail.com','1983-10-01','2023-03-17 16:10:30'),(5,'elisa','verdi','f','corso Francia 18','alessandria','AL','piemonte','elisa.verdi@gmail.com','1987-10-01','2023-03-17 16:10:30'),(6,'marco','bianchi','m','via Siccardi 3','novara','NO','piemonte','marcob@gmail.com','1993-10-01','2023-03-17 16:10:30'),(7,'franca','verdi','f','via MIlano 33','torino','TO','piemonte','fv@icloud.com','1993-10-01','2023-03-17 16:10:30'),(8,'mauro','bruni','m','via Roma 72','torino','TO','piemonte','mb@icloud.com','1988-10-01','2023-03-17 16:10:30'),(9,'osvaldo','rossi','m','via Firenze 5','torino','TO','piemonte','or@icloud.com','1987-01-02','2023-03-17 16:10:30'),(10,'oscar','verdi','m','lungo Dora Siena 34','torino','TO','piemonte','ov@icloud.com','1990-02-03','2023-03-17 16:10:30'),(11,'paola','bianchi','f','Corso Regina 300','torino','TO','piemonte','paolab@icloud.com','1985-03-04','2023-03-17 16:10:30'),(12,'franca','verdi','f','Corso Mortara 231','torino','TO','piemonte','francaverdi@icloud.com','1989-11-05','2023-03-17 16:10:30'),(13,'eleonora','verdi','f','via Bardonecchia 121','torino','TO','piemonte','ele@icloud.com','1989-12-06','2023-03-17 16:10:30'),(14,'enrico','macello','m','via Grosseto 125','asti','AT','piemonte','emacello@gmail.com','1983-10-01','2023-03-17 16:10:30'),(15,'fabio','baggio','m','via Dogliani 7','cuneo','CN','piemonte','fbaggio@gmail.com','1983-10-01','2023-03-17 16:10:30'),(16,'francesco','gamba','m','via Torino 1','alessandria','AL','piemonte','gamba@gmail.com','1987-10-01','2023-03-17 16:10:30'),(17,'marco','demarchi','m','via Napoli 10','novara','NO','piemonte','marcodem@gmail.com','1993-10-01','2023-03-17 16:10:30'),(18,'franca','verdone','f','via Parma 9','torino','TO','piemonte','fverdone@gmail.com','1994-09-01','2023-03-17 16:10:30'),(19,'marco','zippo','m','via Palermo 19','torino','TO','piemonte','zippo@gmail.com','1995-11-01','2023-03-17 16:10:30'),(20,'giorgio','galvani','m','via Reggio 9','cuneo','cn','piemonte','ggalv@icloud.com','1996-02-01','2023-03-17 16:10:30'),(21,'alex','porro','m','via Verona 13','asti','at','piemonte','porroale@gmail.com','1989-10-01','2023-03-17 16:10:30'),(22,'andrea','giorgio','f','via Bava 9','torino','TO','piemonte','giorgia@icloud.com','1998-02-01','2023-03-17 16:10:30'),(23,'paola','valeri','f','via Balbo 65','novara','no','piemonte','valerip@gamil.com','1992-10-09','2023-03-17 16:10:30'),(24,'federico','rossi','m','via Venezia 3','alessandria','al','piemonte','federoss@icloud.com','1994-08-08','2023-03-17 16:10:30'),(25,'irene','storti','f','corso vittorio 30','torino','TO','piemonte','stortii@gmail.com','1999-09-09','2023-03-17 16:10:30'),(26,'samuele','borsa','m','via Pio 9','torino','TO','piemonte','borsamu@gmail.com','1992-02-02','2023-03-17 16:10:30'),(27,'Luigi','Verdi','m','Via Garibaldi 2','Asti','AT','Piemonte','luigi.verdi@gmail.com','1999-06-03','2023-03-31 13:42:11'),(28,'Martina','Bianchi','f','Via Dante 3','Cuneo','CN','Piemonte','martina.bianchi@gmail.com','2001-01-23','2023-03-31 13:42:11'),(29,'Giulia','Neri','f','Via Mazzini 4','Alessandria','AL','Piemonte','giulia.neri@gmail.com','1996-07-15','2023-03-31 13:42:11'),(30,'Giovanni','Russo','m','Via Montegrappa 5','Novara','NO','Piemonte','giovanni.russo@gmail.com','1997-09-27','2023-03-31 13:42:11'),(31,'Luisa','Ferrari','f','Via Garibaldi 6','Vercelli','VC','Piemonte','luisa.ferrari@gmail.com','1998-04-10','2023-03-31 13:42:11'),(32,'Simone','Rossi','m','Via Roma 7','Torino','TO','Piemonte','simone.rossi@gmail.com','1992-11-02','2023-03-31 13:42:11'),(33,'Francesca','Verdi','f','Via Garibaldi 8','Asti','AT','Piemonte','francesca.verdi@gmail.com','1994-12-18','2023-03-31 13:42:11'),(34,'Alessandro','Bianchi','m','Via Dante 9','Cuneo','CN','Piemonte','alessandro.bianchi@gmail.com','1990-05-25','2023-03-31 13:42:11'),(35,'Sara','Neri','f','Via Mazzini 10','Alessandria','AL','Piemonte','sara.neri@gmail.com','1993-08-30','2023-03-31 13:42:11'),(36,'Fabio','Russo','m','Via Montegrappa 11','Novara','NO','Piemonte','fabio.russo@gmail.com','1989-03-12','2023-03-31 13:42:11'),(37,'Laura','Ferrari','f','Via Garibaldi 12','Vercelli','VC','Piemonte','laura.ferrari@gmail.com','1991-12-01','2023-03-31 13:42:11'),(38,'Antonio','Rossi','m','Via Roma 13','Torino','TO','Piemonte','antonio.rossi@gmail.com','1998-05-09','2023-03-31 13:42:11'),(39,'Mario','Rossi','m','Via Roma 1','Torino','TO','Piemonte','mario.rossi@esempio.com','1990-05-15','2023-03-17 16:10:30'),(40,'Giulia','Verdi','f','Via Garibaldi 2','Asti','AT','Piemonte','giulia.verdi@esempio.com','1995-06-12','2023-03-17 16:10:30'),(41,'Lorenzo','Bianchi','m','Corso Italia 3','Cuneo','CN','Piemonte','lorenzo.bianchi@esempio.com','1999-07-18','2023-03-17 16:10:30'),(42,'Alessia','Neri','f','Via Mazzini 4','Alessandria','AL','Piemonte','alessia.neri@esempio.com','1994-08-20','2023-03-17 16:10:30'),(43,'Paolo','Rizzo','m','Via Garibaldi 5','Novara','NO','Piemonte','paolo.rizzo@esempio.com','1998-09-27','2023-03-17 16:10:30'),(44,'Laura','Conti','f','Piazza Vittorio Emanuele II 6','Vercelli','VC','Piemonte','laura.conti@esempio.com','1992-10-08','2023-03-17 16:10:30'),(45,'Federico','Galli','m','Via Monte Napoleone 7','Milano','MI','Lombardia','federico.galli@esempio.com','1997-11-11','2023-03-17 16:10:30'),(46,'Martina','Ferrari','f','Via Manzoni 8','Monza','MB','Lombardia','martina.ferrari@esempio.com','1993-12-19','2023-03-17 16:10:30'),(47,'Simone','Marini','m','Via XX Settembre 9','Bergamo','BG','Lombardia','simone.marini@esempio.com','1991-01-24','2023-03-17 16:10:30'),(48,'Valentina','Riva','f','Corso Garibaldi 10','Pavia','PV','Lombardia','valentina.riva@esempio.com','1996-02-21','2023-03-17 16:10:30'),(49,'Andrea','Costa','m','Piazza del Popolo 11','Como','CO','Lombardia','andrea.costa@esempio.com','2000-03-30','2023-03-17 16:10:30'),(50,'Sara','Santoro','f','Via Sempione 12','Torino','TO','Piemonte','sara.santoro@esempio.com','1998-10-05','2023-03-17 16:10:30'),(51,NULL,'rossi',NULL,NULL,NULL,'to','piemonte','rmarco@gmail.com','1992-02-29','2023-03-31 13:38:52');

DROP TABLE IF EXISTS `studenti_to`;
/*!50001 DROP VIEW IF EXISTS `studenti_to`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `studenti_to` AS SELECT 
 1 AS `nome`,
 1 AS `cognome`,
 1 AS `indirizzo`,
 1 AS `citta`,
 1 AS `provincia`,
 1 AS `regione`,
 1 AS `email`,
 1 AS `data_nascita`*/;
SET character_set_client = @saved_cs_client;


--  view `contatti_studenti`

/* VIEW `contatti_studenti` AS select `studenti`.`id` AS `id`,`studenti`.`nome` AS `nome`,`studenti`.`cognome` AS `cognome`,`studenti`.`email` AS `email` from `studenti` */;


--  view structure for view `studenti_to`

/*  VIEW `studenti_to` AS select `studenti`.`nome` AS `nome`,`studenti`.`cognome` AS `cognome`,`studenti`.`indirizzo` AS `indirizzo`,`studenti`.`citta` AS `citta`,`studenti`.`provincia` AS `provincia`,`studenti`.`regione` AS `regione`,`studenti`.`email` AS `email`,`studenti`.`data_nascita` AS `data_nascita` from `studenti` where (`studenti`.`provincia` = 'to') */;

