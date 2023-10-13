use sakila
delimiter //
create Procedure ABC()
BEGIN
declare i int;
set i=0;
xyz:loop 
set i=i+1;
select i;
if i>=10 then
leave xyz;
end if;
end loop;
END
//
delimiter ;
CALL ABC()



  
  
 
      
  
  
  
 