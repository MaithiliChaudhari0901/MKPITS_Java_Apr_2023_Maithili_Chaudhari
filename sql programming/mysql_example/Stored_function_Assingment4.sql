drop function cal_BMI
delimiter //
create function cal_BMI( height int,weight int)
returns integer
deterministic
begin 
 declare person_name int;
 set  person_name = weight / sqrt(height);
 return person_name;
end
//
delimiter ;

select cal_BMI(34,6)