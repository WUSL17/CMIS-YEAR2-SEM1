create table Customer (
	customerID int(4) primary key,
	customerName varchar(50),
	contactName varchar(50),
	address varchar(50),
	city varchar(50),
	postalCode varchar(10),
	country varchar(20)
);


insert into Customer
values (1,'Chamod','Chamod', 'Weniwelpitiya','Horana','12538','Sri Lanka'),
(2,'Lavanga','Lava','Bandaranayaka Mawatha','Kegalle','12345','Sri Lanka');
