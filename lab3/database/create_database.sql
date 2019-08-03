CREATE TABLE `login` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
)

INSERT INTO login (username, password) VALUES ("admin", "1234");
