CREATE TABLE t_account(
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(60) UNIQUE NOT NULL,
  balancy DOUBLE(7,2) DEFAULT 0
 )ENGINE=INNODB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8mb4;