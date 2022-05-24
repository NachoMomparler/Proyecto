-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.22-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para whiteflash
CREATE DATABASE IF NOT EXISTS `whiteflash` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `whiteflash`;

-- Volcando estructura para tabla whiteflash.categorias
CREATE TABLE IF NOT EXISTS `categorias` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `descripcion` varchar(30) DEFAULT NULL,
  `imagen` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla whiteflash.categorias: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;

-- Volcando estructura para tabla whiteflash.categoria_producto
CREATE TABLE IF NOT EXISTS `categoria_producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `producto_id` int(11) DEFAULT NULL,
  `categoria_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_categoriaid` (`categoria_id`),
  KEY `fk_productoid` (`producto_id`),
  CONSTRAINT `fk_categoriaid` FOREIGN KEY (`categoria_id`) REFERENCES `categorias` (`id`),
  CONSTRAINT `fk_productoid` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla whiteflash.categoria_producto: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `categoria_producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria_producto` ENABLE KEYS */;

-- Volcando estructura para tabla whiteflash.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(60) DEFAULT NULL,
  `contrasenya` varchar(40) DEFAULT NULL,
  `nombre_completo` varchar(60) DEFAULT NULL,
  `direccion_envio` varchar(60) DEFAULT NULL,
  `direccion_facturacion` varchar(60) DEFAULT NULL,
  `ciudad` varchar(50) DEFAULT NULL,
  `pais` varchar(30) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla whiteflash.clientes: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Volcando estructura para tabla whiteflash.detalles_producto
CREATE TABLE IF NOT EXISTS `detalles_producto` (
  `pedido_id` int(11) NOT NULL,
  `producto_id` int(11) NOT NULL,
  `precio` float DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`pedido_id`,`producto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla whiteflash.detalles_producto: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalles_producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalles_producto` ENABLE KEYS */;

-- Volcando estructura para tabla whiteflash.pedidos
CREATE TABLE IF NOT EXISTS `pedidos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente_id` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `direccion_facturacion` varchar(60) DEFAULT NULL,
  `direccion_envio` varchar(60) DEFAULT NULL,
  `email_cliente` varchar(60) DEFAULT NULL,
  `fecha_pedido` date DEFAULT NULL,
  `estado_pedido` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_clienteid` (`cliente_id`),
  CONSTRAINT `fk_clienteid` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla whiteflash.pedidos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;

-- Volcando estructura para tabla whiteflash.productos
CREATE TABLE IF NOT EXISTS `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `descripcion` varchar(40) DEFAULT NULL,
  `imagen` varchar(50) DEFAULT NULL,
  `categoria` varchar(30) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla whiteflash.productos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
