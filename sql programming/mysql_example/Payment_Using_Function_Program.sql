use sakila
select * from payment

delimiter //
create function myFun2 (cust_id int)
returns integer
 deterministic
begin
declare amt int ;
select sum(amount) into amt from payment
 where customer_id=cust_id;
 return amt;
 end
 //
 delimiter ;
 
select myFun2(2)