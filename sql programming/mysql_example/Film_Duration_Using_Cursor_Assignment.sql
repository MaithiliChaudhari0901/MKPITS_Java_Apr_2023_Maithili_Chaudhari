use sakila;
 select * from film;
 create table duration(
   movie_rental_duration varchar(100)
) ;
 delimiter //
create procedure film_rental_duration()
begin
declare i varchar(500);
declare my_cursor CURSOR for
SELECT SUM(rental_duration)
FROM film
where film_id=film_id;
 open my_cursor;
      fetch my_cursor into i;
      insert into duration values (i);
      close my_cursor;
      end ;
      //
      delimiter ;
      
      
     call film_rental_duration();
     select * from duration 
