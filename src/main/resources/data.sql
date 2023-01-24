DROP TABLE IF EXISTS coworker;

CREATE TABLE coworker (
id INT auto_increment PRIMARY KEY,
username VARCHAR(255),
password VARCHAR(255));

INSERT INTO coworker(username, password)
VALUES
    ("leif","stockholmärmitthjärta"),
    ("lisa", "glenfrångöteborg"),
    ("johan", "kaffeärbäst");
