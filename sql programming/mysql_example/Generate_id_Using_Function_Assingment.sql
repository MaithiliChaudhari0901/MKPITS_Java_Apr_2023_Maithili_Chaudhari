use sakila;
CREATE TABLE  my_function(
first_name varchar(20),
last_name varchar(20),
mobile varchar (10),
unique_id varchar (20)
);
delimiter //
create function Generates_Unique_ID1(first_name varchar(20), last_name varchar(20), mobile varchar(10) , unique_id varchar(20))
returns varchar(35)
deterministic
begin
declare Generates_Unique_customer_ID varchar(35) ;
 set Generates_Unique_customer_ID = concat(left(first_name,3),right(last_name,2),right(mobile,4),left(unique_id,9));
 return Generates_unique_customer_ID;
 end
 // delimiter ;

 
 select Generates_Unique_ID1("samiksha","chaudhari","6574342346","4805898532") as Generates_Unique_customer_ID1;

