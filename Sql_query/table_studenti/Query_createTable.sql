CREATE TABLE `studenti`
	 ( `id` int NOT NULL AUTO_INCREMENT,
		`nome` varchar(30) DEFAULT NULL,
	 	 `cognome` varchar(50) DEFAULT NULL,
		  `genere` enum(\'m\',\'f\') DEFAULT NULL,
		  `indirizzo` varchar(100) DEFAULT NULL,
		  `citta` varchar(30) DEFAULT NULL,
		  `provincia` char(2) DEFAULT \'to\',
		  `regione` varchar(30) DEFAULT \'piemonte\',
		  `email` varchar(100) NOT NULL,
		  `data_nascita` date DEFAULT NULL,
		  `ins` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
		   PRIMARY KEY (`id`),
		   UNIQUE KEY `email` (`email`)
	 ); 
