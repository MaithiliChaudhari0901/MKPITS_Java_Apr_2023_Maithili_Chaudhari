use sakila
show tables
create table StudentDetails(
id int(),
name varchar (54),
adderss char(54),
);
create table MarksDetails(
marks_phy
marks_math
marks_chem
)

delimiter //
create procedure abc6(rn char,incr int)
begin
update MarksDetails set phy=phy+incr,chem=chem+incr,math=math+incr;
where RollNo =rn;
end;
// delimiter ;