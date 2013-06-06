
--
-- Database: `clinic_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `clinic_user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(50) NOT NULL,
  `mname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `status` varchar(2) NOT NULL,
  `created_dt` datetime DEFAULT NULL,
  `updated_dt` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;
--
-- Constraints for table `clinic_user`
--
ALTER TABLE `clinic_user`
  ADD CONSTRAINT `clinic_user_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  ADD CONSTRAINT `clinic_user_ibfk_1` FOREIGN KEY (`clinic_id`) REFERENCES `clinic` (`id`);


