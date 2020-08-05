DROP SCHEMA IF EXISTS `zhihu`;
CREATE SCHEMA `zhihu` ;
use zhihu;

CREATE TABLE `user` (
  `id` int(11) NOT NULL COMMENT '主键id',
  `user_token` varchar(100) DEFAULT NULL COMMENT '个性地址token',
  `location` varchar(100) DEFAULT NULL COMMENT '位置',
  `business` varchar(255) DEFAULT NULL COMMENT '行业',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `employment` varchar(255) DEFAULT NULL COMMENT '企业',
  `education` varchar(255) DEFAULT NULL COMMENT '教育',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `url` varchar(255) DEFAULT NULL COMMENT '用户首页url',
  `agress` int(11) DEFAULT NULL COMMENT '赞同数',
  `thanks` int(11) DEFAULT NULL COMMENT '感谢数',
  `asks` int(11) DEFAULT NULL COMMENT '提问数',
  `answers` int(11) DEFAULT NULL COMMENT '回答问题数',
  `posts` int(11) DEFAULT NULL COMMENT '文章数',
  `followees` int(11) DEFAULT NULL COMMENT '关注数',
  `followers` int(11) DEFAULT NULL COMMENT '粉丝数',
  `hashId` varchar(255) DEFAULT NULL COMMENT 'hashid，用户唯一标识',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_token_UNIQUE` (`user_token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE `url` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_md5_url` varchar(35) DEFAULT NULL COMMENT 'URL爬取连接的md5摘要，unique key',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
