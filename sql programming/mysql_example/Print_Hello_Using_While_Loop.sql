use sakila
delimiter //
create Procedure ABC5()
BEGIN
declare i int;
set i=0;
while i<hello do 
set i=i+1;
end while;
select hello;
END
//
delimiter ;
CALL ABC5()