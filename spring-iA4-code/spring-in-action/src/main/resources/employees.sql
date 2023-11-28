
CREATE DATABASE testdb;

USE testdb;

CREATE TABLE `Employee` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO Employee VALUES(1, 'VINOD', 'ADMIN');

COMMIT;

SELECT * FROM Employee;