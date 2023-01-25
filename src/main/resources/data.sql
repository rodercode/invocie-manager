DROP TABLE IF EXISTS coworker;

CREATE TABLE coworker (
username VARCHAR(55) PRIMARY KEY,
password VARCHAR(55)
);

INSERT INTO coworker(username, password)
VALUES
    ("leif","stockholmärmitthjärta"),
    ("lisa", "glenfrångöteborg"),
    ("johan", "kaffeärbäst"),
    ("marcus", "norrlandärguld");




