-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: assignment
-- ------------------------------------------------------
-- Server version	8.0.38

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `article` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `content` text,
  `user_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `article_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (1,'The Future of AI','Artificial Intelligence is rapidly evolving...',3),(2,'Healthy Eating Habits','Maintaining a balanced diet is crucial for...',5),(3,'Travel Tips for Europe','When planning your European vacation...',3),(4,'Introduction to Python','Python is a versatile programming language...',5),(5,'Climate Change Effects','The impact of global warming on our planet...',2),(6,'Fitness for Beginners','Starting a new fitness routine can be daunting...',2),(7,'The Art of Photography','Capturing the perfect moment requires...',4),(8,'Financial Planning 101','Building a solid financial foundation starts with...',2),(9,'Gardening Tips','Creating a thriving garden takes patience and...',4),(10,'History of Ancient Rome','The Roman Empire was one of the most influential...',2),(11,'Cooking Mediterranean Cuisine','The Mediterranean diet is known for its health benefits...',4),(12,'Renewable Energy Sources','As we move towards a sustainable future...',3),(13,'Effective Time Management','Mastering the art of time management can significantly...',1),(14,'The Basics of Quantum Physics','Quantum physics, while complex, is fundamental to...',5),(15,'Mental Health Awareness','Taking care of our mental health is just as important as...',1),(16,'DIY Home Improvements','Upgrading your living space doesn\'t always require...',2),(17,'The Impact of Social Media','In today\'s digital age, social media plays a crucial role in...',4),(18,'Understanding Cryptocurrency','Cryptocurrency has become a hot topic in recent years...',1),(19,'The Art of Public Speaking','Effective communication is a key skill in both personal and...',5),(20,'Exploring World Cuisines','Food is a universal language that brings people together...',3),(21,'Yoga for Beginners','Starting a yoga practice can be transformative for both...',4),(22,'The Importance of Sleep','Quality sleep is essential for overall health and well-being...',4),(23,'Classic Literature Review','Exploring timeless works of literature can provide insights...',4),(24,'Sustainable Living Practices','Adopting eco-friendly habits in our daily lives can make...',3),(25,'Introduction to Machine Learning','Machine learning is revolutionizing various industries...',2),(26,'The Science of Happiness','Understanding what truly makes us happy can lead to...',4),(27,'Urban Gardening Ideas','Even with limited space, it\'s possible to create a thriving...',5),(28,'The Evolution of Music','From classical to contemporary, music has always been...',2),(29,'Effective Study Techniques','Mastering the art of studying can significantly improve...',3),(30,'The Wonders of Marine Life','The ocean is home to an incredible diversity of life...',3);
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'test@gmail.com','test123'),(2,'testCreate@gmail.com','test123'),(3,'test','test'),(4,'testCreate@gmail.com','test123'),(5,'testCreate@gmail.com','test123'),(6,'testCreate@gmail.com','test123'),(7,'guoabc','guoabc'),(8,'guo123','guo456'),(9,'guo','guo'),(10,'abcdfas','sdafasd'),(11,'710904','tst'),(12,'tr','tr'),(13,'ta','ta'),(14,'123','123'),(16,'t','t'),(17,'',''),(18,'abcdfas','def'),(19,'tt','tt');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-12 20:12:00
