-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: sql.freedb.tech    Database: freedb_FSD-09
-- ------------------------------------------------------
-- Server version	8.0.34-0ubuntu0.22.04.1

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
-- Table structure for table `Movies`
--

DROP TABLE IF EXISTS `Movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Movies` (
  `id` int NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `year` int DEFAULT NULL,
  `rating` decimal(10,1) DEFAULT NULL,
  `director` varchar(45) DEFAULT NULL,
  `cast` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Movies`
--

LOCK TABLES `Movies` WRITE;
/*!40000 ALTER TABLE `Movies` DISABLE KEYS */;
INSERT INTO `Movies` VALUES (1,'The Shawshank Redemption','Drama',1994,9.3,'Frank Darabont','Tim Robbins, Morgan Freeman, Bob Gunton'),(2,'The Godfather','Crime, Drama',1972,9.2,'Francis Ford Cappola','Marlon Brando, Al Pacino, James Caan'),(3,'The Dark Knight','Action, Crime, Drama',2008,9.0,'Christopher Nolan','Christian Bale, Heath Ledger, Aaron Eckhart'),(4,'The Godfather Part II','Crime, Drama',1974,9.0,'Francis Ford Coppola','Al Pacino, Robert Duvall, Diane Keaton, Rober'),(5,'12 Angry Men','Crime, Drama',1957,9.0,'Sidney Lumet','Martin Balsam, John Fiedler, Lee J. Cobb'),(6,'Schindler\'s List','Biography, Drama, History',1993,9.0,'Steven Spielberg','Liam Neeson, Ben Kingsley, Ralph Fiennes'),(7,'The Lord of the Rings: The Return of the King','Action, Adventure, Drama',2003,9.0,'Peter Jackson','Elijah Wood, Viggo Mortensen, Ian McKellen'),(8,'Pulp Fiction','Crime, Drama',1994,8.9,'Quentin Tarantino','John Travolta, Uma Thurman, Samuel L. Jackson'),(9,'The Lord of the Rings: The Fellowship of the ','Action, Adventure, Drama',2001,8.8,'Peter Jackson','Elijah Wood, Orlando Bloom, Ian McKellen'),(10,'The Good, the Bad and the Ugly','Adventure, Western',1996,8.8,'Sergio Leone','Clint Eastwood, Eli Wallach, Lee Van Cleef');
/*!40000 ALTER TABLE `Movies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-10  3:48:00
