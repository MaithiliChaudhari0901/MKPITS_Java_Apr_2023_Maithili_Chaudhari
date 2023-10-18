use sakila;
create table product (
product_id char (200),
product_name varchar (200),
product_quantity char (100)
)
select * from product;
INSERT INTO product VALUES('101', 'mixer','40');
INSERT INTO product VALUES('102', 'shooes','20');
INSERT INTO product VALUES('103', 'fridge','30');
INSERT INTO product VALUES('104', 'washingmachine','50');