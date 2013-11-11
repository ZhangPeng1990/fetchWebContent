/*
SQLyog Ultimate v9.60 
MySQL - 5.5.10 : Database - fetch_web_content
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fetch_web_content` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `fetch_web_content`;

/*Table structure for table `fetched_content` */

DROP TABLE IF EXISTS `fetched_content`;

CREATE TABLE `fetched_content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `web_Url` varchar(2000) DEFAULT NULL,
  `web_Title` varchar(500) DEFAULT NULL,
  `web_Content` text,
  `fecthed_Time` datetime DEFAULT NULL,
  `update_Time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fetched_content` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
