
--
-- Database: `clinic_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `clinic_user`
--

CREATE TABLE IF NOT EXISTS `clinic_user` (
  `clinic_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `mapped_dt` datetime DEFAULT NULL,
  `updated_dt` timestamp NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `status` varchar(2) DEFAULT 'A',
  `updated_by` int(11) DEFAULT '1',
  `created_by` int(1) DEFAULT '1',
  KEY `clinic_id` (`clinic_id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Constraints for table `clinic_user`
--
ALTER TABLE `clinic_user`
  ADD CONSTRAINT `clinic_user_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  ADD CONSTRAINT `clinic_user_ibfk_1` FOREIGN KEY (`clinic_id`) REFERENCES `clinic` (`id`);


