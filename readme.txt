README
This is a simple Java Spring boot application exposing a Java rest api that can create users and store them in a database.

SOFTWARE REQUIREMENTS
MYSQL database server community version (including mysql workbench)
IDE
Spring Boot
Maven

CREATE THE DATABASE
Paste the below sql statement below into mysql workbench
CREATE TABLE `users`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));


DATABASE DETAILS
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3360/users
spring.datasource.username=root
spring.databasesource.password=Selfex15
spring.jpa.show-sql=true
