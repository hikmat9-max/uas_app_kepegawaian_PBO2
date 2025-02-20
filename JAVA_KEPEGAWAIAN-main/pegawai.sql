-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 20, 2025 at 07:48 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kepegawaian`
--

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id` int(255) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `nip` varchar(20) DEFAULT NULL,
  `pangkat` varchar(255) DEFAULT NULL,
  `golongan` varchar(255) DEFAULT NULL,
  `jabatan` varchar(255) DEFAULT NULL,
  `jenis_kelamin` enum('laki-laki','perempuan','','') DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `tempat_lahir` varchar(255) DEFAULT NULL,
  `tanggal_lahir` varchar(255) DEFAULT NULL,
  `agama` enum('islam','kristen','katolik','budha','hindu') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id`, `nama`, `nip`, `pangkat`, `golongan`, `jabatan`, `jenis_kelamin`, `alamat`, `tempat_lahir`, `tanggal_lahir`, `agama`) VALUES
(6, 'ADIANI, A.Md', 'III/a', 'Penata Muda ', '196801211994031013', 'Penyuluh Pertanian Pelaksana Lanjutan', 'perempuan', 'Rantau', 'Rantau', '21-01-1968', 'islam'),
(9, 'MASDAH HERLINA PUTRI', 'II/a', 'Pengatur Muda', '199610012020122012', 'Penyuluh Pertanian Pelaksana Pemula', 'perempuan', 'Rantau', 'Barabai', '1996-10-01', 'islam'),
(10, 'RINI NUR RAHMAH, S.P', 'III/a', 'Penata Muda', '199305052022022002', 'Penyuluh Pertanian Pertama', 'perempuan', 'Rantau', 'Banjarmasin', '1993-05-05', 'islam'),
(11, 'M. SYARBANI, S.E.', 'III/b', 'Penata Muda Tingkat 1 ', '198902282019031003', ' Analis Perencanaan, Evaluasi, dan Pelaporan', 'laki-laki', 'Rantau', 'Martapura', '1989-02-28', 'islam');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pegawai`
--
ALTER TABLE `pegawai`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
