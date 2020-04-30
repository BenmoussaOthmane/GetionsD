-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: May 28, 2019 at 05:19 PM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Getion_Dentaire`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `ID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Prenome` varchar(50) NOT NULL,
  `Date` text NOT NULL,
  `NTlfn` text NOT NULL,
  `Adresse` text NOT NULL,
  `User` text NOT NULL,
  `Motpass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ID`, `Name`, `Prenome`, `Date`, `NTlfn`, `Adresse`, `User`, `Motpass`) VALUES
(1, 'benmoussa', 'othmane', '10/11/2020', '0797471148', 'mazaghren', 'a', 'a');

-- --------------------------------------------------------

--
-- Table structure for table `Attendre`
--

CREATE TABLE `Attendre` (
  `Id` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Tlephone` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Doctor`
--

CREATE TABLE `Doctor` (
  `ID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Prenome` varchar(50) NOT NULL,
  `Date` text NOT NULL,
  `NTlfn` text NOT NULL,
  `Adresse` text NOT NULL,
  `User` text NOT NULL,
  `Motpass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Doctor`
--

INSERT INTO `Doctor` (`ID`, `Name`, `Prenome`, `Date`, `NTlfn`, `Adresse`, `User`, `Motpass`) VALUES
(1, '', '', '', '', '', 'Doc', 'Doc');

-- --------------------------------------------------------

--
-- Table structure for table `historique`
--

CREATE TABLE `historique` (
  `Id` int(11) NOT NULL,
  `Date_ajouter` text NOT NULL,
  `Actions` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `historique`
--

INSERT INTO `historique` (`Id`, `Date_ajouter`, `Actions`) VALUES
(1, '6 avril 2019', 'Ajouter un nevail pations'),
(2, '6 avril 2019', 'Ajouter un nevail pations'),
(3, '6 avril 2019', 'Ajouter un nevail pations'),
(4, '6 avril 2019', 'Ajouter un neveau rendiveau '),
(5, '6 avril 2019', 'Ajouter un neveau rendiveau '),
(6, '6 avril 2019', 'Ajouter un neveau rendiveau '),
(7, '6 avril 2019', 'Ajouter un neveau rendiveau '),
(8, '6 avril 2019', 'Ajouter un neveau rendiveau '),
(9, '6 avril 2019', 'Ajouter un neveau rendiveau '),
(10, '6 avril 2019', 'Ajouter un neveau rendiveau '),
(11, '6 avril 2019', 'Ajouter un neveau rendiveau '),
(12, '6 avril 2019', 'Ajouter un neveau rendiveau '),
(13, '9 avril 2019', 'Ajouter un neveau rendiveau '),
(14, '9 avril 2019', 'Ajouter un nevail pations'),
(15, '9 avril 2019', 'Ajouter un nevail pations'),
(16, '28 avril 2019', 'Ajouter un nevail pations'),
(17, '28 avril 2019', 'Ajouter un nevail pations'),
(18, '28 avril 2019', 'Modifier pations'),
(19, '29 avril 2019', 'Ajouter un nevail pations'),
(20, '29 avril 2019', 'Modifier pations'),
(21, '18 mai 2019', 'Ajouter un nevail pations'),
(22, '18 mai 2019', 'Ajouter un neveau rendiveau '),
(23, '18 mai 2019', 'Ajouter un nevail pations'),
(24, '18 mai 2019', 'Ajouter un nevail pations'),
(25, '18 mai 2019', 'Suprimer un pations'),
(26, '18 mai 2019', 'Ajouter un neveau rendiveau '),
(27, '18 mai 2019', 'Ajouter un neveau rendiveau '),
(28, '21 mai 2019', 'Ajouter un neveau rendiveau ');

-- --------------------------------------------------------

--
-- Table structure for table `Lifateau`
--

CREATE TABLE `Lifateau` (
  `Id` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Tlephone` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `MessageAdmin`
--

