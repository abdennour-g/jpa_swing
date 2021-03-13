create database myData default character set utf8;
DROP TABLE IF EXISTS person;
CREATE TABLE IF NOT EXISTS person (
  id int(11) NOT NULL AUTO_INCREMENT,
  cin int(11) NOT NULL,
  email varchar(255) DEFAULT NULL,
  nom varchar(255) DEFAULT NULL,
  prenom varchar(255) DEFAULT NULL,
  tel varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


INSERT INTO person (id, cin, email, nom, prenom, tel) VALUES
(1, 444, 'abdou@gmail.com', 'bouaicha', 'abdennour', '7777'),
(2, 777, 'yahya@gmail.com', 'alami', 'yahya', '3333'),
(3, 999, 'rachid@hotmail.com', 'youssfi', 'rachid', '66666'),
(4, 888, 'moad@y', 'hassani', 'moad', '7456');


