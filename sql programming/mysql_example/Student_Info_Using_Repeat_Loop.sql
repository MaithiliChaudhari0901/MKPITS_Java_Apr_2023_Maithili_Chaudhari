use college;
drop table Student

create table Student
(
  stud_name char (6),
  stud_city char (8)
);
delimiter //
CREATE PROCEDURE my_cursor2(s_name char(20),s_city char(20))
BEGIN
declare i varchar(100);
declare s_name,s_city char(20);
declare my_cursor CURSOR for
select s_name,s_city from Student;
declare continue handler for NOT FOUND set i =1;
open my_cursor;
repeat
fetch my_cursor into s_name,s_city;
insert into newStudent values(s_name, s_city);
until i=1
end repeat;
END;
// delimiter ;

select * from Student