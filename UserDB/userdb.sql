CREATE USER 'ohgiraffers'@'%' IDENTIFIED BY 'ohgiraffers';
SHOW databases;
USE mysql;
SELECT * FROM USER;
DROP DATABASE cinemadb;

CREATE DATABASE cinemadb;
GRANT ALL PRIVILEGES ON cinemadb.* TO 'ohgiraffers'@'%';
SHOW GRANTS FOR 'ohgiraffers'@'%';
USE userdb;
SHOW TABLES;

select * from users;
DROP TABLE IF EXISTS users;
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);
INSERT INTO users (username, password, email, created_at)
VALUES ('jeonghoon', '1234', 'jeonghoon@example.com', '2025-11-09 22:01:13'),
('a', 'a', 'test@test', '2025-11-14 22:01:13');

SELECT user_id, username, password, email, created_at
FROM users
WHERE username = 'jeonghoon';

