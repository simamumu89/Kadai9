DROP TABLE IF EXISTS informations;

CREATE TABLE informations (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 diseasename VARCHAR(20) NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO informations (id,name,diseasename) VALUES (1, "shimamura", "liverDisease");
INSERT INTO informations (id,name,diseasename) VALUES (2, "tanaka", "HeartDisease");
INSERT INTO informations (id,name,diseasename) VALUES (3, "suzuki", "lungCancer");