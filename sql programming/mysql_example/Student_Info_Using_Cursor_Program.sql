
use college;
drop table Student

create table Student
(
  stud_name char (6),
  stud_city char (8)
);
delimiter //
CREATE PROCEDURE my_cursor(s_name char(20),s_city char(20))
BEGIN
declare done varchar(100);
declare s_name,s_city char(20);
declare my_cursor CURSOR for
select s_name,s_city from Student;
declare continue handler for NOT FOUND set done =1;
open my_cursor;
basic : loop
fetch my_cursor into s_name,s_city;
insert into newStudent values (s_name ,s_city);
if done =1 then
leave basic;
end if;
end loop;
close my_cursor;
END
// delimiter ;