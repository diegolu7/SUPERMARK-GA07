-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: mysql
-- Generation Time: Jul 08, 2022 at 11:43 PM
-- Server version: 10.6.7-MariaDB-1:10.6.7+maria~focal-log
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `super`
--

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE `categoria` (
  `ID` int(4) NOT NULL,
  `NOMBRE` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`ID`, `NOMBRE`) VALUES
(1, 'bebidas'),
(2, 'lacteos'),
(3, 'carnes'),
(4, 'verduleria'),
(5, 'perfumeria');

-- --------------------------------------------------------

--
-- Table structure for table `detalle_ventaxproductos`
--

CREATE TABLE `detalle_ventaxproductos` (
  `ID` int(4) NOT NULL,
  `CANTIDAD` int(3) NOT NULL,
  `ID_PRODUCTO` int(4) NOT NULL,
  `ID_VENTA` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `productos`
--

CREATE TABLE `productos` (
  `ID` int(4) NOT NULL,
  `NOMBRE` varchar(40) NOT NULL,
  `STOCK` int(3) NOT NULL,
  `FECHA_VENCIMIENTO` date NOT NULL,
  `ID_CATEGORIA` int(4) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `productos`
--

INSERT INTO `productos` (`ID`, `NOMBRE`, `STOCK`, `FECHA_VENCIMIENTO`, `ID_CATEGORIA`, `precio`) VALUES
(1, 'gaseosa', 50, '2024-06-01', 1, 200),
(2, 'agua', 50, '2024-06-01', 1, 100),
(3, 'alcohol', 50, '2024-06-01', 1, 100),
(4, 'leche', 40, '2024-06-01', 2, 150),
(5, 'yogurt', 40, '2024-06-01', 2, 160),
(6, 'queso', 40, '2024-06-01', 2, 200),
(7, 'manteca', 40, '2024-06-01', 2, 100),
(8, 'dulce de leche', 40, '2024-06-01', 2, 150),
(9, 'carne vacuna', 40, '2024-06-01', 3, 300),
(10, 'carne de cerdo', 40, '2024-06-01', 3, 240),
(11, 'pescado', 40, '2024-06-01', 3, 200),
(12, 'mariscos', 40, '2024-06-01', 3, 100),
(13, 'tomate', 30, '2024-06-01', 4, 50),
(14, 'cebolla', 30, '2024-06-01', 4, 60),
(15, 'banana', 30, '2024-06-01', 4, 80),
(16, 'mandarina', 30, '2024-06-01', 4, 120),
(17, 'dove men', 30, '2024-06-01', 5, 150),
(18, 'rexona', 30, '2024-06-01', 5, 160),
(19, 'kevin', 30, '2024-06-01', 5, 200),
(20, 'nivea', 30, '2024-06-01', 5, 150);

-- --------------------------------------------------------

--
-- Table structure for table `tipodeusuario`
--

CREATE TABLE `tipodeusuario` (
  `ID` int(4) NOT NULL,
  `NOMBRETIPO` varchar(10) NOT NULL,
  `DESCRIPCION` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tipodeusuario`
--

INSERT INTO `tipodeusuario` (`ID`, `NOMBRETIPO`, `DESCRIPCION`) VALUES
(1, '1', 'usuario externo'),
(2, '2', 'usuario interno');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `ID` int(4) NOT NULL,
  `NOMBRE` varchar(40) NOT NULL,
  `APELLIDO` varchar(40) NOT NULL,
  `EMAIL` varchar(40) NOT NULL,
  `CONTRASENIA` varchar(15) NOT NULL,
  `TIENETARJETA` tinyint(1) NOT NULL,
  `ID_TIPODEUSUARIO` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`ID`, `NOMBRE`, `APELLIDO`, `EMAIL`, `CONTRASENIA`, `TIENETARJETA`, `ID_TIPODEUSUARIO`) VALUES
(1, 'leonel', 'messi', 'admin@test.com', '123456', 0, 2),
(2, 'luciana jimena', 'fadell', 'luciana@gmail.com', 'luciana', 1, 1),
(3, 'marcelo', 'gallardo', 'cliente@test.com', '123456', 1, 1),
(4, 'pablo daniel', 'mendez', 'paline@gmail.com', '123456', 1, 1),
(5, 'joaquin', 'avila', 'joaqui@gmail.com', '123456789', 1, 1),
(6, 'maria jose', 'sanchez', 'mariajose@gmail.com', 'neco1848', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `venta`
--

CREATE TABLE `venta` (
  `ID` int(4) NOT NULL,
  `FECHA` date NOT NULL,
  `TOTAL` double NOT NULL,
  `ID_USUARIO` int(4) NOT NULL,
  `ID_PRODUCTO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `detalle_ventaxproductos`
--
ALTER TABLE `detalle_ventaxproductos`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `fk_venta` (`ID_VENTA`),
  ADD KEY `fk_producto` (`ID_PRODUCTO`);

--
-- Indexes for table `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `fk_categorias` (`ID_CATEGORIA`);

--
-- Indexes for table `tipodeusuario`
--
ALTER TABLE `tipodeusuario`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `fk_tipousuario` (`ID_TIPODEUSUARIO`);

--
-- Indexes for table `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `fk_usuario` (`ID_USUARIO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categoria`
--
ALTER TABLE `categoria`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `detalle_ventaxproductos`
--
ALTER TABLE `detalle_ventaxproductos`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `productos`
--
ALTER TABLE `productos`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `tipodeusuario`
--
ALTER TABLE `tipodeusuario`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `venta`
--
ALTER TABLE `venta`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detalle_ventaxproductos`
--
ALTER TABLE `detalle_ventaxproductos`
  ADD CONSTRAINT `fk_producto` FOREIGN KEY (`ID_PRODUCTO`) REFERENCES `productos` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_venta` FOREIGN KEY (`ID_VENTA`) REFERENCES `venta` (`ID`) ON UPDATE CASCADE;

--
-- Constraints for table `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `fk_categorias` FOREIGN KEY (`ID_CATEGORIA`) REFERENCES `categoria` (`ID`) ON UPDATE CASCADE;

--
-- Constraints for table `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_tipousuario` FOREIGN KEY (`ID_TIPODEUSUARIO`) REFERENCES `tipodeusuario` (`ID`) ON UPDATE CASCADE;

--
-- Constraints for table `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_usuario` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuario` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
