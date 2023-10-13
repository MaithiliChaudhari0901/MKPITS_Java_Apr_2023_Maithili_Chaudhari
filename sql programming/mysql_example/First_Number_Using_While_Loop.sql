use sakila
delimiter //
create Procedure ABC1()
BEGIN
declare i int;
set i=0;
while i<10 do 
set i=i+1;
end while;
select i;
END
//
delimiter ;
CALL ABC1()