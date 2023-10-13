use sakila
delimiter //
create Procedure factorial2 (n int)
BEGIN
declare i int;
declare f int;
set i=1;
set f=1;
 basic:loop 
set f=f*i;
set i=i+1;
if i=10 then 
leave basic;
end if;
set i=i+1;
end loop;
select f;
END;
//
delimiter ;
CALL factorial2(5)
