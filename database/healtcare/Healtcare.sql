CREATE DATABASE healthcare;

use healthcare;

CREATE USER 'healthcare_user'@'localhost' IDENTIFIED BY 'Machine@1234';

GRANT ALL PRIVILEGES ON healthcare.* TO 'healthcare_user'@'localhost';
FLUSH PRIVILEGES;


SHOW DATABASES;

SHOW GRANTS FOR 'healthcare_user'@'localhost';

USE healthcare;
SHOW TABLES;

