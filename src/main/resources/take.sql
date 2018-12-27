/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.6.23-log : Database - take
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`take` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `take`;

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `menu_id` varchar(64) NOT NULL COMMENT '菜单id',
  `store_id` varchar(64) NOT NULL COMMENT '店铺id',
  `menu_name` varchar(64) NOT NULL COMMENT '菜单名',
  `menu_price` decimal(10,2) DEFAULT NULL COMMENT '菜单单价',
  `menu_describe` varchar(255) DEFAULT NULL COMMENT '菜单描述',
  `menu_img` varchar(255) DEFAULT NULL COMMENT '菜单图片',
  `menu_create_time` varchar(64) DEFAULT NULL COMMENT '菜单上架时间',
  `menu_update_time` varchar(64) DEFAULT NULL COMMENT '菜单最后一次更新时间',
  `menu_stauts` int(8) DEFAULT NULL COMMENT '菜的状态 0：新品上架 1：热门推荐  2：店铺推荐  3：已下架',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `menu` */

/*Table structure for table `menu_category` */

DROP TABLE IF EXISTS `menu_category`;

CREATE TABLE `menu_category` (
  `id` int(64) NOT NULL AUTO_INCREMENT COMMENT '类目id',
  `category_name` varchar(100) NOT NULL COMMENT '菜单类目名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `menu_category` */

/*Table structure for table `merchants` */

DROP TABLE IF EXISTS `merchants`;

CREATE TABLE `merchants` (
  `merchants_id` varchar(64) NOT NULL COMMENT '商家id',
  `merchants_name` varchar(64) NOT NULL COMMENT '商家姓名',
  `merchants_sfz` varchar(32) NOT NULL COMMENT '商家身份证',
  `merchants_phone` varchar(32) DEFAULT NULL COMMENT '商家手机号',
  `merchants_age` int(8) DEFAULT NULL COMMENT '商家性别',
  `merchants_eamil` varchar(64) DEFAULT NULL COMMENT '商家邮箱',
  `merchants_create_time` varchar(64) DEFAULT NULL COMMENT '创建时间',
  `merchants_update_time` varchar(64) DEFAULT NULL COMMENT '商家最后一次更新时间',
  `merchants_status` int(8) DEFAULT NULL COMMENT '商家状态 0：正常 1：注销',
  PRIMARY KEY (`merchants_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `merchants` */

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `order_id` varchar(64) NOT NULL COMMENT '订单id',
  `user_id` varchar(64) NOT NULL COMMENT '用户id',
  `merchants_id` varchar(64) NOT NULL COMMENT '商家id',
  `menu_id` varchar(64) NOT NULL COMMENT '菜单id',
  `shr_name` varchar(64) DEFAULT NULL COMMENT '收货人姓名',
  `order_phone` varchar(64) DEFAULT NULL COMMENT '收货人手机号',
  `address` varchar(255) DEFAULT NULL COMMENT '收货地址',
  `note` varchar(64) DEFAULT NULL COMMENT '用户备注',
  `order_create_time` varchar(64) DEFAULT NULL COMMENT '订单创建时间',
  `order_update_time` varchar(64) DEFAULT NULL COMMENT '订单修改时间',
  `order_status` int(8) DEFAULT NULL COMMENT '订单状态 0：未支付，1：已支付',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `order` */

/*Table structure for table `store` */

DROP TABLE IF EXISTS `store`;

CREATE TABLE `store` (
  `store_id` int(64) NOT NULL COMMENT '店铺id',
  `merchants_id` varchar(64) DEFAULT NULL COMMENT '商家id',
  `store_name` varchar(100) NOT NULL COMMENT '店铺名',
  `store_describe` varchar(255) DEFAULT NULL COMMENT '店铺描述',
  `store_create_time` varchar(64) DEFAULT NULL COMMENT '店铺创建时间',
  `store_update_time` varchar(64) DEFAULT NULL COMMENT '店铺最后一次更新时间',
  `store_status` int(8) NOT NULL COMMENT '店铺状态 0：正常 1：倒闭',
  PRIMARY KEY (`store_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `store` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` varchar(64) NOT NULL COMMENT '用户id',
  `username` varchar(64) NOT NULL COMMENT '用户名',
  `password` varchar(64) NOT NULL COMMENT '用户密码',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `create_time` varchar(64) DEFAULT NULL COMMENT '创建时间',
  `update_time` varchar(64) DEFAULT NULL COMMENT '用户最后一次更新时间',
  `user_status` int(8) DEFAULT NULL COMMENT '用户状态 0：正常 1：注销',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `user` */

insert  into `user`(`user_id`,`username`,`password`,`email`,`create_time`,`update_time`,`user_status`) values ('1','1','1','1','1','1',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
