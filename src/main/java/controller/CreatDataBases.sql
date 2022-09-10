CREATE database db_user;

use db_user;

CREATE TABLE `tb_user` (
  `id_user` int NOT NULL AUTO_INCREMENT,
  `ds_name` varchar(100) NOT NULL,
  `nm_age` int NOT NULL,
  `nm_user_name` varchar(100) NOT NULL,
  `ds_email` varchar(100) NOT NULL,
  `ds_password` varchar(100) NOT NULL,
  PRIMARY KEY (`id_user`)
);

CREATE TABLE `tb_data_user` (
  `id_data_user` int NOT NULL AUTO_INCREMENT,
  `nm_cpf` varchar(11) NOT NULL,
  `nm_credit_card` varchar(15) NOT NULL,
  `nm_cod` varchar(3) NOT NULL,
  `fk_user` int NOT NULL,
  PRIMARY KEY (`id_data_user`),
  KEY `tb_data_user_FK` (`fk_user`),
  CONSTRAINT `tb_data_user_FK` FOREIGN KEY (`fk_user`) REFERENCES `tb_user` (`id_user`) ON DELETE CASCADE
);
