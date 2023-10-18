
use sakila;
drop table sales1
CREATE TABLE sales1 (
  sales_name varchar(40),
  sales_id  varchar (50),
  sales_price  varchar (10)
  )

insert into sales1 values ('cooler','45','12000');
insert into sales1 values ('fridge','50','14000');
insert into sales1 values ('washingmachine','55','15000');
insert into sales1 values ('shooes','30','5000');
select * from sales1;
