-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2019 at 12:34 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 5.6.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crud_java_rengko`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_barang`
--

CREATE TABLE `t_barang` (
  `id_barang` int(3) NOT NULL,
  `nm_barang` varchar(30) NOT NULL,
  `merk_barang` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_barang`
--

INSERT INTO `t_barang` (`id_barang`, `nm_barang`, `merk_barang`) VALUES
(1, 'Pensil B', 'Faber Castle'),
(2, 'Pensil HB', 'Faber Castle'),
(3, 'Pena Hitam A', 'Pilot');

-- --------------------------------------------------------

--
-- Table structure for table `t_beli`
--

CREATE TABLE `t_beli` (
  `no_beli` varchar(5) NOT NULL,
  `id_barang` int(3) NOT NULL,
  `jml` int(5) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_beli`
--

INSERT INTO `t_beli` (`no_beli`, `id_barang`, `jml`, `tgl`) VALUES
('B0001', 1, 200, '2009-12-30'),
('B0002', 2, 175, '2009-12-30');

-- --------------------------------------------------------

--
-- Table structure for table `t_jual`
--

CREATE TABLE `t_jual` (
  `no_jual` varchar(5) NOT NULL,
  `id_barang` int(3) NOT NULL,
  `jml` int(5) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_jual`
--

INSERT INTO `t_jual` (`no_jual`, `id_barang`, `jml`, `tgl`) VALUES
('J0001', 1, 10, '2010-01-02'),
('J0002', 2, 15, '2010-01-02'),
('J0003', 2, 25, '2010-01-02'),
('J0004', 1, 30, '2010-01-02'),
('J0005', 2, 20, '2010-01-02'),
('J0006', 1, 10, '2010-01-02');

-- --------------------------------------------------------

--
-- Table structure for table `t_stok`
--

CREATE TABLE `t_stok` (
  `tgl_stok` date NOT NULL,
  `id_barang` int(3) NOT NULL,
  `stok_awal` int(5) NOT NULL,
  `jml_terjual` int(5) NOT NULL,
  `jml_terbeli` int(5) NOT NULL,
  `stok_akhir` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_stok`
--

INSERT INTO `t_stok` (`tgl_stok`, `id_barang`, `stok_awal`, `jml_terjual`, `jml_terbeli`, `stok_akhir`) VALUES
('2009-12-30', 1, 0, 0, 200, 200),
('2009-12-30', 2, 0, 0, 175, 175),
('2010-01-02', 1, 200, 50, 0, 150),
('2010-01-02', 2, 175, 60, 0, 115);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_barang`
--
ALTER TABLE `t_barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `t_beli`
--
ALTER TABLE `t_beli`
  ADD PRIMARY KEY (`no_beli`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `t_jual`
--
ALTER TABLE `t_jual`
  ADD PRIMARY KEY (`no_jual`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `t_beli`
--
ALTER TABLE `t_beli`
  ADD CONSTRAINT `t_beli_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `t_barang` (`id_barang`);

--
-- Constraints for table `t_jual`
--
ALTER TABLE `t_jual`
  ADD CONSTRAINT `t_jual_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `t_barang` (`id_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
