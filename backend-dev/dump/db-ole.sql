ALTER TABLE `address` DROP FOREIGN KEY `fk_dweller_id`;
ALTER TABLE `animal` DROP FOREIGN KEY `fk_owner_id`;

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `name` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `salary` double DEFAULT NULL,
  `registration_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `public_place` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `number` varchar(10) DEFAULT NULL,
  `postal_code` varchar(20) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `neighborhood` varchar(50) DEFAULT NULL,
  `dweller_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `animal`;
CREATE TABLE `animal` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `owner_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_c

ALTER TABLE `address`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_dweller_id` (`dweller_id`);

ALTER TABLE `animal`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_owner_id` (`owner_id`);

ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `animal`
  ADD CONSTRAINT `fk_owner_id` FOREIGN KEY (`owner_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE `address`
  ADD CONSTRAINT `fk_dweller_id` FOREIGN KEY (`dweller_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE; 
  
INSERT INTO `person` (`name`, `id`, `salary`, `registration_date`) VALUES
('Rafael', 1, 1200, '2017-10-09'),
('Bruno', 2, 20, '2018-01-09');

INSERT INTO `address` (`public_place`, `id`, `number`, `postal_code`, `city`, `state`, `neighborhood`, `dweller_id`) VALUES
('pb1', 1, '1', 'pc1', 'city1', 'state1', 'nb1', 1),
('pb2', 2, '2', 'pc2', 'c2', 's2', 'nb2', 1),
('pb3', 3, '3', 'pc3', 'c3', 's3', 'nb3', 2); 

INSERT INTO `animal` (`id`, `name`, `type`, `age`, `owner_id`) VALUES
(1, 'Bobby', 'dog', 14, 1),
(10, 'Lilly', 'cat', 3, 2);