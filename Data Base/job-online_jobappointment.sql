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
-- Table structure for table `jobappointment`
--

DROP TABLE IF EXISTS `jobappointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jobappointment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `jobSeekerFirstName` varchar(45) DEFAULT NULL,
  `jobSeekerLastName` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `jobSeekerEmail` varchar(45) DEFAULT NULL,
  `consultantFirstName` varchar(45) DEFAULT NULL,
  `consultantLastName` varchar(45) DEFAULT NULL,
  `consultantEmail` varchar(45) DEFAULT NULL,
  `jobField` varchar(45) DEFAULT NULL,
  `appointmentDate` varchar(45) DEFAULT NULL,
  `appointmentTime` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobappointment`
--

LOCK TABLES `jobappointment` WRITE;
/*!40000 ALTER TABLE `jobappointment` DISABLE KEYS */;
INSERT INTO `jobappointment` VALUES (2,'devika',NULL,'Australia','Devika@gmail.com','sasidu',NULL,'sasidu@gmail.com','Agriculture','2023-09-21',NULL,'accepted'),(11,'sadunika',NULL,'Australia','sadunika@gmail.com','sasidu',NULL,'sasidu@gmail.com','Agriculture','2023-09-21',NULL,'accepted'),(12,'sanath',NULL,'England','sanath@gmail.com','savidu',NULL,'savidu@gmail.com','Education and Training','2023-09-21',NULL,'accepted'),(13,'kanushi',NULL,'England','kanushi345@gmail.com','savidu',NULL,'savidu@gmail.com','Education and Training','2023-09-21',NULL,'accepted'),(14,'sachini',NULL,'England','sachini@gmail.com','savidu',NULL,'savidu@gmail.com','Education and Training','2023-09-21',NULL,'accepted'),(15,'gajidu','warnasooreya','England','gajidu@gmail.com','savidu','ruhunuhewa','savidu@gmail.com','Education and Training','2023-09-21','16:43','false'),(16,'heshan','warnasooreya','England','HESANI345@gmail.com','savidu','ruhunuhewa','savidu@gmail.com','Education and Training','2023-09-21','16:43','false'),(17,'sadun','warnasooreya','England','sandunwarnasooreya345@gmail.com','savidu','ruhunuhewa','savidu@gmail.com','Education and Training','2023-09-21','16:43','false'),(18,'sadun','warnasooreya','England','sandunwarnasooreya345@gmail.com','savidu','ruhunuhewa','savidu@gmail.com','Education and Training','2023-09-21','16:43','false'),(19,'kasuni',NULL,'America','Kasuni@gmail.com','saduni','warnasooreya','saduni@gmail.com','farming','2023-08-22','009.34','Accepetd'),(20,'gajidu','warnasooreya','England','gajidu@gmail.com','savidu','ruhunuhewa','savidu@gmail.com','Education and Training','2023-09-21','16:43','false'),(21,'sandun','warnasooreya','England','sandunwarnasooreya345@gmail.com','savidu','ruhunuhewa','savidu@gmail.com','Education and Training','2023-09-21','16:43','false'),(22,'heshni','warnasooreya','England','HESANI345@gmail.com','savidu','ruhunuhewa','savidu@gmail.com','Education and Training','2023-09-21','16:43','false'),(23,'gajidu','warnasooreya','England','gajidu@gmail.com','savidu','ruhunuhewa','savidu@gmail.com','Education and Training','2023-09-21','16:43','false'),(24,'heshn','warnasooreya','England','HESANI345@gmail.com','savidu','ruhunuhewa','savidu@gmail.com','Education and Training','2023-09-21','16:43','false'),(25,'kanishka','warnasooreya','England','kanishka2224@gmail.com','hashni','karunathilka','hashini2225@gmaail.com','Government ','2023-09-14','17:30','false'),(26,'kanishaka','warnasooreya','England','kanishaka@gmail.com','hashni','karunathilka','hashini2225@gmaail.com','Government ','2023-09-14','17:30','false'),(27,'kanishaka','warnasooreya','England','kanishaka@gmail.com','hashni','karunathilka','hashini2225@gmaail.com','Government ','2023-09-14','17:30','false'),(28,'kanishaka','warnasooreya','England','kanishaka@gmail.com','hashni','karunathilka','hashini2225@gmaail.com','Government ','2023-09-14','17:30','false'),(29,'nimashi',NULL,'England','nimashi@gmail.com','hashni',NULL,'hashini2225@gmaail.com','Government ','2023-09-14',NULL,'accepted'),(30,'nimashi','WARNASOOREYA','England','nimashi@gmail.com','hashni','karunathilka','hashini2225@gmaail.com','Government ','2023-09-14','17:30','false'),(31,'nimashi','WARNASOOREYA','England','nimashi@gmail.com','hashni','karunathilka','hashini2225@gmaail.com','Government ','2023-09-14','17:30','false'),(32,'nimashi','WARNASOOREYA','England','nimashi@gmail.com','hashni','karunathilka','hashini2225@gmaail.com','Government ','2023-09-14','17:30','false'),(33,'nimashi',NULL,'England','nimashi@gmail.com','hashni',NULL,'hashini2225@gmaail.com','Government ','2023-09-14',NULL,'accepted'),(34,'MENIKA',NULL,'England','MNIKA@GMAIL.COM','hashni',NULL,'hashini2225@gmaail.com','Government ','2023-09-14',NULL,'accepted'),(37,'saduni',NULL,'Australia','sadunika@gmail.com','karunarthna',NULL,'karunarthna@gmail.com','Information Technology','2023-09-13',NULL,'accepted'),(38,'Devika',NULL,'japan','devikakarunathilaka@gmail.com','hashini','karunarthna','hashini@gmail.com','farmer','2023-12-12','23.34','accepeted'),(39,'Devika',NULL,'japan','devikakarunathilaka@gmail.com','hashini','karunarthna','hashini@gmail.com','farmer','2023-12-12','23.34','accepeted'),(40,'heshani','warnasooreya','Australia','HESANI345@gmail.com','nethmi','wanshika','wasnhika@gmail.com','Architecture and Construction','2023-09-13','21:36','false'),(41,'sadun',NULL,'japan','warnasooreya@gmail.com','nadika','karunarthna','nadika@gmail.com','nursing','2023-05-12','20.34','false'),(42,'sadun',NULL,'japan','warnasooreya@gmail.com','nadika','karunarthna','nadika@gmail.com','nursing','2023-05-12','20.34','false'),(43,'sadun',NULL,'japan','warnasooreya@gmail.com','nadika','karunarthna','nadika@gmail.com','nursing','2023-05-12','20.34','false'),(44,'sadun',NULL,'japan','warnasooreya@gmail.com','nadika','karunarthna','nadika@gmail.com','nursing','2023-05-12','20.34','false'),(46,'sadun','sadun','Australia','sandunwarnasooreya345@gmail.com','nethmi','wanshika','wasnhika@gmail.com','Architecture and Construction','2023-09-13','21:36','false'),(47,'sadun','bandra','Australia','sandunwarnasooreya345@gmail.com','nethmi','wanshika','wasnhika@gmail.com','Architecture and Construction','2023-09-13','21:36','false'),(48,'WARNASOOREYA','warnasooreya','Australia','sandunwarnasooreya345@gmail.com','nethmi','wanshika','wasnhika@gmail.com','Architecture and Construction','2023-09-13','21:36','false'),(49,'sadun',NULL,'japan','warnasooreya@gmail.com','nadika','karunarthna','nadika@gmail.com','nursing','2023-05-12','20.34','false'),(50,'sadun',NULL,'japan','warnasooreya@gmail.com','nadika','karunarthna','nadika@gmail.com','nursing','2023-05-12','20.34','false');
/*!40000 ALTER TABLE `jobappointment` ENABLE KEYS */;
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