CREATE TABLE `MessageAdmin` (
  `Id` int(11) NOT NULL,
  `Date_ajouter` text NOT NULL,
  `Msg` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `MessageAdmin`
--

INSERT INTO `MessageAdmin` (`Id`, `Date_ajouter`, `Msg`) VALUES
(81, '6 avril 2019', 'dsfdfdfsdfs'),
(82, '6 avril 2019', 'dsfdfdfsdfssfdsf'),
(83, '6 avril 2019', 'sdfdsfsdfsf'),
(84, '9 avril 2019', 'xfdsfdsfsdfdsfdxcv'),
(85, '28 avril 2019', 'vbcvbcvb'),
(86, '28 avril 2019', 'bcvb'),
(87, '18 mai 2019', 'dsfsdfds');

-- --------------------------------------------------------

--
-- Table structure for table `MsgDOc`
--

CREATE TABLE `MsgDOc` (
  `Id` int(11) NOT NULL,
  `Date_ajouter` text NOT NULL,
  `Msg` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `MsgDOc`
--

INSERT INTO `MsgDOc` (`Id`, `Date_ajouter`, `Msg`) VALUES
(31, '6 avril 2019', 'dfsdfdsfsdf');

-- --------------------------------------------------------

--
-- Table structure for table `NprPations`
--

CREATE TABLE `NprPations` (
  `Id` int(11) NOT NULL,
  `Nprb` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `NprPations`
--

INSERT INTO `NprPations` (`Id`, `Nprb`) VALUES
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `Passions`
--

CREATE TABLE `Passions` (
  `Id` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Date_nai` text NOT NULL,
  `Date_ajouter` text NOT NULL,
  `Tlephone` int(50) NOT NULL,
  `Sexe` text NOT NULL,
  `Adresse` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Passions`
--

INSERT INTO `Passions` (`Id`, `Nome`, `Prenom`, `Date_nai`, `Date_ajouter`, `Tlephone`, `Sexe`, `Adresse`) VALUES
(8, 'dsfsd', 'dsfsd', '15/04/2019', '5 avril 2019', 797471148, 'Homme', 'sdfdsfdf'),
(9, 'dfs', 'sdf', '15/04/2019', '5 avril 2019', 797471148, 'Homme', 'sdfsdfsd'),
(10, 'zae', 'zae', '08/04/2019', '5 avril 2019', 797471148, 'Homme', 'aeazezeaze'),
(11, 'gfdh', 'fdgh', '08/04/2019', '5 avril 2019', 797471148, 'Homme', 'dfh'),
(12, 'gfdh25', 'fdghdfgh25', '08/04/2019', '5 avril 2019', 797471148, 'Homme', 'dfh'),
(13, 'gfdh25', 'fdghdfgh25', '08/04/2019', '5 avril 2019', 797471148, 'Homme', 'dfh'),
(14, '25', '25', '09/04/2019', '5 avril 2019', 797471148, 'Homme', 'dsf'),
(15, '25', '33', '', '5 avril 2019', 797471148, 'Homme', 'sdf'),
(16, '25', 'sdfdsf', '08/04/2019', '5 avril 2019', 797471148, 'Homme', 'dsfdsf'),
(17, 'dhg', 'dgfh', '08/04/2019', '6 avril 2019', 797471148, 'Homme', 'dfgh'),
(18, 'dsqf', 'fsdfqd', '15/04/2019', '6 avril 2019', 797471148, 'Homme', 'qsdf'),
(19, 'sd', 'qsd', '', '6 avril 2019', 797471148, 'Homme', 'sqd'),
(20, 'sd', 'dq', '08/04/2019', '6 avril 2019', 797471148, 'Homme', 'dqsd'),
(21, 'dqS', 'SDsd', '09/04/2019', '6 avril 2019', 797471148, 'Homme', 'sdsdqs'),
(22, 'sds', 'dqsd', '08/04/2019', '6 avril 2019', 797471148, 'Homme', 'dqsd'),
(23, 'sdqs', 'sdqs', '15/04/2019', '6 avril 2019', 797471148, 'Homme', 'dqsdqsd'),
(24, 'sdqs', 'sdqs', '15/04/2019', '6 avril 2019', 797471148, 'Homme', 'dqsdqsd'),
(25, 'fdgdf', 'dgdf', '', '9 avril 2019', 797471148, 'Homme', 'dgdg'),
(26, 'fdgdf', 'dgdf', '', '9 avril 2019', 797471148, 'Homme', 'dgdg'),
(27, 'dds', 'dsfd', '15/04/2019', '28 avril 2019', 797471148, 'Homme', 'dsfsdf'),
(28, 'yasfi', 'yasin', '08/04/2019', '28 avril 2019', 797471148, 'Homme', 'mosta 400'),
(29, 'oth', 'oth', '15/04/2019', '29 avril 2019', 797471148, 'Femme', 'df'),
(30, 'kfldjgld', 'dfsdf', '13/05/2019', '18 mai 2019', 782692788, 'Homme', 'dfsdf'),
(32, 'othmane', 'pt', '10/11/1995', '18 mai 2019', 797471148, 'Homme', 'mazagren');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `Id` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Prenome` varchar(50) NOT NULL,
  `N_Versment` int(50) NOT NULL,
  `Versment` int(50) NOT NULL,
  `Total` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`Id`, `Nome`, `Prenome`, `N_Versment`, `Versment`, `Total`) VALUES
(1, 'ds', 'sddsd', 2, 1, 12),
(2, 'ds', 'sdsd', 1, 1500, 4000),
(3, 'ds', 'sd', 2, 5000, 15000),
(4, 'dfsd', 'sdqs', 1, 1500, 3000),
(5, 'df', 'df', 1, 1500, 3000),
(6, 'othmane', 'ot', 1, 3000, 60000);

-- --------------------------------------------------------

--
-- Table structure for table `Renouveau`
--

CREATE TABLE `Renouveau` (
  `Id` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Date_rend` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Renouveau`
--

INSERT INTO `Renouveau` (`Id`, `Nome`, `Prenom`, `Date_rend`) VALUES
(1, 'fdg', 'gdfgdfg', '13/04/2019'),
(2, 'dgf', 'fdgfd', '25/04/2019'),
(3, 'dgf', 'fdgfd', '12/04/2019'),
(4, 'dgf', 'fdgfd', '22/04/2019'),
(5, 'dqd', 'qsd', '23/05/2019'),
(6, 'dqd', 'qsd', '15/06/2019'),
(7, 'dgf', 'fdgfd', '22/04/2019'),
(8, 'dgf', 'fdgfd', '10/04/2019'),
(9, 'dgf', 'fdgfd', '11/04/2019'),
(10, 'dgf', 'fdgfd', '29/04/2019'),
(11, 'dgf', 'fdgfd', '29/04/2019'),
(12, 'dgf', 'fdgfd', '29/04/2019'),
(13, 'dgf', 'fdgfd', '05/04/2019'),
(14, '', '', '13/04/2019'),
(15, '', '', '29/04/2019'),
(16, 'fdfg', 'gdfgdfg', '18/05/2019'),
(17, 'dfsd', 'sdqs', '11/05/2019'),
(18, 'df', 'df', '18/05/2019'),
(19, 'othmane', 'ot', '18/05/2019');

-- --------------------------------------------------------

--
-- Table structure for table `SuivrePations`
--

CREATE TABLE `SuivrePations` (
  `Id` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Date_nai` text NOT NULL,
  `Date_ajouter` text NOT NULL,
  `Tlephone` int(50) NOT NULL,
  `Actes` text NOT NULL,
  `Adresse` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `SuivrePations`
--

INSERT INTO `SuivrePations` (`Id`, `Nome`, `Prenom`, `Date_nai`, `Date_ajouter`, `Tlephone`, `Actes`, `Adresse`) VALUES
(1, 'fdg', 'gdfgdfg', '', '6 avril 2019', 797471148, '[Soin, Prothèses, Parodontologie, ODF]', 'dgfgdg'),
(2, 'dqd', 'qsd', '15/04/2019', '6 avril 2019', 797471148, '[Soin, Prothèses, Parodontologie, ODF]', 'qsdsq'),
(3, 'fhfgh', 'fghgfh', '', '6 avril 2019', 797471148, 'javafx.scene.control.ComboBox$ComboBoxSelectionModel@658b8756', 'hfghgf'),
(4, 'fdg', 'fdgfd', '', '6 avril 2019', 797471148, 'JFXComboBox', 'fdgfdgf'),
(5, 'dgf', 'fdgfd', '', '6 avril 2019', 797471148, 'Soin', 'dfg'),
(6, 'dgf', 'fdgfd', '16/04/2019', '28 avril 2019', 797471148, 'Prothèses', 'dfg'),
(7, 'fdfg', 'gdfgdfg', '28/05/2019', '17 mai 2019', 797485452, 'Soin', 'dfgfdgdfgdfgdfgfdgfdg'),
(8, 'ds', 'sdsd', '13/05/2019', '17 mai 2019', 797888541, 'Soin', 'dqsdq'),
(9, 'ds', 'sd', '', '18 mai 2019', 788856565, 'Soin', 'sqdqsd'),
(11, 'df', 'df', '06/05/2019', '18 mai 2019', 797471148, 'Soin', 'dsfd'),
(12, 'othmane', 'ot', '07/05/2019', '18 mai 2019', 782692788, 'Soin', 'ze');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Attendre`
--
ALTER TABLE `Attendre`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `Doctor`
--
ALTER TABLE `Doctor`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `historique`
--
ALTER TABLE `historique`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `Lifateau`
--
ALTER TABLE `Lifateau`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `MessageAdmin`
--
ALTER TABLE `MessageAdmin`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `MsgDOc`
--
ALTER TABLE `MsgDOc`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `NprPations`
--
ALTER TABLE `NprPations`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `Passions`
--
ALTER TABLE `Passions`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `Renouveau`
--
ALTER TABLE `Renouveau`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `SuivrePations`
--
ALTER TABLE `SuivrePations`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `Attendre`
--
ALTER TABLE `Attendre`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Doctor`
--
ALTER TABLE `Doctor`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `historique`
--
ALTER TABLE `historique`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `Lifateau`
--
ALTER TABLE `Lifateau`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `MessageAdmin`
--
ALTER TABLE `MessageAdmin`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=88;

--
-- AUTO_INCREMENT for table `MsgDOc`
--
ALTER TABLE `MsgDOc`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `NprPations`
--
ALTER TABLE `NprPations`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `Passions`
--
ALTER TABLE `Passions`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `Renouveau`
--
ALTER TABLE `Renouveau`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `SuivrePations`
--
ALTER TABLE `SuivrePations`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
