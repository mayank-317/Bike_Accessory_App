-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 29, 2022 at 04:53 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bike_accessories`
--

-- --------------------------------------------------------

--
-- Table structure for table `accessory`
--

CREATE TABLE `accessory` (
  `id` varchar(20) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `model` varchar(40) NOT NULL,
  `accessory_name` varchar(40) NOT NULL,
  `accessory_price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `accessory`
--

INSERT INTO `accessory` (`id`, `brand`, `model`, `accessory_name`, `accessory_price`) VALUES
('4209174', 'yamaha', 'r15', 'crash guard', 998),
('4202028', 'TVS', 'Apache rtr 2004v', 'Exhaust', 4899),
('4209264', 'Bajaj', 'ns200', 'mirror', 899),
('4209372', 'Kawasaki', 'Z900', 'Crash Guard', 6000),
('4201937', 'Kawasaki', 'z900', 'Heat Shield', 12990);

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `saleid` varchar(10) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `model` varchar(40) NOT NULL,
  `accessory` varchar(40) NOT NULL,
  `quantity` varchar(10) NOT NULL,
  `price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`saleid`, `brand`, `model`, `accessory`, `quantity`, `price`) VALUES
('5455816', 'TVS', 'Apache rtr 2004v', 'Exhaust', '3', '14250.0'),
('5455816', 'Bajaj', 'ns200', 'mirror', '5', '4850.0'),
('5455816', 'Kawasaki', 'Z900', 'Crash Guard', '4', '24180.0'),
('5457687', 'yamaha', 'r15', 'crash guard', '1', '1172.3'),
('5457687', 'TVS', 'Apache rtr 2004v', 'Exhaust', '10', '49470.0'),
('5452471', '', '', '', '3', '37620.0'),
('5452471', 'TVS', 'Apache rtr 2004v', 'Exhaust', '4', '19380.0');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `purchaseid` int(11) NOT NULL,
  `product` varchar(50) NOT NULL,
  `price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`purchaseid`, `product`, `price`, `quantity`, `amount`) VALUES
(9243013, 'HEAD LIGHT GRILL TYPE 4A BLACK', 1599, 1, 1599),
(9243013, 'CRASH GUARD FOR Z900 2017-2019', 6000, 1, 6000),
(9243013, 'CRASH GUARD DUKE200 BS6', 4800, 2, 9600),
(9242550, 'HEAD LIGHT GRILL TYPE 4A BLACK', 1599, 1, 1599),
(9242550, 'CRASH GUARD BLACK DOMINAR400', 4800, 1, 4800),
(9242550, 'SADDLESTAY G310GS', 1700, 1, 1700),
(9242550, 'CRASH GUARD DUKE200 BS6', 4800, 3, 14400),
(9242270, 'FOG LIGHT MOUNT HIMALAYAN BS6', 699, 1, 699),
(9242270, 'FRONT FLUID RESERVOIR COVER ', 599, 1, 599),
(9246898, 'FOG LIGHT MOUNT HIMALAYAN BS6', 699, 1, 699),
(9246898, 'FRONT FLUID RESERVOIR COVER ', 599, 1, 599);

-- --------------------------------------------------------

--
-- Table structure for table `carttotal`
--

CREATE TABLE `carttotal` (
  `cartid` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `carttotal`
--

INSERT INTO `carttotal` (`cartid`, `total`, `name`) VALUES
(9243013, 17199, 'Mayank Warkade'),
(9242550, 22499, 'Rohit Sharma'),
(9242270, 1298, 'Mohit'),
(9246898, 1298, 'Virat');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `age` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `address` varchar(80) NOT NULL,
  `city` varchar(40) NOT NULL,
  `pincode` varchar(20) NOT NULL,
  `aadhar` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `gender`, `age`, `dob`, `mobile`, `email`, `address`, `city`, `pincode`, `aadhar`) VALUES
('3171064', 'Mayank Warkade', 'Male', '18', '31-07-2003', '8830079582', 'mayankwarkade317@gmail.com', 'Mahal Ward', 'Bhandara', '441904', '779821083025'),
('3171522', 'Rohit Sharma', 'Male', '18', '19-11-1996', '9878768760', 'rohit68@gmail.com', 'Ram nagar', 'Mumbai', '400040', '457798987958'),
('3174740', 'Virat Kohli', 'Male', '32', '18-11-1988', '9673423673', 'virat87@gma', 'ram nagar', 'Delhi', '440045', '873445233521'),
('3176861', 'Neha Thakur', 'Female', '19', '19-11-2002', '9767458357', 'nehathakuer17@gmail.com', 'Khat Road', 'Chennai', '400089', '568468356886'),
('3177975', 'Neha Sharma', 'Female', '18', 'Jul 17, 2003', '9858754164', 'nehasharma@gmail.com', 'plot no. 17, Civil Line ', 'Nagpur', '441003', '987439873498'),
('3178941', 'Mark Cuban', 'Male', '63', 'Jul 30, 1958', '8799864429', 'mark77@gmail.com', '500 Preston Hollow', 'Dallas', '75001', '988934982035');

