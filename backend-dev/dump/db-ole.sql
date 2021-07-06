-- Adminer 4.6.3 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `name` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `salary` double DEFAULT NULL,
  `registration_date` date DEFAULT NULL,
  `address_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `person` (`name`, `id`, `salary`, `registration_date`) VALUES
('Rafael',	1,	3000,	'2018-02-10'),
('Bruno',	2,	20,	'2018-01-09'),
('Julio', 3, 1200, '2015-06-19');

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `public_place` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `number` varchar(10) DEFAULT NULL,
  `postal_code` varchar(20) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `neighborhood` varchar(50) DEFAULT NULL,
  `dweller_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_dweller_id` (`dweller_id`),
  CONSTRAINT `fk_dweller_id` FOREIGN KEY (`dweller_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  UNIQUE(`dweller_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `address` (`public_place`, `id`, `number`, `postal_code`, `city`, `state`, `neighborhood`, `dweller_id`) VALUES
('pb1',	1,	'1',	'pc1',	'city1',	'state1',	'nb1', 1),
('pb2',	2,	'2',	'pc2',	'c2',	's2',	'nb2', 2);

DROP TABLE IF EXISTS `animal`;
CREATE TABLE `animal` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `owner_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_owner_id` (`owner_id`),
  CONSTRAINT `fk_owner_id` FOREIGN KEY (`owner_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `animal` (`id`, `name`, `type`, `age`, `owner_id`) VALUES
(1,	'bobby',	'dog',	2,	1),
(10,	'Lilly',	'cat',	3,	2);

SET foreign_key_checks = 1;

-- 2018-10-04 13:12:25
