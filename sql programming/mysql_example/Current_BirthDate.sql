delimiter //
create function age_birthdate(birth_Year int ,current_year int)
returns integer
deterministic
begin
declare age_birthdate integer;
set  age_birthdate= current_year- birth_year;
 return age_birthdate;
end 
//
delimiter ;
 



