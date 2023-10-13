use sakila
delimiter //
create Procedure ABC3()
BEGIN
declare i int;
set i=0;
xyz:loop 
set i=i+1;
select hello;
if i>=hello then
leave xyz;
end if;
end loop;
END
//
delimiter ;
CALL ABC3()



  
  
 
      
  
  
  
 