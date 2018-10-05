ALTER TABLE `person` DROP FOREIGN KEY `fk_address_id`;
ALTER TABLE `animal` DROP FOREIGN KEY `fk_owner_id`;

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `public_place` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `number` varchar(10) DEFAULT NULL,
  `postal_code` varchar(20) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `neighborhood` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `address`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `name` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `salary` double DEFAULT NULL,
  `registration_date` date DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `person`
--

DROP TABLE IF EXISTS `animal`;
CREATE TABLE `animal` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `owner_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `animal`
--

ALTER TABLE `address`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `animal`
--
ALTER TABLE `animal`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_owner_id` (`owner_id`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_address_id` (`address_id`);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `animal`
--
ALTER TABLE `animal`
  ADD CONSTRAINT `fk_owner_id` FOREIGN KEY (`owner_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `person`
--
ALTER TABLE `person`
  ADD CONSTRAINT `fk_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

INSERT INTO `address` (`public_place`, `id`, `number`, `postal_code`, `city`, `state`, `neighborhood`) VALUES
('pb1', 1, '1', 'pc1', 'city1', 'state1', 'nb1'),
('pb2', 2, '2', 'pc2', 'c2', 's2', 'nb2'),
('pb3', 3, '3', 'pc3', 'c3', 's3', 'nb3');  
  
INSERT INTO `person` (`name`, `id`, `salary`, `registration_date`, `address_id`) VALUES
('Rafael', 1, 1200, '2017-10-09', 1),
('Bruno', 2, 20, '2018-01-09', 2);

INSERT INTO `animal` (`id`, `name`, `type`, `age`, `owner_id`) VALUES
(1, 'Bobby', 'dog', 14, 1),
(10, 'Lilly', 'cat', 3, 2);