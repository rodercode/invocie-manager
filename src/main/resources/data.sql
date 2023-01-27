DROP TABLE IF EXISTS coworker;
DROP TABLE IF EXISTS invoice;

CREATE TABLE coworker (
username VARCHAR(55) PRIMARY KEY,
password VARCHAR(55)
);

CREATE TABLE invoice(
id INT AUTO_INCREMENT PRIMARY KEY,
id_coworker VARCHAR(55),
title VARCHAR(255),
description VARCHAR(255),
category VARCHAR(255),
price INT,
created_at date
);

INSERT INTO coworker(username, password)
VALUES
("leif","stockholmärmitthjärta"),
("lisa", "glenfrångöteborg"),
("johan", "kaffeärbäst"),
("marcus", "norrlandärguld");


INSERT INTO invoice(id_coworker,title, description, category, price,created_at)
VALUES
("marcus","mat", "LunchMöte", "Möte",60,now()),
("lisa","övertid", "jobbat över 3 timmar", "övertid",300,now()),
("leif","resa", "från göteborg till luleå", "resersättning",100,now()),
("johan","sjuk", "skada i armen", "sjukersättning",500,now());







