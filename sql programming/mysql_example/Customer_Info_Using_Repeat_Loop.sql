use bank;
drop table NewCustomer

create table NewCustomer1
(
  Custmer_name char (6),
  Customer_city char (8)
);
delimiter //
CREATE PROCEDURE my_cursor3(c_name char(20),c_city char(20))
BEGIN
declare i varchar(100);
declare c_name,c_city char(20);
declare my_cursor CURSOR for
select c_name,c_city from Customer;
declare continue handler for NOT FOUND set i =1;
open my_cursor;
repeat
fetch my_cursor into c_name,c_city;
insert into newCustomer values(c_name, c_city);
until i=1
end repeat;
END;
// delimiter ;
select * from newCustomer