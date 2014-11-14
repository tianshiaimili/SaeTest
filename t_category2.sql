-- phpMyAdmin SQL Dump
-- version 3.3.8.1
-- http://www.phpmyadmin.net
--
-- 主机: w.rdc.sae.sina.com.cn:3307
-- 生成日期: 2014 年 11 月 14 日 11:08
-- 服务器版本: 5.5.23
-- PHP 版本: 5.3.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `app_huyue520`
--

-- --------------------------------------------------------

--
-- 表的结构 `t_category`
--

CREATE TABLE IF NOT EXISTS `t_category` (
  `cid` int(20) NOT NULL,
  `title` varchar(50) NOT NULL,
  `sequnce` int(20) NOT NULL,
  `deleted` tinyint(100) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `t_category`
--

INSERT INTO `t_category` (`cid`, `title`, `sequnce`, `deleted`) VALUES
(0, '电影', 0, 0),
(1, '电视', 1, 0),
(2, '游戏', 2, 0),
(3, '头条', 3, 0),
(4, '游戏', 4, 0),
(5, '军事', 5, 0),
(6, '汽车', 6, 0),
(7, '房产', 7, 0),
(8, '科技', 8, 0),
(9, '淘宝', 9, 0),
(10, '京东', 10, 0),
(11, '国际', 11, 0),
(12, '美女', 12, 0),
(13, '游戏', 13, 0),
(14, 'LOL', 14, 0),
(15, '搞笑', 15, 0);
