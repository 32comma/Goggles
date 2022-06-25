CREATE DATABASE IF NOT EXISTS `goggles` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `goggles`;

CREATE TABLE IF NOT EXISTS `data` (  
`key` varchar(256) CHARACTER SET utf8mb3 COLLATE utf8_general_ci NOT NULL, 
`category` varchar(256) DEFAULT NULL,   `value` text,   PRIMARY KEY (`key`) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE IF NOT EXISTS `favorite` (
  `key` varchar(256) DEFAULT NULL,
  `id` varchar(256) DEFAULT NULL,
  `category` varchar(256) DEFAULT NULL,
  `value` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


CREATE TABLE IF NOT EXISTS `member` (
  `num` int NOT NULL AUTO_INCREMENT,
  `id` varchar(256) DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `name` varchar(256) DEFAULT NULL,
  `location` varchar(256) DEFAULT NULL,
  `etc` text,
  `phone` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`num`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;


CREATE TABLE IF NOT EXISTS `qna` (
  `id` varchar(256) DEFAULT NULL,
  `title` varchar(256) DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `category` varchar(256) DEFAULT NULL,
  `q` text,
  `a` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
INSERT INTO `data` (`key`, `category`, `value`) VALUES
	('key1', 'category1', 'value1'),
	('key2', 'category1', 'value2'),
	('key3', 'category2', 'value3'),
	('key4', 'category2', 'value4');

INSERT INTO `favorite` (`key`, `id`, `category`, `value`) VALUES
	('key1', 'id1', 'category1', 'value1'),
	('key2', 'id1', 'category1', 'value2'),
	('key4', 'id1', 'category2', 'value4');

INSERT INTO `member` (`num`, `id`, `email`, `password`, `name`, `location`, `etc`, `phone`) VALUES
	(1, 'id1', 'id@test.com', '1234', 'name1', 'location1', 'etc1', 'phone1');

INSERT INTO `qna` (`id`, `title`, `email`, `category`, `q`, `a`) VALUES
	('id1', 'title1', 'email1', 'category1', 'q1', 'a1');
