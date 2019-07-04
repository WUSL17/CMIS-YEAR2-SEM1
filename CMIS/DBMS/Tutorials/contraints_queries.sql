USE U172117;

CREATE TABLE Person(
	id INT(11) NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(222) NOT NULL, 
	last_name VARCHAR(222) NOT NULL,
	address VARCHAR(222) NOT NULL,
	city VARCHAR(222) NOT NULL,
	PRIMARY KEY(id)
);

INSERT INTO Person VALUES 
(2,'vikas','sharma','mohail','mohal'),
(3, 'jaskaran','singhe','mullaput','mohail');

CREATE TABLE IF NOT EXISTS `Orders`(
	id INT(11) NOT NULL AUTO_INCREMENT,
	order_no INT(11) NOT NULL,
	person_id INT(11) NOT NULL,
	PRIMARY KEY(id),
	KEY orders_ibfk_1(person_id)
);

ALTER TABLE orders
ADD CONSTRAINT orders_ibfk_1 FOREIGN

CREATE TABLE IF NOT EXISTS books(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(10) NOT NULL
);

LOAD DATA LOCAL INFILE "/home/u172117/Desktop/books.txt" INTO TABLE books;
