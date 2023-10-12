use sakila
delimiter //
create Procedure factorial1 (n int)
BEGIN
declare i int;
declare f int;
set i=1;
set f=1;
 repeat 
set f=f*i;
set i=i+1;
until i>n 
end repeat;
select f;
END
//
delimiter ;
CALL factorial1(5)

