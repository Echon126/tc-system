/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : tc-system

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2020-04-17 17:27:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for conf_tc_rule
-- ----------------------------
DROP TABLE IF EXISTS `conf_tc_rule`;
CREATE TABLE `conf_tc_rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '规则ID',
  `mid` varchar(255) DEFAULT NULL,
  `rule_name` varchar(255) DEFAULT NULL COMMENT '规则名称',
  `rule_code` varchar(255) DEFAULT NULL COMMENT '规则代号',
  `rule_expression` varchar(255) DEFAULT NULL COMMENT '规则表达式',
  `rule_desc` varchar(255) DEFAULT NULL COMMENT '表达式描述',
  `is_default_rule` int(1) DEFAULT '0' COMMENT '是否为默认规则(0:默认配置，1特定配置)',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conf_tc_rule
-- ----------------------------
INSERT INTO `conf_tc_rule` VALUES ('1', '0A02', 'UV直接指令接受计数', 'uv_count', 'A1', 'UV遥控直接指令计数', '1', '2020-03-30 15:00:38');
INSERT INTO `conf_tc_rule` VALUES ('2', '0A02', 'UXB直接指令接收计数', 'x_count', 'A1', '直接指令接收计数', '1', '2020-03-30 15:00:41');
INSERT INTO `conf_tc_rule` VALUES ('3', '0A02', '上行遥控块计数', 'spc_count', 'A1', '上行遥控块计数', '0', '2020-03-30 14:54:46');

-- ----------------------------
-- Table structure for conf_tc_rule_condition
-- ----------------------------
DROP TABLE IF EXISTS `conf_tc_rule_condition`;
CREATE TABLE `conf_tc_rule_condition` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `rule_id` int(11) DEFAULT NULL COMMENT '规则ID',
  `condition_name` varchar(255) DEFAULT NULL COMMENT '条件名称',
  `condition_flag` varchar(255) DEFAULT NULL COMMENT '条件的唯一标识',
  `condition_code` varchar(255) DEFAULT NULL COMMENT '条件编码',
  `condition_method` varchar(255) DEFAULT NULL COMMENT '条件计算方式',
  `condition_value` double(255,0) DEFAULT NULL COMMENT '条件值',
  `max_value` int(255) DEFAULT NULL COMMENT '计数上限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conf_tc_rule_condition
-- ----------------------------
INSERT INTO `conf_tc_rule_condition` VALUES ('1', '1', 'UV直接指令接受计数', 'A1', 'P22W5S1', 'f+1==a', '0', '15');
INSERT INTO `conf_tc_rule_condition` VALUES ('2', '2', 'X通信机直接指令接收计数', 'A1', 'P26W5S1', 'f+1==a', '0', '15');
INSERT INTO `conf_tc_rule_condition` VALUES ('3', '3', '上行遥控块计数', 'A1', 'P10W7W8', 'f+1==a', '0', '65535');

-- ----------------------------
-- Table structure for tc_command_data
-- ----------------------------
DROP TABLE IF EXISTS `tc_command_data`;
CREATE TABLE `tc_command_data` (
  `id` int(11) NOT NULL,
  `mid` int(11) DEFAULT NULL,
  `command_code` varchar(255) DEFAULT NULL,
  `command_name` varchar(255) DEFAULT NULL,
  `command_data` varchar(255) DEFAULT NULL,
  `dynamic_data` varchar(255) DEFAULT NULL,
  `type_code` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `creator` varchar(255) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_command_data
-- ----------------------------

-- ----------------------------
-- Table structure for tc_data_type
-- ----------------------------
DROP TABLE IF EXISTS `tc_data_type`;
CREATE TABLE `tc_data_type` (
  `id` int(11) NOT NULL,
  `pid` int(11) DEFAULT NULL,
  `mid` varchar(11) DEFAULT NULL,
  `type_code` varchar(20) DEFAULT NULL,
  `type_name` varchar(50) DEFAULT NULL,
  `type_desc` varchar(200) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='遥控数据类型表';

-- ----------------------------
-- Records of tc_data_type
-- ----------------------------

-- ----------------------------
-- Table structure for tc_monitor_log
-- ----------------------------
DROP TABLE IF EXISTS `tc_monitor_log`;
CREATE TABLE `tc_monitor_log` (
  `id` int(11) NOT NULL,
  `sid` int(11) DEFAULT NULL,
  `mid` int(11) NOT NULL,
  `sat_name` varchar(255) DEFAULT NULL,
  `station_name` varchar(255) DEFAULT NULL,
  `command_id` int(11) DEFAULT NULL,
  `command_code` varchar(255) DEFAULT NULL,
  `command_name` varchar(255) NOT NULL,
  `command_data` varchar(255) DEFAULT NULL,
  `send_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `execute_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `process_desc` varchar(255) DEFAULT NULL,
  `send_operator` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`,`command_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_monitor_log
-- ----------------------------

-- ----------------------------
-- Table structure for tc_protocol_configure
-- ----------------------------
DROP TABLE IF EXISTS `tc_protocol_configure`;
CREATE TABLE `tc_protocol_configure` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_protocol_configure
-- ----------------------------

-- ----------------------------
-- Table structure for tc_sequence
-- ----------------------------
DROP TABLE IF EXISTS `tc_sequence`;
CREATE TABLE `tc_sequence` (
  `id` int(11) NOT NULL,
  `mid` int(11) DEFAULT NULL,
  `sequence_name` varchar(255) DEFAULT NULL,
  `sequence_code` varchar(255) DEFAULT NULL,
  `sequence_order` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `creator` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_sequence
-- ----------------------------

-- ----------------------------
-- Table structure for tc_sequence_data
-- ----------------------------
DROP TABLE IF EXISTS `tc_sequence_data`;
CREATE TABLE `tc_sequence_data` (
  `id` int(11) NOT NULL,
  `seq_id` int(11) DEFAULT NULL,
  `seq_item_name` varchar(255) DEFAULT NULL,
  `seq_item_code` varchar(255) DEFAULT NULL,
  `seq_item_data` varchar(255) DEFAULT NULL,
  `seq_item_type` varchar(255) DEFAULT NULL,
  `interval_time` int(11) DEFAULT NULL,
  `is_compare` int(1) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_sequence_data
-- ----------------------------
