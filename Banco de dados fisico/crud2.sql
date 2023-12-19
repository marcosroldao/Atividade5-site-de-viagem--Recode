CREATE DATABASE  IF NOT EXISTS `crud2` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `crud2`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: crud2
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` bigint NOT NULL AUTO_INCREMENT,
  `cep` varchar(255) NOT NULL,
  `cpf` bigint DEFAULT NULL,
  `datacadastro` date DEFAULT NULL,
  `e_mail` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `nomecompleto` varchar(255) DEFAULT NULL,
  `senha` varchar(255) NOT NULL,
  `telefone` bigint DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'5234578',12435678,'2023-01-13','pedro@gmail.com','Avenida 1','Pedro Gonçalves','112222',22134211),(15,'749991',299919191,'2023-12-12','marcos.b@outlook.com','avenida d','Marcos b.','112211123221',12995022789),(19,'12321121',13456711233,'2023-12-17','ricardoc@gmail.com','avenida goias','Ricardo C.','11122121',111221121);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passagem`
--

DROP TABLE IF EXISTS `passagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passagem` (
  `id_passagem` bigint NOT NULL AUTO_INCREMENT,
  `data_de_ida` varchar(255) DEFAULT NULL,
  `data_de_volta` varchar(255) DEFAULT NULL,
  `destino` varchar(255) DEFAULT NULL,
  `empresa` varchar(255) DEFAULT NULL,
  `horario_da_ida` varchar(255) DEFAULT NULL,
  `horario_da_volta` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_passagem`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passagem`
--

LOCK TABLES `passagem` WRITE;
/*!40000 ALTER TABLE `passagem` DISABLE KEYS */;
INSERT INTO `passagem` VALUES (1,'2023-01-01','2023-01-13','cuiaba','avianca','10:00 ','12:00 '),(4,'02-12-2023','08-12-2023','goias','fly emirates','10:00 ','13:00 '),(9,'07-12-2023','09-12-2023','paraná','la tam','19:28','19:30'),(12,'17-12-2023','18-12-2023','alagoas','American Airlines','21:51','20:52');
/*!40000 ALTER TABLE `passagem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reserva` (
  `id_reserva` bigint NOT NULL AUTO_INCREMENT,
  `data_de_ida` date DEFAULT NULL,
  `data_de_volta` date DEFAULT NULL,
  `destino` varchar(255) DEFAULT NULL,
  `origem` varchar(255) DEFAULT NULL,
  `preco` bigint DEFAULT NULL,
  PRIMARY KEY (`id_reserva`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (1,'2023-12-06','2023-12-30','natal','salvador',560),(3,'2023-01-01','2023-01-12','alagoas','osasco',1400),(28,'2023-12-07','2023-12-01','ribeirao preto','anapolis',3227),(30,'2023-12-17','2023-12-18','salvador','sao paulo',1610);
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-18 20:58:41
