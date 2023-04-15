CREATE TABLE IF NOT EXISTS `corsi` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titolo` varchar(100) NOT NULL,
  `prezzo` decimal(6,2) NOT NULL,
  `docente_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_CORSI_DOCENTI` (`docente_id`),
  CONSTRAINT `FK_CORSI_DOCENTI` FOREIGN KEY (`docente_id`) REFERENCES `docenti` (`id`) ON UPDATE CASCADE
) 

INSERT INTO `corsi` VALUES (1,'Introduzione alla programmazione',200.00,1),(2,'Basi di dati',150.00,2),(3,'java',250.00,1),(4,'CSS',150.00,5),(5,'HTML',120.00,5),(6,'Wordpress',100.00,6),(7,'PHP',220.00,1),(8,'React',250.00,7),(9,'angular',250.00,NULL);

CREATE TABLE IF NOT EXISTS `docenti` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) 

INSERT INTO `docenti` VALUES (1,'Paolo','Verdi','paolo.verdi@email.com'),(2,'Maria','Neri','maria.neri@email.com'),(5,'Paolo','Rossi','pr@icloud.com'),(6,'Marco','Bruni','mr@icloud.com'),(7,'Emilio','Re','aemiluis@gmail.com'),(8,'Dario','Vecchio','dvecchio@icloud.com'),(9,'Mauro','Brusa','mbrusa@gmail.com');

CREATE TABLE  IF NOT EXISTS `iscrizioni` (
  `id` int NOT NULL AUTO_INCREMENT,
  `studente_id` int NOT NULL,
  `corso_id` int NOT NULL,
  `data` date NOT NULL,
  `prezzo` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_STUDENTI_ISCRIZIONI` (`studente_id`),
  KEY `FK_CORSi_ISCRIZIONI` (`corso_id`),
  CONSTRAINT `FK_CORSi_ISCRIZIONI` FOREIGN KEY (`corso_id`) REFERENCES `corsi` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `FK_STUDENTI_ISCRIZIONI` FOREIGN KEY (`studente_id`) REFERENCES `studenti` (`id`) ON UPDATE CASCADE
) 

INSERT INTO `iscrizioni` VALUES (1,1,1,'2022-01-20',200),(2,1,2,'2022-02-05',150),(3,2,1,'2022-02-10',200),(4,3,1,'2022-01-20',200),(5,4,1,'2022-01-20',200),(6,5,1,'2022-01-20',200),(7,6,1,'2022-01-20',200),(8,7,1,'2022-01-20',200),(9,8,1,'2022-01-20',200),(10,9,2,'2022-01-20',150),(11,10,2,'2022-01-20',150),(12,11,2,'2022-01-20',150),(13,12,2,'2022-01-20',150),(14,13,2,'2022-01-20',150),(15,14,2,'2022-01-20',150),(16,4,2,'2022-01-20',150),(17,5,2,'2022-01-20',150),(18,6,2,'2022-01-20',150),(19,1,3,'2022-01-20',250),(20,2,3,'2022-01-20',250),(21,3,3,'2022-01-20',250),(22,15,3,'2022-01-20',250),(23,16,3,'2022-01-20',250),(24,17,3,'2022-01-20',250),(25,18,3,'2022-01-20',250),(26,19,3,'2022-01-20',250),(27,20,3,'2022-01-20',250),(28,8,3,'2022-01-20',250),(29,21,4,'2022-01-20',150),(30,22,4,'2022-01-20',150),(31,23,4,'2022-01-20',150),(32,24,4,'2022-01-20',150),(33,25,4,'2022-01-20',150),(34,10,5,'2022-01-20',120),(35,11,5,'2022-01-20',120),(36,13,5,'2022-01-20',120),(37,14,5,'2022-01-20',120),(38,15,5,'2022-01-20',120),(39,26,5,'2022-01-20',120);

CREATE TABLE  IF NOT EXISTS `studenti` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `data_registrazione` date NOT NULL,
  PRIMARY KEY (`id`)
) 

