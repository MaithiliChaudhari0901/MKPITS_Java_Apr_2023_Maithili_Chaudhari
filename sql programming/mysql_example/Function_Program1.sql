drop function reverse_string
delimiter //
 create function reverse_string(r_string varchar(100))
 returns varchar(100)
 deterministic
 begin
 declare string_name varchar(100);
 set string_name = reverse(r_string);
 return string_name;
 end;
 // delimiter ;
 
 
 select reverse_string("maithili") ;
