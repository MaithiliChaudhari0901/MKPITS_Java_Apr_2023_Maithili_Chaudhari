use sakila
select * from film
select * from film_category
drop table film_info
create table film_info(
   Film_Title varchar(200),
	film_special_features varchar(300),
	film_rental_duration varchar (200),
	film_rating varchar(200)
       ) ;
     drop procedure Movie_Details
    delimiter //
    create procedure Movie_Details(in picture_id int)
    begin
    declare i,l,m,n varchar(500);
    declare my_cursor1 CURSOR for
    SELECT  title,special_features,rental_duration,rating From film
    where film_id=picture_id;
     open my_cursor1;
      fetch my_cursor1 into i,l,m,n;
      insert into film_info values (i,l,m,n);
      close my_cursor1;
      end ;
      // delimiter ;

call Movie_Details(1);
SELECT * from film_info
    
