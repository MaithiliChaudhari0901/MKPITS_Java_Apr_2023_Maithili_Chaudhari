create database marketing;
use marketing;
drop table product;
create table product (
product_id char (200),
product_name varchar (200),
product_quantity char (100)
)
select * from product;
INSERT INTO product VALUES('101', 'laptop','40');
INSERT INTO product VALUES('102', 'TV','20');
INSERT INTO product VALUES('103', 'fridge','30');
INSERT INTO product VALUES('104', 'gas','50');

drop table sales;
create table sales (
			product_id char(200),
            sales_id char (200),
            sales_name varchar (200),
            product_quantity char (100)
            )
select * from sales;

INSERT INTO sales VALUES('104', '2001','gas','5')


drop trigger after_sale_trigger 

delimiter //

CREATE TRIGGER after_sale_trigger AFTER  INSERT ON sales
for each row 
begin
-- update the product stock after a sale
update product
set product_quantity =product_quantity-new.product_quantity
where product_id= new.product_id;
end;
//
delimiter ;

select * from product
