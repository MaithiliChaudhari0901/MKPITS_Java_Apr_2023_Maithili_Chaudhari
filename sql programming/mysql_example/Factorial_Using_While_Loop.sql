use sakila
delimiter //
create Procedure factorial3 (n int)
BEGIN
declare i int;
declare f int;
set i=1;
set f=1;
 while i<10 do 
set f=f*i;
set i=i+1;
end while;
set i=i+1;
select f;
END;
//
delimiter ;
CALL factorial3(5)