CREATE TABLE Car (
  id    INT AUTO_INCREMENT PRIMARY KEY,
  make  VARCHAR(64),
  model VARCHAR(64),
  year  VARCHAR(32),
  color VARCHAR(32),
  ownerId INT REFERENCES Owner

);
CREATE TABLE Owner (
  ownerId    INT AUTO_INCREMENT PRIMARY KEY,
  name  VARCHAR(64)
);


INSERT INTO Car(make, model, year, color) VALUES ('a', 'b', '2000', 'd');
INSERT INTO Car(make, model, year, color) VALUES ('b', 'b', '2001', 'd');
INSERT INTO Car(make, model, year, color) VALUES ('c', 'b', '2002', 'd');
INSERT INTO Car(make, model, year, color) VALUES ('d', 'b', '2003', 'd');
INSERT INTO Car(make, model, year, color) VALUES ('e', 'b', '2004', 'd');
INSERT INTO Car(make, model, year, color) VALUES ('f', 'b', '2005', 'd');
INSERT INTO Car(make, model, year, color) VALUES ('g', 'b', '2006', 'd');
INSERT INTO Car(make, model, year, color) VALUES ('h', 'b', '2007', 'd');

INSERT INTO (make, model, year, color) VALUES ('h', 'b', '2007', 'd');