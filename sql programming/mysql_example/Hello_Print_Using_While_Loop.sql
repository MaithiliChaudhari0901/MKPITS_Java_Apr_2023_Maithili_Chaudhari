use sakila
delimiter //
create Procedure ABC3()
BEGIN
declare i int;
set i=0;
while i<10 do 
set i=i+1;
end while;
select hello;
END
//
delimiter ;
CALL ABC3()
