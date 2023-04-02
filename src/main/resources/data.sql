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
("leif","1234"),
("lisa", "5678"),
("johan", "asdf"),
("marcus", "zxcv");


INSERT INTO invoice(id_coworker,title, description, category, price,created_at)
VALUES
("marcus","food", "lunch meeting", "work",60,now()),
("lisa","over time", "over time 3 hours", "work",300,now()),
("leif","travel", "from gothenburg to luleå", "travel expenses",100,now()),
("johan","report ill", "broken arm", "sickness benefit",500,now());







