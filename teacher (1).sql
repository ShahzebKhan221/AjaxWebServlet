-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2022 at 11:19 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `teacherid` int(11) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL,
  `mobileno` varchar(12) DEFAULT NULL,
  `qualification` varchar(50) DEFAULT NULL,
  `designation` varchar(30) DEFAULT NULL,
  `specialization` varchar(100) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `joiningdate` date DEFAULT NULL,
  `currentstatus` varchar(10) DEFAULT NULL CHECK (`currentstatus` in ('Active','Close'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`teacherid`, `fname`, `lname`, `gender`, `address`, `city`, `pin`, `mobileno`, `qualification`, `designation`, `specialization`, `birthdate`, `joiningdate`, `currentstatus`) VALUES
(1, 'Abid', 'khan', 'Male', 'Address', 'bhopal', '765443', '90907878', 'graduate', 'HeadSports', 'Hockey', '1982-02-02', '2000-02-02', 'Close'),
(2, 'Aleem', 'Khan', 'Male', 'Arera Colony', 'Bhopal', '462001', '90907878', 'M.Tech', 'Maths Teacher', 'Maths', '1995-07-14', '2010-02-24', 'Active'),
(3, 'Malti', 'Sharma', 'Female', 'Lal Ghati', 'Indore', '4566777', '89897676', 'B.ed', 'English Teacher', 'Literature', '1993-02-12', '2014-04-12', 'Active'),
(4, 'Furqan ', 'Khan', 'Male', 'Jahangirabad', 'Bhopal', '462001', '89897676', 'B.com', 'Accounts Teacher', 'Accounts', '1994-05-09', '2017-07-05', 'Active'),
(5, 'Arshad', 'Khan', 'Male', 'Koh-e-Fiza', 'Bhopal', '462001', '7878565430', 'M.Com', 'HOD Accounts', 'Accounts', '1989-09-23', '2009-02-19', 'Active'),
(6, 'Anita', 'Gupta', 'Female', 'Nehru nagar', 'Bhopal', '462001', '8998675', 'M.sc Biology', 'Biology teacher', 'Biology', '1988-09-09', '2009-08-19', 'Active'),
(7, 'Akanshit', 'Gupta', 'Male', 'Lal Ghati', 'Bhopal', '462001', '9078976', 'M.A English', 'HOD English', 'Englsih litrature', '1995-04-05', '2017-03-08', 'Close'),
(8, 'Apoorva', 'Singh', 'Female', 'MP Nagar', 'Gwalior', '43221', '78785656', 'M.A Psychology', 'Head psychology', 'Psychology', '1995-06-09', '2014-03-15', 'Active'),
(9, 'Adifa', 'Khan', 'Female', 'Idgah hills', 'jabalpur', '5643', '90787654', 'B.A', 'Fine Arts Teacher', 'Fine Arts', '1989-05-12', '2009-07-15', 'Active'),
(10, 'Margret', 'James', 'Female', 'Platinum plaza', 'Tirur Kerela', '567889', '9086755', 'M.A Economics', 'HOD Economics', 'Economics', '1975-07-15', '1999-08-18', 'Active'),
(11, 'Rajesh', 'Sharma', 'Male', 'Panchvati', 'Bhopal', '462001', '8976546', 'Phd Eng Litrature', 'Principle', 'English Litrature', '1979-07-03', '2014-04-18', 'Active'),
(12, 'Amit ', 'Sharma', 'Male', 'NEhru Nagar', 'Bhopal', '462001', '89897676', 'M.A', 'History Teacher', 'History&Economics', '1980-04-02', '2002-07-18', 'Active'),
(13, 'Umar', 'Khan', 'Male', 'Shyamla Hills', 'Bhopal', '462001', '89897676', 'P.hd Electical Engineering', 'Secratary', 'Maths', '1976-09-09', '1978-09-09', 'Active'),
(14, 'Vinod', 'Kumar', 'Male', '10number', 'Bhopal', '462001', '89897676', 'Graduate', 'Basketball Teacher', 'Basketball', '1990-06-23', '2009-05-14', 'Close'),
(78, 'Zainab', 'Saify', 'Female', 'Noor Mahal', 'Burhanpur', '887766', '99887', 'BA', 'Faculty', 'History', '1998-02-07', '2022-02-07', 'Active'),
(79, 'Parizaad', 'Mir', 'Male', 'RawalPindi', 'Lahore', '9875', '8764543', 'MA Urdu', 'HOD urdi', 'Urdu', '1995-03-08', '2010-08-07', 'Close'),
(80, 'Furqan ', 'Khan', 'Male', 'jahangirabad', 'Bhopal', '462001', '987654', 'Bcom', 'Faculty', 'Java', '2000-08-09', '2022-02-03', 'Active'),
(81, 'Arham ', 'Qamar', 'Male', 'New Market', 'Jabalpur', '76544', '897645', 'B.tech', 'Faculty', 'Electronics', '1995-05-07', '2022-06-14', 'Active'),
(82, 'Sultana', 'Khan', 'female', 'Ginnori', 'Bhopal', '462001', '7678543', 'Phd Urdu', 'Urdu HOD', 'Urdu', '1961-05-07', '2000-02-05', 'Active'),
(83, 'Dr.Rajesh', 'Vishkarma', 'Male', 'Govindpura', 'Bhopal', '462001', '98674543', 'Phd English', 'Principle', 'Enlish Grammer', '1970-07-21', '2014-05-22', 'Active'),
(84, 'Sunita', 'Williams', 'female', 'Shyamla Hills', 'Bhopal', '462001', '7656232', 'Msc Physics', 'Physics Department', 'Physics', '1976-07-15', '2006-10-25', 'Active'),
(85, 'Anita', 'Pashupal', 'Female', 'Kali Ghati', 'bhopal', '462001', '78546', 'MA', 'Faculty', 'Literature', '1983-11-17', '2012-10-25', 'Active'),
(86, 'Alakh', 'Pandey', 'Male', 'Nehru Nagar', 'Bhopal', '462001', '76542323', 'M.sc', 'HOD', 'Physics', '1974-06-17', '2011-06-24', 'Active'),
(87, 'Farha', 'khan', 'Female', 'Jahnagirabad', 'Bhopal', '462001', '78765443', 'M.com', 'Faculty', 'Business', '1978-11-16', '2019-06-12', 'Active'),
(88, 'Sandeep', 'Dubey', 'Male', 'Arera Colony', 'Bhopal', '462001', '89765423', 'Phd English', 'HOD English', 'Literature', '1981-06-10', '2014-06-20', 'Active'),
(89, 'Sonam', 'Kapoor', 'Female', 'Kolaba', 'Mumbai', '78654', '78565423', 'BA', 'Acting Teacher', 'Acting ', '1967-06-15', '2010-06-11', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`teacherid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `teacherid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=90;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
