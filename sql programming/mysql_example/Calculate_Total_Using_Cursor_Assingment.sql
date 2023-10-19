use sakila;
select * from payment
select * from rental
select * from customer
create table new_customer1
   (
	total_fees int
) ;
     drop procedure customer_payment  
    delimiter //
    create procedure customer_payment(in cust_id int)
    begin
    declare i varchar(500);
    declare my_cursor CURSOR for
   select sum(payment)
 From payment 
 where customer_id=cust_id;
 open my_cursor;
      fetch my_cursor into i;
      insert into new_customer1 values (i);
      close my_cursor;
      end ;
      //
      delimiter ;

call customer_payment(2);
SELECT * FROM new_customer1
    