-- --------------------------------------------------------

--
-- Table structure for table `dealer`
--

CREATE TABLE `dealer` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `address` varchar(50) NOT NULL,
  `city` varchar(20) NOT NULL,
  `pincode` varchar(10) NOT NULL,
  `agency` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dealer`
--

INSERT INTO `dealer` (`id`, `name`, `mobile`, `email`, `address`, `city`, `pincode`, `agency`) VALUES
('2645223', 'Mayank Warkade', '8830079582', 'mayank999@gmail.com', 'mahal ward', 'Bhanadara', '441904', 'bikersworld'),
('2642113', 'AK sharma', '7689656568', 'aksharma@gmail.com', 'library square', 'Delhi', '400853', 'AkWorld'),
('2642573', 'Raj Neware', '8467896595', 'rajneware@gmail.com', 'Ravi Nagar', 'Nagpur', '400417', 'Raj Export'),
('264123', 'Robin', '9879684375', 'robin76@gmail.com', '77,Ram nagar', 'Noida', '448890', 'Robin Hood'),
('2646030', 'Varun Dhawan', '8379832998', 'varund@gmail.com', '44 East Andheri', 'Mumbai', '400047', 'Motoroid');

-- --------------------------------------------------------

--
-- Table structure for table `finalbill`
--

CREATE TABLE `finalbill` (
  `id` int(20) NOT NULL,
  `total` varchar(20) NOT NULL,
  `custid` int(20) NOT NULL,
  `custname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `finalbill`
--

INSERT INTO `finalbill` (`id`, `total`, `custid`, `custname`) VALUES
(5455816, '43280', 3171064, 'Mayank Warkade'),
(5457687, '50642.3', 3171522, 'Rohit Sharma'),
(5452471, '57000.0', 3177975, 'Neha Sharma');

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `id` int(10) NOT NULL,
  `dealerid` int(10) NOT NULL,
  `agency_name` varchar(40) NOT NULL,
  `accessoryid` int(10) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `brandmodel` varchar(40) NOT NULL,
  `accessoryname` varchar(40) NOT NULL,
  `price` int(20) NOT NULL,
  `discount` int(20) NOT NULL,
  `quantity` int(20) NOT NULL,
  `bill` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`id`, `dealerid`, `agency_name`, `accessoryid`, `brand`, `brandmodel`, `accessoryname`, `price`, `discount`, `quantity`, `bill`) VALUES
(9283166, 2645223, 'bikersworld', 4209174, 'yamaha', 'r15', 'crash guard', 998, 0, 2, 3992),
(9284713, 2642113, 'AkWorld', 4202028, 'TVS', 'Apache rtr 2004v', 'Exhaust', 4899, 0, 20, 97980),
(9281879, 2645223, 'bikersworld', 4209264, 'Bajaj', 'ns200', 'mirror', 899, 0, 5, 4495),
(928445, 2642573, 'Raj Export', 4209372, 'Kawasaki', 'Z900', 'Crash Guard', 6000, 0, 20, 120000),
(9281675, 264123, 'Robin Hood', 4201937, 'Kawasaki', 'z900', 'Heat Shield', 12990, 8, 10, 119508);

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `Name` varchar(20) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Phonenumber` varchar(10) NOT NULL,
  `Emailaddress` varchar(40) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`Name`, `Username`, `Phonenumber`, `Emailaddress`, `Password`) VALUES
('Mayank Warkade', 'mayank', '8830079582', 'mayankwarkade317@gmail.com', '1234'),
('', '', '', '', ''),
('', '', '', '', ''),
('', '', '', '', ''),
('', '', '', '', ''),
('', '', '', '', ''),
('admin ', 'admin', '8978583628', 'admin999@gmail.com', '1234'),
('Rohit Sharma', 'hitman', '8947226036', 'rohit264@gmail.com', '1234'),
('', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `sale`
--

CREATE TABLE `sale` (
  `id` int(10) NOT NULL,
  `customerid` int(20) NOT NULL,
  `customername` varchar(20) NOT NULL,
  `purchaseid` int(10) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `model` varchar(20) NOT NULL,
  `accessory` varchar(40) NOT NULL,
  `purchaseprice` int(20) NOT NULL,
  `saleprice` int(20) NOT NULL,
  `quantity` int(20) NOT NULL,
  `total` int(20) NOT NULL,
  `discount` int(20) NOT NULL,
  `gst` int(20) NOT NULL,
  `bill` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`id`, `customerid`, `customername`, `purchaseid`, `brand`, `model`, `accessory`, `purchaseprice`, `saleprice`, `quantity`, `total`, `discount`, `gst`, `bill`) VALUES
(5451749, 3177616, 'mayank', 9283166, 'yamaha', 'r15', 'crash guard', 998, 1000, 2, 2000, 10, 5, 1900);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
