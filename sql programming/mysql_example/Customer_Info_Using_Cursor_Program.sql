use bank
drop table newCustomer
create table newCustomer
   (
       
	customer_name char(15),
	customer_city char(15)
       ) ;
       
 delimiter //
    create procedure Customer_info()
    begin
    DECLARE done varchar(200);
    declare c_name,c_city varchar(20);
    declare my_cursor CURSOR for
      select c_name, c_city from customer;
      declare continue handler for NOT FOUND set done=1;
      open my_cursor;
      basic: loop
      fetch my_cursor into c_name,c_city;
      insert into newCustomer values (c_name,c_city);
      if done=1 then
      leave basic;
      end if;
      end loop;
      close my_cursor;
      end ;
      // delimiter ;
     
      select * from newCustomer