INSERT INTO `studenti` VALUES (1,'Mario','Rossi','mario.rossi@email.com','2022-01-15'),(2,'Luca','Bianchi','luca.bianchi@email.com','2022-02-01'),(3,'Mario','Rossi','mario.rossi@email.com','2022-01-15'),(4,'Luca','Bianchi','luca.bianchi@email.com','2022-02-01'),(5,'franco','rossi','franco.rossi@gmail.com','2022-02-12'),(6,'mario','verdi','mario.verdi@gmail.com','2022-02-12'),(7,'paolo','bianchi','paolo.bianchi@gmail.com','2022-02-12'),(8,'sara','rossi','sara.rossi@gmail.com','2022-02-12'),(9,'elisa','verdi','elisa.verdi@gmail.com','2022-02-12'),(10,'marco','bianchi','marcob@gmail.com','2022-02-12'),(11,'franca','verdi','fv@icloud.com','2022-02-12'),(12,'mauro','bruni','mb@icloud.com','2022-02-12'),(13,'osvaldo','rossi','or@icloud.com','2022-02-12'),(14,'oscar','verdi','ov@icloud.com','2022-02-12'),(15,'paola','bianchi','paolab@icloud.com','2022-02-12'),(16,'franca','verdi','francaverdi@icloud.com','2022-02-12'),(17,'eleonora','verdi','ele@icloud.com','2022-02-12'),(18,'enrico','macello','emacello@gmail.com','2022-02-12'),(19,'fabio','baggio','fbaggio@gmail.com','2022-02-12'),(20,'francesco','gamba','gamba@gmail.com','2022-02-12'),(21,'marco','demarchi','marcodem@gmail.com','2022-02-12'),(22,'franca','verdone','fverdone@gmail.com','2022-02-12'),(23,'marco','zippo','zippo@gmail.com','2022-02-12'),(24,'giorgio','galvani','ggalv@icloud.com','2022-02-12'),(25,'alex','porro','porroale@gmail.com','2022-02-12'),(26,'andrea','giorgio','giorgia@icloud.com','2022-02-12'),(27,'paola','valeri','valerip@gamil.com','2022-02-12'),(28,'federico','rossi','federoss@icloud.com','2022-02-12'),(29,'irene','storti','stortii@gmail.com','2022-02-12'),(30,'samuele','borsa','borsamu@gmail.com','2022-02-12'),(31,'Luigi','Verdi','luigi.verdi@example.com','2022-02-12'),(32,'Martina','Bianchi','martina.bianchi@example.com','2022-02-12'),(33,'Giulia','Neri','giulia.neri@example.com','2022-02-12'),(34,'Giovanni','Russo','giovanni.russo@example.com','2022-02-12'),(35,'Luisa','Ferrari','luisa.ferrari@example.com','2022-02-12'),(36,'Simone','Rossi','simone.rossi@example.com','2022-02-12'),(37,'Francesca','Verdi','francesca.verdi@example.com','2022-02-12'),(38,'Alessandro','Bianchi','alessandro.bianchi@example.com','2022-02-12'),(39,'Sara','Neri','sara.neri@example.com','2022-02-12'),(40,'Fabio','Russo','fabio.russo@example.com','2022-02-12'),(41,'Laura','Ferrari','laura.ferrari@example.com','2022-02-12'),(42,'Antonio','Rossi','antonio.rossi@example.com','2022-02-12'),(43,'Mario','Rossi','mario.rossi@esempio.com','2022-02-12'),(44,'Giulia','Verdi','giulia.verdi@esempio.com','2022-02-12'),(45,'Lorenzo','Bianchi','lorenzo.bianchi@esempio.com','2022-02-12'),(46,'Alessia','Neri','alessia.neri@esempio.com','2022-02-12'),(47,'Paolo','Rizzo','paolo.rizzo@esempio.com','2022-02-12'),(48,'Laura','Conti','laura.conti@esempio.com','2022-02-12'),(49,'Federico','Galli','federico.galli@esempio.com','2022-02-12'),(50,'Martina','Ferrari','martina.ferrari@esempio.com','2022-02-12'),(51,'Simone','Marini','simone.marini@esempio.com','2022-02-12'),(52,'Valentina','Riva','valentina.riva@esempio.com','2022-02-12'),(53,'Andrea','Costa','andrea.costa@esempio.com','2022-02-12'),(54,'Sara','Santoro','sara.santoro@esempio.com','2022-02-12');

