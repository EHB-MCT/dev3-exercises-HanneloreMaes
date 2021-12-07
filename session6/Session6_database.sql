/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE TABLE `S6_rides` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `train_id` int(11) DEFAULT NULL,
  `time_depart` datetime DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

CREATE TABLE `S6_trains` (
  `id` int(11) NOT NULL,
  `type` varchar(255) NOT NULL,
  `city_A` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `city_B` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `max_passengers` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `S6_rides` (`id`, `train_id`, `time_depart`) VALUES
(1, 1, '2022-12-10 09:00:00');
INSERT INTO `S6_rides` (`id`, `train_id`, `time_depart`) VALUES
(2, 3, '2021-11-23 15:45:00');
INSERT INTO `S6_rides` (`id`, `train_id`, `time_depart`) VALUES
(3, 2, '2021-11-23 15:45:00');
INSERT INTO `S6_rides` (`id`, `train_id`, `time_depart`) VALUES
(4, 1, '2021-11-23 15:34:00'),
(5, 1, '2021-11-23 15:30:00');

INSERT INTO `S6_trains` (`id`, `type`, `city_A`, `city_B`, `max_passengers`) VALUES
(1, 'IC', 'Brussel', 'Asse', 750);
INSERT INTO `S6_trains` (`id`, `type`, `city_A`, `city_B`, `max_passengers`) VALUES
(2, 'IC', 'Halle', 'Leuven', 800);
INSERT INTO `S6_trains` (`id`, `type`, `city_A`, `city_B`, `max_passengers`) VALUES
(3, 'P', 'Antwerpen-Centraal', 'Genk', 700);


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;