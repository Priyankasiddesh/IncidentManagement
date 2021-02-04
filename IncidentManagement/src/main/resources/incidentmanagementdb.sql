CREATE DATABASE IncidentManagement;

CREATE TABLE `IncidentManagement`.`incidentmanagementdata` (
  `id` INT NOT NULL,
  `userEmail` VARCHAR(45) NULL,
  `applicationSection` VARCHAR(45) NULL,
  `issueDescription` VARCHAR(45) NULL,
  `issueTimeStamp` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
