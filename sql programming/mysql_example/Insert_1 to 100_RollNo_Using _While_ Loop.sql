use sakila
show tables;
create table RollNumbers (
rollno int
)
delimiter //
 CREATE PROCEDURE Roll_Num()
   BEGIN
   declare rn int;
   set rn=1;
   while rn<100 do
   insert into RollNumbers values(rn);
   set rn=rn+1;
   end while;
   END
   //
   delimiter ;
   CALL Roll_Num();
   select * from RollNumbers 