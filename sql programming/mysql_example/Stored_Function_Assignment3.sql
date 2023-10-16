
drop function string_revarsal
delimiter //
create function string_revarsal(reverse_string int)
returns integer
deterministic
begin 
 declare string_name int;
 set string_name = reverse(reverse_string);
 return string_reversal;
end
//
delimiter ;
select string_reversal("maithili") ;