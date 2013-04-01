CREATE schema 'clinic_system';
CREATE  TABLE `clinic_system`.`clinic` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cl_name` VARCHAR(45) NULL ,
  `cl_code` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) ) ;