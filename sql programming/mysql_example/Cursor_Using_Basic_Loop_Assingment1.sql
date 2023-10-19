use sakila
 select * from customer
 select * from address

drop table newCustomer
create table newCustomer4
   (
       
       C_name varchar(500),
       customer_address varchar(500)
       ) ;
     
     drop procedure customer_info2  
delimiter //
    create procedure customer_info2()
    begin
    DECLARE done varchar(500);
     declare n,c varchar(500);
    declare myCursor CURSOR for
    select c_name,c_address from Customer;
   FROM sakila.customer, sakila.address;
   declare continue handler for NOT FOUND set done=1;
     open myCursor;
      basic: loop
      fetch myCursor into c_name,c_address;
      insert into newCustomer values (c_name,c_address);
      if done=1 then
      leave basic;
      end if;
      end loop;
      close myCursor;
      end ;
      // delimiter ;
     
      call  customer_info2();
      select * from newCustomer

