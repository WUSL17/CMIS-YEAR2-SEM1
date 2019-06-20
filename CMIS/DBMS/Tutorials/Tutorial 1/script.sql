-- Create customer table
create table Customer (
	customerID int(4) primary key,
	customerName varchar(50),
	contactName varchar(50),
	address varchar(50),
	city varchar(50),
	postalCode varchar(10),
	country varchar(20)
);

-- Insert values
insert into Customer values 
(1,'Alfreds Futterkiste','Maria Anders','Obere Str. 57','Berlin','12209','Germany'),
(2,'Ana Trujilo Emparedados y helados','Ana Trujillo','Avda. de la Constitution 2222','Mexico D. F.','05021','Mexico'),
(3,'Anatonio Moreno Taqueria','Antonio Moreno','Mataderos 2312','Mexico D. F.','05023','Mexico'),
(4,'Around the Horn','Thomas Hardy','120 Hanover Sq.','London','WA1 1DP','UK'),
(5,'Berglunds Snabbkop','Christina Berglund','Berguvsvagen 8','Lulea','S-958 22','Sweden');

-- Update values
update Customer 
set contactName = 'Johana Tennison'
where customerID = 1;

-- Add Column as DOB
