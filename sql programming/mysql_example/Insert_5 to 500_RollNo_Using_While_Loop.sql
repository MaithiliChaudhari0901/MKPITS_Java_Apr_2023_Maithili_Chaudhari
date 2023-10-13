use sakila
show tables;
create table RollNumbers (
rollno int
)
delimiter //
 CREATE PROCEDURE Roll_Num1()
   BEGIN
   declare rn int;
   set rn=5;
   while rn<500 do
   insert into RollNumbers values(rn);
   set rn=rn+5;
   end while;
   END
   //
   delimiter ;
   CALL Roll_Num1();
   select * from RollNumbers 