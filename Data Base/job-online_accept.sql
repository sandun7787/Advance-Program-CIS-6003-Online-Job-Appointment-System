-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: job-online
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `accept`
--

DROP TABLE IF EXISTS `accept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accept` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fullName` varchar(45) DEFAULT NULL,
  `consultername` varchar(45) DEFAULT NULL,
  `appoinDate` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phNo` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `session` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accept`
--

LOCK TABLES `accept` WRITE;
/*!40000 ALTER TABLE `accept` DISABLE KEYS */;
INSERT INTO `accept` VALUES (1,'rererer','hashini','2023-09-09','consulter@gmail.com','76767','https://ww','4','rhgfhfh'),(2,'rererer','hashini','2023-09-09','consulter@gmail.com','76767','https://ww','4','rhgfhfh'),(3,'rererer','hashini','2023-09-09','consulter@gmail.com','76767','https://ww','4','rhgfhfh'),(4,'rererer','hashini','2023-09-09','consulter@gmail.com','76767','https://ww','4','rhgfhfh'),(5,'rererer','hashini','2023-09-09','consulter@gmail.com','76767','https://ww','4','rhgfhfh'),(6,'rererer','hashini','2023-09-09','consulter@gmail.com','76767','https://ww','4','rhgfhfh'),(7,'rererer','hashini','2023-09-09','consulter@gmail.com','76767','https://ww','4','rhgfhfh'),(8,'sandun','hashini','2023-09-08','devika12@gmail.com','0754794145','kandy','1','30/g kundaslaya'),(9,'devika','sasidu','2023-09-01','sasidu@gmail.com','0715985900','colombo','1','30/g galmaduwaththa kundsalaya'),(10,'devika','sasidu','2023-09-01','sasidu@gmail.com','0715985900','colombo','1','30/g galmaduwaththa kundsalaya'),(11,'saduni','hashini','2023-09-20','devika12@gmail.com','5645454','colombo','1','23/h galaha'),(12,'saduni','hashini','2023-09-20','devika12@gmail.com','5645454','colombo','1','23/h galaha'),(13,'devika','sasidu','2023-09-13','devika12@gmail.com','0815985900','colombo','1','30/ galmaduwawaththa kundasalaya'),(14,'sandun','hashini','2023-09-12','devika12@gmail.com','4343','colombo','1','gfgfgf'),(15,'saduni','hashini','2023-09-13','gevidu@gmail.com','56565','colombo','1','ggfgf'),(16,'sandun','sasidu','2023-09-14','consulter@gmail.com','65656565','colombo','1','rerererer'),(17,'sandun','sasidu','2023-09-14','consulter@gmail.com','65656565','colombo','1','rerererer'),(18,'sandun','sasidu','2023-09-14','consulter@gmail.com','65656565','colombo','1','rerererer'),(19,'sandun','sasidu','2023-09-14','consulter@gmail.com','65656565','colombo','1','rerererer'),(20,'sandun','hashini','2023-09-06','devika12@gmail.com','565656','colombo','1','dadadadadada'),(21,'sandun','hashini','2023-09-13','consulter@gmail.com','789809548054','colombo','1','dsfsfsf'),(22,'devika','hashini','2023-09-20','consulter@gmail.com','0815985900','colombo','4','dadad'),(23,'devika','hashini','2023-09-07','devika12@gmail.com','0715985900','colombo','1','30/g galmaduwaththa kundasalaya'),(24,'devika','hashini','2023-09-05','consulter@gmail.com','0812422345','colombo','1','30/g galmaduwaththa kundasalya'),(25,'saduni','sasidu','2023-09-12','devika12@gmail.com','0812422567','colombo','1','fdsfdgdgdgd'),(26,'rererer','sasidu','2023-08-31','devika12@gmail.com','78876867','colombo','5','tdggdg'),(27,'rererer','sasidu','2023-09-06','devika12@gmail.com','65656','colombo','3','30/g galmaduwawaththa kundasalaya'),(28,'rererer','hashini','2023-09-07','consulter@gmail.com','78876','colombo','1','fdfdfd'),(29,'sandun','hashini','2023-09-13','devika12@gmail.com','879798799','colombo','31','hjkhjkh'),(30,'sandun','sasidu','2023-09-12','consulter@gmail.com','67557','colombo','4','guhguhg'),(31,'rererer','hashini','2023-09-14','consulter@gmail.com','6767676767','colombo','1','ffsfsfsfs'),(32,'sandun','hashini','2023-09-20','admin@gmail.com','755657','colombo','1','gdgdgdg'),(33,'rererer','sasidu','2023-08-31','admin@gmail.com','09775644','colombo','2','fsfsfs'),(34,'rererer','hashini','2023-09-21','admin@gmail.com','67867876','colombo','1','hdhtrh'),(35,'sadun','sadun','2023-09-08','sadunuanjalika@gmail.com','5464646','colombo','1','30/g galamdwaurhtha kundasalya'),(36,'sadun','sadun','2023-09-08','sadunuanjalika@gmail.com','5464646','colombo','1','30/g galamdwaurhtha kundasalya'),(37,'sadun','sadun','2023-09-08','sadunuanjalika@gmail.com','5464646','colombo','1','30/g galamdwaurhtha kundasalya'),(38,'sadun','sadun','2023-09-08','sadunuanjalika@gmail.com','5464646','colombo','1','30/g galamdwaurhtha kundasalya'),(39,'sadun','sadun','2023-09-08','sadunuanjalika@gmail.com','5464646','colombo','1','30/g galamdwaurhtha kundasalya'),(40,'sadun','sadun','2023-09-08','sadunuanjalika@gmail.com','5464646','colombo','1','30/g galamdwaurhtha kundasalya'),(41,'rererer','sasidu','2023-09-02','consulter@gmail.com','68876','colombo','4','gfdg'),(42,'DEVIKA','SAVIDU','2023-09-21','devika@gmail.com','0815985900','colombo','1','50/1 lotus road colombo'),(43,'rererer','sasidu','2023-09-07','consulter@gmail.com','0812422385','colombo','1','dadad'),(44,'saduni','hashini','2023-09-12','hashini2225@gmaail.com','0715985900','colombo','1','23/ colombo road kandy');
/*!40000 ALTER TABLE `accept` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-05 21:07:54
