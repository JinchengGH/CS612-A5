SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

create database `assignment5` default character set utf8 collate utf8_general_ci;


DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `customers` VALUES (1, 'Abner', 22);
INSERT INTO `customers` VALUES (2, 'Abraham', 17);
INSERT INTO `customers` VALUES (3, 'Babs', 27);
INSERT INTO `customers` VALUES (4, 'BoyBy', 34);
INSERT INTO `customers` VALUES (5, 'Snow', 18);
INSERT INTO `customers` VALUES (6, 'Anke', 19);
INSERT INTO `customers` VALUES (7, 'FeiLipe', 38);
INSERT INTO `customers` VALUES (8, 'BoerTe', 40);
INSERT INTO `customers` VALUES (9, 'Roman', 33);

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `money` decimal(10, 2) NULL DEFAULT NULL,
  `customer_id` int(11) NULL DEFAULT NULL,
  `product_id` int(11) NULL DEFAULT NULL,
  `amount` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `orders` VALUES (1, 10.00, 1, 1, 2);
INSERT INTO `orders` VALUES (2, 11.00, 1, 5, 1);
INSERT INTO `orders` VALUES (3, 153.00, 5, 16, 1);
INSERT INTO `orders` VALUES (4, 324.00, 3, 25, 1);
INSERT INTO `orders` VALUES (5, 12.00, 5, 14, 2);

DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `products` VALUES (1, 'Alarm Clock', 5.00);
INSERT INTO `products` VALUES (2, 'Compressors', 28.00);
INSERT INTO `products` VALUES (3, 'Computer Accessories', 214.12);
INSERT INTO `products` VALUES (4, 'Bag', 58.00);
INSERT INTO `products` VALUES (5, 'Balance', 11.00);
INSERT INTO `products` VALUES (6, 'Ball Pen', 17.00);
INSERT INTO `products` VALUES (7, 'Cup dishes ', 0.80);
INSERT INTO `products` VALUES (8, 'Battery ', 1.00);
INSERT INTO `products` VALUES (9, 'Belt', 12.00);
INSERT INTO `products` VALUES (10, 'Bicycle', 213.00);
INSERT INTO `products` VALUES (11, 'Dlovesrubber', 2.00);
INSERT INTO `products` VALUES (12, 'Doll', 14.00);
INSERT INTO `products` VALUES (13, 'Book', 3.00);
INSERT INTO `products` VALUES (14, 'Pen', 6.00);
INSERT INTO `products` VALUES (15, 'Drawing pins ', 3.12);
INSERT INTO `products` VALUES (16, 'Dressing table ', 153.00);
INSERT INTO `products` VALUES (17, 'Earphone', 32.00);
INSERT INTO `products` VALUES (18, 'Brooch', 13.00);
INSERT INTO `products` VALUES (19, 'Brush', 8.00);
INSERT INTO `products` VALUES (20, 'Buckle', 2.00);
INSERT INTO `products` VALUES (21, 'Electronic Lamps ', 9.00);
INSERT INTO `products` VALUES (22, 'bumper jack ', 81.00);
INSERT INTO `products` VALUES (23, 'Cable ', 13.00);
INSERT INTO `products` VALUES (24, 'Cable ', 21.00);
INSERT INTO `products` VALUES (25, 'Calcucation ', 324.00);
INSERT INTO `products` VALUES (26, 'Enameled ', 32.00);
INSERT INTO `products` VALUES (27, 'Calendar ', 2.00);
INSERT INTO `products` VALUES (28, 'Erasers ', 1.20);
INSERT INTO `products` VALUES (29, 'camera ', 211.00);
INSERT INTO `products` VALUES (30, 'Fan ', 21.00);
INSERT INTO `products` VALUES (31, 'Fan Blower ', 57.00);
INSERT INTO `products` VALUES (32, 'capalitor ', 21.00);
INSERT INTO `products` VALUES (33, 'car curtain ', 18.00);
INSERT INTO `products` VALUES (34, 'cards ', 0.50);
INSERT INTO `products` VALUES (35, 'cartod ', 2.00);
INSERT INTO `products` VALUES (36, 'Fishing Aricle ', 31.00);
INSERT INTO `products` VALUES (37, 'Fishing Rods ', 123.00);
INSERT INTO `products` VALUES (38, 'Flavoring ', 2.00);
INSERT INTO `products` VALUES (39, 'Flywheel ', 9.00);

SET FOREIGN_KEY_CHECKS = 1;
