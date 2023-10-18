create database college
use college
drop table student
create table Student2 (
Name char(20),
Roll_no varchar(20),
Branch char(20),
Mobile_no varchar(10)
)

select * from Student2
insert into student2 values('Naira','101','IT',7875013528);
insert into student2 values('Kirti','102','IT',9545063187);
insert into student2 values('Rahil','103','IT',9158941635);

create table MarksDetails (
Roll_no varchar(20),
Phy int,
Chem int,
Math int
)

select * from MarksDetails;
insert into MarksDetails values('101',76,78,77);
insert into MarksDetails values('102',67,65,85);
insert into MarksDetails values('103',70,75,90);

Create table TotalMarks (
Roll_no varchar(20),
Total int
)

Delimiter //
create TRIGGER my_trigger AFTER INSERT ON MarksDetails
for each row
begin
insert into TotalMarks value(new.Roll_no,new.Phy+new.Chem+new.Math);
end;
// delimiter ;

select * from marksDetails;
insert into MarksDetails values('104',60,75,80);

select * from TotalMarks

