/*
SQLyog v10.2 
MySQL - 5.0.96-community-nt : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `t_category` */

DROP TABLE IF EXISTS `t_category`;

CREATE TABLE `t_category` (
  `cid` int(20) NOT NULL,
  `title` varchar(50) default NULL,
  `sequnce` int(20) default NULL,
  `deleted` tinyint(1) default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_category` */

insert  into `t_category`(`cid`,`title`,`sequnce`,`deleted`) values (0,'体育',0,0),(1,'电影',1,0),(2,'音乐',2,0),(3,'头条',3,0),(4,'游戏',4,0),(5,'军事',5,0),(6,'汽车',6,0),(7,'房产',7,0),(8,'科技',8,0),(9,'淘宝',9,0),(10,'京东',10,0),(11,'国际',11,0),(12,'美女',12,0),(13,'游戏',13,0),(14,'LOL',14,0),(15,'搞笑',NULL,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
